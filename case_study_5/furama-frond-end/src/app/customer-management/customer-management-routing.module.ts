import {RouterModule, Routes} from '@angular/router';

import {NgModule} from '@angular/core';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';

const routes: Routes = [
  {path: 'customer' , pathMatch: 'full', redirectTo: 'customer-list'},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerManagementRoutingModule {}
