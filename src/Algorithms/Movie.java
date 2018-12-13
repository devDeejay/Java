package Algorithms;

public class Movie {
    String name;
    String rating;
    double averagePrice;

    public Movie() {
    }

    public Movie(String name, String rating, double averagePrice) {
        this.name = name;
        this.rating = rating;
        this.averagePrice = averagePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void calculateAveragePrice(double price1, double price2, double price3) {
       averagePrice = (price1 + price2 + price3) / 3;
        System.out.println("Average Price is " + averagePrice);
    }
}
