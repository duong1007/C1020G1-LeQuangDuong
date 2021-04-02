import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {students} from '../model/StudentRepository';
import {IStudent} from '../model/Student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.scss']
})
export class StudentListComponent implements OnInit {

  studentList = students;
  iStudent: IStudent;
  @Output() searchStudent = new EventEmitter<IStudent>();
  constructor() { }

  ngOnInit(): void {
  }

  display(student: IStudent) {
    this.iStudent = student;
    this.searchStudent.emit(this.iStudent);
  }

}
