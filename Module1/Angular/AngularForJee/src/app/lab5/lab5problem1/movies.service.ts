import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from './lab5problem1.component';
import { MovieGenrePipe } from './search-movie/movie-genre.pipe';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(private http:HttpClient) { }
  getMovieList():Observable<Movie[]> {
    return this.http.get<Movie[]>("http://localhost:3000/movies")
  }
  addMovieDetails(movie:Movie){
    return this.http.post("http://localhost:3000/movies",movie);
  }

}
