import { MovieGenrePipe } from './movie-genre.pipe';

describe('MovieGenrePipe', () => {
  it('create an instance', () => {
    const pipe = new MovieGenrePipe();
    expect(pipe).toBeTruthy();
  });
});
