import { Component, OnInit } from '@angular/core';
import { BookService } from './book.service';
@Component({
  selector: 'app-lab4problem1',
  templateUrl: './lab4problem1.component.html',
  styleUrls: ['./lab4problem1.component.css']
})
export class Lab4problem1Component implements OnInit {

  constructor(private bookService:BookService) { }

  ngOnInit(): void {
    this.bookService.getBookList().subscribe(
      (response)=>{
        this.books=response;
        console.log(this.books);
      },
      (error)=>console.log(error)
      )
  }
  
  books:Book[]=[];
}
export class Book{
  constructor(
    public id:string,
    public title:string,
    public author:string,
    public year:string
  ){}
}