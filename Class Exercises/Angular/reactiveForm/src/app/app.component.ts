import { Component } from '@angular/core';
import {FormGroup,FormControl, Validator, Validators,FormArray} from '@angular/forms';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'reactiveForm';
  constructor(private fb:FormBuilder){  }
  get userName(){
    return this.registrationform.get('username');
  }
  registrationform=this.fb.group({
    username:['',Validators.required,Validators.maxLength(4)],
    email:[''],
    password:[''],
    address:this.fb.group({
      city:[''],
      state:[''],
      postalCode:['']
    }) ,
    alternateEmails:this.fb.array([])   
  })

  get alternateEmails(){
    return this.registrationform.get('alternateEmails') as FormArray
  }
  addAlternateEmails(){
    this.alternateEmails.push(this.fb.control(''));
  }
  // registrationform=new FormGroup({
  //   username:new FormControl(''),
  //   password:new FormControl(''),
  //   confirmPassword: new FormControl(''),
  //   address:new FormGroup({
  //     city:new FormControl(''),
  //     state:new FormControl(''),
  //     postalCode:new FormControl('')
  //   })
  // });
  loadData(){
    this.registrationform.patchValue({
      username:'john',
      email:'test@mial.com',
      password:'test',
      address:{
        city:'city',
        state:'state',
        postalCode:'123456'
      }
    });
  }
  onSubmit(formValue:any){
    console.log(formValue);
  }
}
