import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab3problem1Component } from './lab3problem1.component';

describe('Lab3problem1Component', () => {
  let component: Lab3problem1Component;
  let fixture: ComponentFixture<Lab3problem1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Lab3problem1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lab3problem1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
