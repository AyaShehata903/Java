/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Home
 */
public class Collections_MainClass {
    
    public static void main(String[] args){
    
        CountriesDAO countrayDAO = new CountriesDAO();
        List<Countray> countries = countrayDAO.readCountriesFromCSV("D:\\countries.csv");
        CitiesDAO cityDAO = new CitiesDAO();
        List<City> cities = cityDAO.readCitiesFromCSV("D:\\cities.csv");
        
        //Map Task
        for(Countray c:countries){
            c.setCities(cities);
        }
        Map <String, ArrayList<City> > countrayCities = new HashMap<>();
        for(Countray c:countries){
            countrayCities.put(c.getCountrayID(), c.getCities());
        }
        ArrayList<City> outputCities = countrayCities.get("E101");
        //Descending Order
        Collections.sort(outputCities);
        for(City t:outputCities){
            System.out.println(t);
        }
        
       
    }
}
