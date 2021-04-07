import { Component, OnInit } from '@angular/core';
import {ICustomer} from '../iCustomer';
import {CustomerService} from '../customer.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {CustomerDeleteDialogComponent} from './customer-deletedialog/customer-delete-dialog.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss'],
})
export class CustomerListComponent implements OnInit {



  customers: ICustomer[];
  term: string;
  p: string | number;

  constructor(private customerService: CustomerService,
              private dialog: MatDialog ) { }

  ngOnInit(): void {
    this.getCustomers();
  }

  getCustomers() {
    this.customerService.getCustomers().subscribe(data => {
      this.customers = data;
    });
  }

  openDialog(id): void {
    this.customerService.getCustomerById(id).subscribe(customer => {
      const dialogRef = this.dialog.open(CustomerDeleteDialogComponent, {
        width: '250px',
        data: customer
      });

      dialogRef.afterClosed().subscribe(result => {
        this.getCustomers();
      });
    });
  }
}
