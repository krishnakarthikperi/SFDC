import { Component } from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularForms';
  topics=['Angular','Java','Web basics','Bootstrap','JSON'];
  userModel = new User('John','john@jmail.com',123456765,'JSON','morning',true);

  // onSubmit(userForm:any)
  // {
  //   console.log(userForm);
  // }
  
  //JSON Demo
  //userModel = new User();
  constructor(private user:UserService){}
  getUser(){
    this.user.getUserDetails().subscribe(data=>{console.log(data)});
  }
  onSubmit(userForm:any)
  {
    console.log(userForm);
    this.user.addUserDetails(this.userModel).subscribe(data=>{
      let msg=data?"user registered succesfully":"OOPS!! some error occured";
      console.log(data);
      alert(msg)
    },(error)=>{
      console.log(error);
      alert("OOPS!! some error occured")
    })
  }
}
