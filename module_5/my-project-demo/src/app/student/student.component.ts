import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/Student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.scss']
})
export class StudentComponent implements OnInit {

  student: IStudent = {
    sizeAvatar: 300,
    age: 23, avatarImg: 'https://photo-baomoi.zadn.vn/w700_r1/2020_04_15_180_34718461/cf6ada6aa3294a771338.jpg', height: 160, name: 'Thư'

  };
  constructor() { }

  ngOnInit(): void {
  }

  onchange(height){
    this.student.height = height.target.value;
  }

}
