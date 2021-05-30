/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_3;

import assignment_2_1.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class CountriesDAO {
    
    List<Countray> countries;

    public CountriesDAO() {
        this.countries = new ArrayList<Countray>();
    }
    
     public List<Countray> readCountriesFromCSV (String fileName){
        File CountriesFile = new File(fileName);
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(CountriesFile.toPath());
        } catch (IOException ex) {
            Logger.getLogger(CountriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       for (int lineIndx = 1; lineIndx < lines.size(); lineIndx++){
            String line = lines.get(lineIndx);
            
            String[] fields = line.split(",");
            
            for (int fieldIndx = 0; fieldIndx < fields.length; fieldIndx++){
                fields[fieldIndx] = fields[fieldIndx].trim();
                        
            }
            
            Countray countrayObject = createCountray(fields);
            countries.add(countrayObject);
        }
        return countries;
     }
    
     public Countray createCountray(String [] metadata){
         
        Countray countrayObject = new Countray(metadata[0], metadata[1], Integer.parseInt(metadata[2]), metadata[3], metadata[4], Double.parseDouble(metadata[5]));
        return countrayObject;
     
     }
}
