import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {IStudent} from '../model/Student';

@Component({
  selector: 'app-create-form',
  templateUrl: './create-form.component.html',
  styleUrls: ['./create-form.component.scss']
})
export class CreateFormComponent implements OnInit {

  @Output() creatNewStudent = new EventEmitter<IStudent>();

  createForm: FormGroup;
  constructor(private cf: FormBuilder) { }

  ngOnInit(): void {
    this.createForm = this.cf.group({
      id: '',
      name: ['', [Validators.minLength(10), Validators.required]],
      age: '',
      avatarImg: '',
      height: '',
      sizeAvatar: 300,
    });
  }

  createStudent() {
    console.log(this.createForm);
    this.creatNewStudent.emit(this.createForm.value);
    this.createForm.reset();
  }
}
