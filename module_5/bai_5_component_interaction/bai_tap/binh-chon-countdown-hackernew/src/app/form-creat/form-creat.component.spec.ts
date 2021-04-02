import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCreatComponent } from './form-creat.component';

describe('FormCreatComponent', () => {
  let component: FormCreatComponent;
  let fixture: ComponentFixture<FormCreatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormCreatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormCreatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
