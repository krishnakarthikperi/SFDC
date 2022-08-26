import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lab5problem1',
  templateUrl: './lab5problem1.component.html',
  styleUrls: ['./lab5problem1.component.css']
})
export class Lab5problem1Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
export class Movie{
  constructor(
    public name:string, 
    public rating:number,
    public genre:string
  ){}
}
