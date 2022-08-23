import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-problem2',
  templateUrl: './problem2.component.html',
  styleUrls: ['./problem2.component.css']
})
export class Problem2Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  id='';
  name='';
  salary='';
  dept='';
  onClick(){
    alert(this.id+' '+this.name+' '+this.salary+' '+this.dept);
  }

}
