package bd.edu.rifat.model;

import java.util.ArrayList;

public class Movie {

    private String name;
    private String category;
    private String relaseDate;
    private double rating;
    private ArrayList<Comment> comments;
    private Production production;

    public Movie() {
    }

    public Movie(String name, String relaseDate, double rating) {
        this.name = name;

        this.relaseDate = relaseDate;
        this.rating = rating;
    }


    public Movie(String name, String category, String relaseDate, double rating, ArrayList<Comment> comments, Production production) {
        this.name = name;
        this.category = category;
        this.relaseDate = relaseDate;
        this.rating = rating;
        this.comments = comments;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory(String s) {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;



    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", relaseDate='" + relaseDate + '\'' +
                ", rating=" + rating +
                ", comments=" + comments +
                ", production=" + production +
                '}';
    }
}
