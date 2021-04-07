import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { StudentListComponent } from './student-list/student-list.component';
import { CreateFormComponent } from './create-form/create-form.component';
import { LanguagesComponent } from './languages/languages.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    StudentListComponent,
    CreateFormComponent,
    LanguagesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
