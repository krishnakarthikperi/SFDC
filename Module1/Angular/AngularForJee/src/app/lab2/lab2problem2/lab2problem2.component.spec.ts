import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab2problem2Component } from './lab2problem2.component';

describe('Lab2problem2Component', () => {
  let component: Lab2problem2Component;
  let fixture: ComponentFixture<Lab2problem2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Lab2problem2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lab2problem2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
