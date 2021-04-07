import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../customer.service';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.scss']
})
export class CustomerDeleteComponent implements OnInit {

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
  }

  deleteCustomer(){
  }

}
