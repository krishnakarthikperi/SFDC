import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../movies.service';
import { Movie } from '../lab5problem1.component';
@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  constructor(private movieService:MoviesService) { }
  public genres=["Drama","Fiction","Satire"];
  ngOnInit(): void {
  }

  addMovie(formValue:any){
    let movie = new Movie(formValue.name,formValue.rating,formValue.genre);
    this.movieService.addMovieDetails(movie).subscribe(data=>{
      let msg=data?"Movie added succesfully":"OOPS!! some error occured";
      console.log(data);
      alert(msg)
    },(error)=>{
      console.log(error);
      alert("OOPS!! some error occured")
    })

  }
}
