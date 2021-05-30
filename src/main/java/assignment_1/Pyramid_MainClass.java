
package assignment_1;

import java.util.List;


public class Pyramid_MainClass {
    
    public static void main(String[] args){
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("D:\\pyramids.csv");
        
        int i = 0;
        for(Pyramid p:pyramids){
            System.out.println("#"+(i++)+p);
        }
    }
    
}
