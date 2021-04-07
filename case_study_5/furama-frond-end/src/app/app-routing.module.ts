import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {CustomerManagementRoutingModule} from './customer-management/customer-management-routing.module';
import {PageErrorComponent} from './page-error/page-error.component';
import {MaterialModule} from './material.module';


const routes: Routes = [
  {path: '' , pathMatch: 'full', redirectTo: 'home'},
  {path: 'home', component: HomeComponent},
  {path: '**', component: PageErrorComponent}
];

@NgModule({
  imports: [
    MaterialModule,
    CustomerManagementRoutingModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
