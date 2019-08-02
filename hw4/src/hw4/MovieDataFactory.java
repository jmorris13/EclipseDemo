/*
 * Westfield State University Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Program Design II
 * @author John Morris <jmorris1965@westfield.ma.edu>
 * (c) 2018
 * Created: Dec 11, 2018 8:30:38 PM
 */
package hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author John Morris <jmorris1965@westfield.ma.edu>
 */
public abstract class MovieDataFactory {
    public abstract List<MovieData> getMovieData(String fromWhere);
    
    public List<MovieData> getTop10Gross(List<MovieData> allMovies) {
        List<MovieData> copy = new ArrayList<>(allMovies);
        Collections.sort(copy, (m1, m2) -> {
          if (m1.getRevenueMillions()> m2.getRevenueMillions()) return -1;
          if (m1.getRevenueMillions()< m2.getRevenueMillions()) return 1;
          return 0; 
        });
        List<MovieData> top10 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
          top10.add(copy.get(i));
        }
        return top10;
    }
    
    public List<ActorAppearances> get10MostProlificActors(List<MovieData> movies){
        List<MovieData> copy = new ArrayList<MovieData>(movies);
        List<ActorAppearances> actors = new ArrayList<ActorAppearances>();
        int x = 0;
        boolean test = false;
        for(MovieData d : copy){
            x = d.getActors().size();
            
            for(int i = 0; i < x; i++){
                ActorAppearances actorApprs = new ActorAppearances(d.getActors().get(i), 1);
                
                for(int j=0; j<actors.size(); j++){
                    test=false;
                    if(actors.get(j).getActorName().equals(actorApprs.getActorName())){
                        actors.get(j).setNumAppearances(actors.get(j).getNumAppearances() + 1);
                        test = true;
                        break;
                    }
                }
                if(test==false)
                    actors.add(actorApprs);
            }
        }
        
        Collections.sort(actors, (a1, a2) -> {
            if(a1.getNumAppearances() > a2.getNumAppearances()) return -1;
            if(a1.getNumAppearances() < a2.getNumAppearances()) return 1;
            else{
                if(a1.getActorName().compareToIgnoreCase(a2.getActorName()) >0) return 1;
                if(a1.getActorName().compareToIgnoreCase(a2.getActorName()) <0) return -1;
                return 0;
            }
        });
        List<ActorAppearances> top10 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            top10.add(actors.get(i));
        }
        return top10;
    }
}
