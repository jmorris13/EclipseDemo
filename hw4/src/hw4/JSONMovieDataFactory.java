/*
 * Westfield State University Expression department is undefined on line 4, column 29 in Templates/Licenses/license-default.txt. 
 * Program Design II
 * @author John Morris <jmorris1965@westfield.ma.edu>
 * (c) 2018
 * Created: Dec 11, 2018 8:31:51 PM
 */
package hw4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John Morris <jmorris1965@westfield.ma.edu>
 */
public class JSONMovieDataFactory extends MovieDataFactory {

    @Override
    public List<MovieData> getMovieData(String fromWhere) {
    try {
      File jsonFile = new File(fromWhere);
      ObjectMapper mapper = new ObjectMapper();
      
      List<MovieData> list = mapper.readValue(jsonFile,
        new TypeReference<ArrayList<MovieData>>() { } );
      return list;
    } catch (IOException ex) {
      Logger.getLogger(JSONMovieDataFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }
}