import { Component, OnInit, Pipe } from '@angular/core';
import { AddMovieComponent } from '../add-movie/add-movie.component';
import { Movie } from '../lab5problem1.component';
import { MoviesService } from '../movies.service';

@Component({
  selector: 'app-search-movie',
  templateUrl: './search-movie.component.html',
  styleUrls: ['./search-movie.component.css']
})
export class SearchMovieComponent implements OnInit {

  constructor(private movieService:MoviesService) { }

  ngOnInit(): void {
    this.movieService.getMovieList().subscribe(
      (response)=>{
        this.movies=response;
        console.log(this.movies);
      },
      (error)=>console.log(error)
      )
  }
  movies:Movie[]=[];

  genres:String[]=["Drama","Fiction","Satire"]; 

  isVisible=false;

  hideSearchMovies(){
    this.isVisible=false;
  }
  showSearchMovies(){
    this.isVisible=true;
    console.log(this.movies)
  }
}
