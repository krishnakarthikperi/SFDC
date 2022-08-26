import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab4problem1Component } from './lab4problem1.component';

describe('Lab4problem1Component', () => {
  let component: Lab4problem1Component;
  let fixture: ComponentFixture<Lab4problem1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Lab4problem1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lab4problem1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
