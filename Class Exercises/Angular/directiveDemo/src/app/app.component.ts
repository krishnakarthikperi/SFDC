import { Component } from '@angular/core';
import { reduce } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'directiveDemo';
  //ngIf block
  showIfElse:boolean =true;
  valueIfElse="12";
  color:string="black";
  //ngFor block
  users=['john','jack','tom','jerry'];
  userDetails=[
    {name:'john',email:'john@gmail.com',age:32},
    {name:'jerry',email:'john@gmail.com',age:32},
    {name:'james',email:'john@gmail.com',age:32},
    {name:'jack',email:'john@gmail.com',age:32},
  ]
}
