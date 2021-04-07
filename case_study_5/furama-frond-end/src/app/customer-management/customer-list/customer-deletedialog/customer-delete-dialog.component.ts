import {Component, Inject, OnInit} from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {CustomerService} from '../../customer.service';

@Component({
  selector: 'app-customer-delete-dialog',
  templateUrl: './customer-delete-dialog.component.html',
  styleUrls: ['./customer-delete-dialog.component.scss']
})
export class CustomerDeleteDialogComponent implements OnInit {

  constructor(
    private dialogRef: MatDialogRef<CustomerDeleteDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private customerService: CustomerService) {}

  ngOnInit(): void {
    console.log(this.data);
  }

  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe();
  }
}
