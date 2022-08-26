import { Component, OnInit } from '@angular/core';
import { BookService } from '../lab4problem1/book.service';
import { Book } from '../lab4problem1/lab4problem1.component';
@Component({
  selector: 'app-lab4problem2',
  templateUrl: './lab4problem2.component.html',
  styleUrls: ['./lab4problem2.component.css']
})
export class Lab4problem2Component implements OnInit {
  constructor(private bookService:BookService) { }

  ngOnInit(): void {
    this.bookService.getBookList().subscribe(
      (response)=>{
        this.books=response;
       this.showBooks=response;
//        console.log(this.books);
      },
      (error)=>console.log(error)
      )
      // this.showBooks=this.books.slice();
//      console.log(this.showBooks)
  }
  books:Book[]=[];
  showBooks:Book[] = [];
  id:string="";
  title:string="";
  author:string="";
  year:string="";

  filterById(){
    if(this.id==null){
      this.showBooks=[];
      for(let book of this.books){
        this.showBooks.push(book);
      }
    }
    else{
      const pattern = new RegExp(this.id);
      this.showBooks=[];
      for(let book of this.books){
        if(pattern.test(book.id)){
          this.showBooks.push(book);
        }
      }
    }
  }

  filterByTitle(){
    if(this.title==null){
      this.showBooks=[];
      for(let book of this.books){
        this.showBooks.push(book);
      }
    }
    else{
      const pattern = new RegExp(this.title);
      this.showBooks=[];
      for(let book of this.books){
        if(pattern.test(book.title)){
          this.showBooks.push(book);
        }
      }
    }
  }

  filterByAuthor(){
    if(this.author==null){
      this.showBooks=[];
      for(let book of this.books){
        this.showBooks.push(book);
      }
    }
    else{
      const pattern = new RegExp(this.author);
      this.showBooks=[];
      for(let book of this.books){
        if(pattern.test(book.author)){
          this.showBooks.push(book);
        }
      }
    }
  }

  filterByYear(){
    if(this.year==null){
      this.showBooks=[];
      for(let book of this.books){
        this.showBooks.push(book);
      }
    }
    else{
      const pattern = new RegExp(this.year);
      this.showBooks=[];
      for(let book of this.books){
        if(pattern.test(book.year)){
          this.showBooks.push(book);
        }
      }
    }
  }
}
