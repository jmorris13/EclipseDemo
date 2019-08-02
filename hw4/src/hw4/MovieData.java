/*
 * Westfield State University Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Program Design II
 * @author John Morris <jmorris1965@westfield.ma.edu>
 * (c) 2018
 * Created: Dec 11, 2018 8:13:28 PM
 */
package hw4;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;

/**
 *
 * @author John Morris <jmorris1965@westfield.ma.edu>
 */
@JsonPropertyOrder({"rank", "title", "genres", "description", "director", 
    "actors", "year", "runtimeMinutes", "rating", "votes", "revenueMillions", "metascore"})
public class MovieData {

    private int rank;
    private String title;
    private ArrayList<String> genres;
    private String description;
    private String director;
    private ArrayList<String> actors;
    private int year;
    private int runtimeMinutes;
    private double rating;
    private int votes;
    private double revenueMillions;
    private int metascore;

    public MovieData(int rank, String title, ArrayList<String> genres, String description, String director, ArrayList<String> actors, int year, int runtimeMinutes, double rating, int votes, double revenueMillions, int metascore) {
        this.rank = rank;
        this.title = title;
        this.genres = genres;
        this.description = description;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.runtimeMinutes = runtimeMinutes;
        this.rating = rating;
        this.votes = votes;
        this.revenueMillions = revenueMillions;
        this.metascore = metascore;
    }

    public MovieData(){
    }
    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genres
     */
    public ArrayList<String> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    

    /**
     * @return the actors
     */
    public ArrayList<String> getActors() {
        return actors;
    }

    /**
     * @param actors the actors to set
     */
    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the runtimeMinutes
     */
    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    /**
     * @param runtimeMinutes the runtimeMinutes to set
     */
    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    /**
     * @return the rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * @return the votes
     */
    public int getVotes() {
        return votes;
    }

    /**
     * @param votes the votes to set
     */
    public void setVotes(int votes) {
        this.votes = votes;
    }

    /**
     * @return the revenueMillions
     */
    public double getRevenueMillions() {
        return revenueMillions;
    }

    /**
     * @param revenueMillions the revenueMillions to set
     */
    public void setRevenueMillions(double revenueMillions) {
        this.revenueMillions = revenueMillions;
    }

    /**
     * @return the metascore
     */
    public int getMetascore() {
        return metascore;
    }

    /**
     * @param metascore the metascore to set
     */
    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    @Override
    public String toString() {
        return "MovieData{" + "rank=" + rank + ", title=" + title + ", genres=" + genres + ", description=" + description + ", director=" + director +", actors=" + actors + ", year=" + year + ", runtimeMinutes=" + runtimeMinutes + ", rating=" + rating + ", votes=" + votes + ", revenueMillions=" + revenueMillions + ", metascore=" + metascore + '}';
    }
    
    
    
}
