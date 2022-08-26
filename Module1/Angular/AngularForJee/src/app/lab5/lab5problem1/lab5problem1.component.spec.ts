import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab5problem1Component } from './lab5problem1.component';

describe('Lab5problem1Component', () => {
  let component: Lab5problem1Component;
  let fixture: ComponentFixture<Lab5problem1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Lab5problem1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lab5problem1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});