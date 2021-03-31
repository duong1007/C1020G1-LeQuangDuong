import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {students} from '../model/StudentRepository';
import {IStudent} from '../model/Student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.scss']
})
export class StudentListComponent implements OnInit {

  studentList = students;
  selectStudent: IStudent;
  @Output() searchStudent = new EventEmitter<IStudent>();

  constructor() { }

  ngOnInit(): void {
  }

  display(student: IStudent) {
    this.selectStudent = student;
    this.searchStudent.emit(this.selectStudent);
  }

}
