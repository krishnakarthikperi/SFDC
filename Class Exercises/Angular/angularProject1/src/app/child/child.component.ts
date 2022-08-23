import { Component, OnInit,Input,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }
@Input() itemParentToChild:number=0;
@Output() updateParentDataEvent= new EventEmitter<string>();
  ngOnInit(): void {
  }

}
