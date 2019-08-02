/*
 * Westfield State University Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Program Design II
 * @author John Morris <jmorris1965@westfield.ma.edu>
 * (c) 2018
 * Created: Dec 11, 2018 9:21:05 PM
 */
package hw4;

/**
 *
 * @author John Morris <jmorris1965@westfield.ma.edu>
 */
public class ActorAppearances {
    private String actorName;
    private Integer numAppearances;

    public ActorAppearances(String actorName, Integer numAppearances) {
        this.actorName = actorName;
        this.numAppearances = numAppearances;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Integer getNumAppearances() {
        return numAppearances;
    }

    public void setNumAppearances(Integer numAppearances) {
        this.numAppearances = numAppearances;
    }

    @Override
    public String toString() {
        return "(" + actorName + ", " + numAppearances + ')';
    }
}
