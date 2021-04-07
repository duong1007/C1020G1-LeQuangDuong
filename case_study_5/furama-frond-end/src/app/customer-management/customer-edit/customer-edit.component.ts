import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ICustomerType} from '../iCustomerType';
import {ICustomer} from '../iCustomer';
import {CustomerService} from '../customer.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.scss']
})
export class CustomerEditComponent implements OnInit {

  formEditCustomer: FormGroup;
  customerTypes: ICustomerType[];
  idCustomer: any;
  maxDate = new Date();
  minDate = new Date(1900, 0, 1);

  constructor(private fcc: FormBuilder,
              private customerService: CustomerService,
              private router: Router,
              private activeRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.formEditCustomer = this.fcc.group({
      idCustomer: ['', [Validators.required, Validators.pattern(/^(KH-)\d{4}$/u)]],
      nameCustomer: ['', [Validators.required, Validators.pattern(/^([\p{Lu}]|([\p{Lu}][\p{Ll}]{1,8}))(\s([\p{Lu}]|[\p{Lu}][\p{Ll}]{1,10})){0,5}$/u)]],
      emailCustomer: ['', [Validators.required, Validators.email]],
      dateOfBirth: ['', Validators.required],
      customerType: [null, Validators.required],
      idCard: ['', [Validators.required, Validators.pattern(/^\d{9}$/u)]],
      phoneCustomer: ['', [Validators.required, Validators.pattern(/^(090|091|[(]84[+][)]90|[(]84+[)]91)\d{7}$/u)]],
      addressCustomer: ['', Validators.required],
    });

    this.getCustomerType();
    this.activeRouter.params.subscribe(data => {
      this.idCustomer = data.id;
      this.customerService.getCustomerById(this.idCustomer).subscribe(customer => {
        this.formEditCustomer.patchValue(customer);
      });
    });
  }

  compareFn(c1: ICustomerType, c2: ICustomerType): boolean {
    return c1 && c2 ? c1.idCustomerType === c2.idCustomerType : false;
  }

  submit() {
    this.customerService.editCustomer(this.formEditCustomer.value, this.idCustomer).subscribe(data => {
      this.router.navigateByUrl('customer-list');
    });
  }

  getCustomerType(){
    this.customerService.getCustomerType().subscribe(data => this.customerTypes = data);
  }

}
