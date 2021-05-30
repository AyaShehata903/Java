
package assignment_2_3;

import assignment_2_3.PyramidCSVDAO;
import assignment_2_3.Pyramid;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPI_MainClass2 {
    
    public static void main(String[] args){
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("D:\\pyramids.csv");
        
        List<Double> Height = pyramids.stream()
               .map(Pyramid::getHeight)
               .sorted()
               .collect(Collectors.toList());
        double medianHeight = median(Height);
        double lowerQuartile = quartile(Height,25);
        double upperQuartile = quartile(Height,75);
        System.out.println("The Height Median "+medianHeight); 
        System.out.println("The Height Lower Quartile "+lowerQuartile);
        System.out.println("The Height Upper Quartile "+upperQuartile);
        
         
        
    }

    
    
    public static double median(List<Double> numbers){
        double result;
        int size = numbers.size();
        if(size%2==1){result = numbers.get((size+1)/2-1);}
        else{result = (numbers.get(size/2-1)+numbers.get(size/2))/2;}
        
        return result;
        
    }
    
    public static double quartile(List<Double> numbers, double lowerPercent) {

        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The data array either is null or does not contain any data.");
        }

        
        int n = (int) Math.round(numbers.size() * lowerPercent / 100);
        
        return numbers.get(n);

    }
   
    
}
