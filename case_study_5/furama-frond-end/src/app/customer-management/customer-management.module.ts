import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';
import {RouterModule} from '@angular/router';
import {CustomerManagementRoutingModule} from './customer-management-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import { CustomerDeleteDialogComponent } from './customer-list/customer-deletedialog/customer-delete-dialog.component';
import {MatDialogModule} from '@angular/material/dialog';
import {MatButtonModule} from '@angular/material/button';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';



@NgModule({
  declarations: [
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,
    CustomerDetailComponent,
    CustomerDeleteDialogComponent,
  ],
  imports: [
    CommonModule,
    RouterModule,
    CustomerManagementRoutingModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatInputModule,
    MatDialogModule,
    MatButtonModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ]
})
export class CustomerManagementModule { }
