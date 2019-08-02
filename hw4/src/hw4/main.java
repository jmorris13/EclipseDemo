/*
 * Westfield State University Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Program Design II
 * @author John Morris <jmorris1965@westfield.ma.edu>
 * (c) 2018
 * Created: Dec 11, 2018 8:41:35 PM
 */
package hw4;

import java.util.List;

/**
 *
 * @author John Morris <jmorris1965@westfield.ma.edu>
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        MovieDataFactory factory = new JSONMovieDataFactory();
        List<MovieData> list = factory.getMovieData("data/IMDBMovieData.json");
        List<ActorAppearances> top10Actor = factory.get10MostProlificActors(list);
        List<MovieData> top10Movies = factory.getTop10Gross(list);
        System.out.println("Top 10 Grossing Movies:\n");
        for(MovieData movie: top10Movies) {
          System.out.println(movie.getTitle() + ": " + movie.getRevenueMillions());
        }
        System.out.println("\nTop 10 Actor Appearances:\n");
        for(ActorAppearances actor: top10Actor) {
          System.out.println(actor.getActorName() + ": " + actor.getNumAppearances());
        }
  }
  
}
