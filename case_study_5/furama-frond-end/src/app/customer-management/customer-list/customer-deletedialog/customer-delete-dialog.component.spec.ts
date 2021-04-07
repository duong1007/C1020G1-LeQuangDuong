import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerDeletedialogComponent } from './customer-delete-dialog.component';

describe('CustomerDeletedialogComponent', () => {
  let component: CustomerDeletedialogComponent;
  let fixture: ComponentFixture<CustomerDeletedialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerDeletedialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerDeletedialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
