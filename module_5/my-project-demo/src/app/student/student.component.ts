import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from '../model/Student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

  @Input()
  student: IStudent;

  constructor() { }

  ngOnInit(): void {
  }

  onchange(height){
    this.student.height = height.target.value;
  }
}
