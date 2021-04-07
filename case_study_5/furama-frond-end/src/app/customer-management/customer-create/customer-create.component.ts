import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ICustomerType} from '../iCustomerType';
import {CustomerService} from '../customer.service';
import {ICustomer} from '../iCustomer';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {

  formCreateCustomer: FormGroup;
  customerTypes: ICustomerType[];
  maxDate = new Date();
  minDate = new Date(1900, 0, 1);

  constructor(private fcc: FormBuilder, private customerService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.formCreateCustomer = this.fcc.group({
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
  }

  submit() {
    console.log(this.formCreateCustomer.controls);
    this.customerService.addNewCustomer(this.formCreateCustomer.value).subscribe(data => {
      this.router.navigateByUrl('customer-list');
    });
  }

  getCustomerType(){
    this.customerService.getCustomerType().subscribe(data => this.customerTypes = data);
  }
}
