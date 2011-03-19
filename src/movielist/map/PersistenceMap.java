package movielist.map;

import java.util.List;

import movielist.domain.Movie;
import movielist.domain.MovieRating;
public interface PersistenceMap
{
	// logon functions
	public boolean validateUser(String userId, String password) throws MapException;
	
	// movie functions
	public void insertMovie(Movie aMovie) throws MapException;
	public void updateMovie(Movie aMovie) throws MapException, ObjectNotFoundException;
	public void deleteMovie(int id) throws MapException, ObjectNotFoundException;
	public Movie getMovieById(int id) throws MapException, ObjectNotFoundException;
	public List getAllMovies() throws MapException;
	public void deleteAllMovies() throws MapException;

	// movie rating functions
	public MovieRating getMovieRatingById(int id) throws MapException, ObjectNotFoundException;
	public List getAllMovieRatings() throws MapException;
}

