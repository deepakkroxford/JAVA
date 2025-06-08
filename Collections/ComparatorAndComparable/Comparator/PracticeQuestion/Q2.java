package Collections.ComparatorAndComparable.Comparator.PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies {
    private String title;
    private int releaseYear;

    public Movies(String title, int releaseYear) {
        super();
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString() {
        return title + " (" + releaseYear + ")";
    }
}

class SortByYear implements Comparator<Movies> {
    public int compare(Movies m1, Movies m2) {
        return m1.getReleaseYear() - m2.getReleaseYear();
    }
}

class SortByYearThenTitle implements Comparator<Movies> {
    public int compare(Movies m1, Movies m2) {
        int yearCompare = Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
        if (yearCompare != 0) { // it means two moveis have different release year so we can return yearCompare
            return yearCompare;
        } else { // if two movies have same release year then we will compare their title
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        /**
         * Sort movies by year of release and then by title
         * Fields: String title, int releaseYear
         * First sort by release year (oldest first), then by title alphabetically.
         * 
         * 
         * 👉 If two movies have the same releaseYear, then the sorting will be done by
         * the title (in alphabetical order).
         * 
         */
        ArrayList<Movies> movies = new ArrayList<Movies>();
        movies.add(new Movies("The Shawshank Redemption", 1994));
        movies.add(new Movies("The Godfather", 1972));
        movies.add(new Movies("The Godfather: Part II", 1974));
        movies.add(new Movies("The Dark Knight", 2008));
        movies.add(new Movies("12 Angry Men", 1957));
        movies.add(new Movies("Schindler's List", 1993));
        movies.add(new Movies("The Lord of the Rings: The Return of the King", 2003));
        movies.add(new Movies("Pulp Fiction", 1994));

        // Sort movies by release year
        Collections.sort(movies, new SortByYearThenTitle());

        // Print movies
        for (Movies movie : movies) {
            System.out.println(movie);
        }
    }
}
