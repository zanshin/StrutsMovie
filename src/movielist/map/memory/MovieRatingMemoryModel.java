package movielist.map.memory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import movielist.domain.MovieRating;
import movielist.map.ObjectNotFoundException;

public class MovieRatingMemoryModel {

    /**
     * 
     * @uml.property name="instance"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    private static MovieRatingMemoryModel instance = null;

	private final List list;

    /**
     * 
     * @uml.property name="instance"
     */
    public static synchronized MovieRatingMemoryModel getInstance() {
        if (instance == null) {
            instance = new MovieRatingMemoryModel();
        }

        return instance;
    }

	private MovieRatingMemoryModel() {
		super();
		list = new ArrayList();

		MovieRating mr = new MovieRating();
		mr.setId(1);
		mr.setDescription("G");
		list.add(mr);

		mr = new MovieRating();
		mr.setId(2);
		mr.setDescription("PG");
		list.add(mr);

		mr = new MovieRating();
		mr.setId(3);
		mr.setDescription("PG-13");
		list.add(mr);

		mr = new MovieRating();
		mr.setId(4);
		mr.setDescription("R");
		list.add(mr);
	}

	public MovieRating getById(int id) throws ObjectNotFoundException {
		Iterator iter = list.iterator();

		while (iter.hasNext()) {
			MovieRating mr = (MovieRating) iter.next();

			if (mr.getId() == id) {
				return mr;
			}
		}

		throw new ObjectNotFoundException();
	}
	public List getAll() {
		return Collections.unmodifiableList(list);
	}
}