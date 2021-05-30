
package assignment_1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidCSVDAO {
    
    List<Pyramid> Pyramids;

    public PyramidCSVDAO() {
        this.Pyramids = new ArrayList<Pyramid>();
    }
    
    public List<Pyramid> readPyramidsFromCSV (String fileName){
        File PyramidsFile = new File(fileName);
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(PyramidsFile.toPath());
        } catch (IOException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int lineIndx = 1; lineIndx < lines.size(); lineIndx++){
            String line = lines.get(lineIndx);
            
            String[] fields = line.split(",");
            
            for (int fieldIndx = 0; fieldIndx < fields.length; fieldIndx++){
                fields[fieldIndx] = fields[fieldIndx].trim();
                        
            }
            
            Pyramid pyramidObject = createPyramid(fields);
            Pyramids.add(pyramidObject);
        }
        
        
        return Pyramids;
    }
    
    public Pyramid createPyramid(String [] metadata){
        Pyramid pyramidObject = new Pyramid(metadata[7], metadata[2], metadata[0], metadata[4]);
        return pyramidObject;
    }
    
    
}
