import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab4problem2Component } from './lab4problem2.component';

describe('Lab4problem2Component', () => {
  let component: Lab4problem2Component;
  let fixture: ComponentFixture<Lab4problem2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Lab4problem2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Lab4problem2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
