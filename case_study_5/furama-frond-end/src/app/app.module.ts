import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { PageErrorComponent } from './page-error/page-error.component';
import {CustomerManagementModule} from './customer-management/customer-management.module';
import {HttpClientModule} from '@angular/common/http';
import {CustomerService} from './customer-management/customer.service';
import { TooltipComponent } from './tooltip/tooltip.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    PageErrorComponent,
    TooltipComponent,
  ],
  imports: [
    BrowserModule,
    Ng2SearchPipeModule,
    AppRoutingModule,
    CustomerManagementModule,
    HttpClientModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
