import { Component } from '@angular/core';
import {IStudent} from './model/Student';
import {students} from './model/StudentRepository';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'my-project-demo';

  studentList =  students;

  student: IStudent;

  display(student: IStudent) {
    this.student = student;
  }

  createStudent($event: IStudent) {
    students.push({
      id: $event.id,
      name: $event.name,
      age: $event.age,
      avatarImg: $event.avatarImg,
      height: $event.height,
      sizeAvatar: $event.sizeAvatar,
    });
  }

  delete(id: number) {
    const index = students.findIndex(student => student.id === id);
    students.splice(index, 1);
  }

  hiddenS() {
    this.student = null;
  }
}
