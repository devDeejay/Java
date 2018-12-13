package Algorithms;

public class MovieApp {
    public static void main(String[] args) {
        Movie oneMovie = new Movie();
        Movie secondMovie = new Movie("Avengers", "PG 13", 8);
        oneMovie.setName("Black Panther");
        oneMovie.setRating("PG");

        oneMovie.calculateAveragePrice(8,10,9);
        secondMovie.calculateAveragePrice(18,10,19);
    }
}
