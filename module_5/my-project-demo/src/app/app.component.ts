import { Component } from '@angular/core';
import {IStudent} from './model/Student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'my-project-demo';

  student: IStudent;

  hiddenStudent = false;

  searchInStudent(searchStudent: IStudent) {
    this.student = searchStudent;
    this.hiddenStudent = true;
  }

  hiddenS() {
    this.hiddenStudent = false;
  }
}
