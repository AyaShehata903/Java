/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import joinery.DataFrame;

/**
 *
 * @author Home
 */
public class Joinery_MainClass {
    public static void main(String[] args) throws IOException{
        
        DataFrame<Object> df = DataFrame.readCsv("D:\\titanic.csv");
                
        df.retain("Age").mean().iterrows().forEachRemaining(System.out::println);
        df.retain("Age").median().iterrows().forEachRemaining(System.out::println);
        df.retain("Age").max().iterrows().forEachRemaining(System.out::println);
        df.retain("Age").min().iterrows().forEachRemaining(System.out::println);
               
        DataFrame<Object> dfCities = DataFrame.readCsv("D:\\cities - Copy.csv");
        DataFrame<Object> dfCountries = DataFrame.readCsv("D:\\countries.csv");
        DataFrame<Object> countrayCities =dfCities.join(dfCountries);
        countrayCities.add("Airport", Arrays.<Object>asList("CairoAirport","SeoulAirport","IstanbulAirport","DohaAirport"));
        System.out.println(countrayCities);
        DataFrame<Object> countrayCitiesMerge =dfCountries.merge(dfCities);
        System.out.println(countrayCitiesMerge);
    }
    
}
