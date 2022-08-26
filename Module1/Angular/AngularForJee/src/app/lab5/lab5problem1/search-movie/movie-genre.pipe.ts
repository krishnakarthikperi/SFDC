import { Pipe, PipeTransform } from '@angular/core';
import { Movie } from '../lab5problem1.component';
@Pipe({
  name: 'movieGenre'
})
export class MovieGenrePipe implements PipeTransform {

  transform(movies:Movie[],genre:any) {
    return movies.filter((movie)=>movie.genre==genre);
  }

}
