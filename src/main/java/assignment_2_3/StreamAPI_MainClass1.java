/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_3;

import assignment_2_1.CitiesDAO;
import assignment_2_1.City;
import assignment_2_1.Countray;
import assignment_2_1.CountriesDAO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Home
 */
public class StreamAPI_MainClass1 {
    
    public static void main(String[] args){
    
        CountriesDAO countrayDAO = new CountriesDAO();
        List<Countray> countries = countrayDAO.readCountriesFromCSV("D:\\countries.csv");
        CitiesDAO cityDAO = new CitiesDAO();
        List<City> cities = cityDAO.readCitiesFromCSV("D:\\cities.csv");
        
        for(Countray c:countries){
            c.setCities(cities);
        }
        
        //Max Populated City of each Countray
        for(Countray c:countries){
            List<City> citiesOfCountray = c.getCities();
            City maxPopulatedCity = citiesOfCountray.stream()
                    .collect(Collectors.maxBy(Comparator.comparingInt(City::getPopulation))).get();
            System.out.println("Countray:"+c.getCountrayName());
            System.out.println("The Countray Cities"+ citiesOfCountray);
            System.out.println("The Biggest Populated City"+ maxPopulatedCity);
            
        }
     
        City maxPopulatedCityByContinent = cities.stream()
                .filter(t-> t.getContinent().equals("Asia"))
                .collect(Collectors.maxBy(Comparator.comparingInt(City::getPopulation))).get();
        System.out.println("The Biggest Populated City In Asia"+ maxPopulatedCityByContinent);
        
        
//      List<String> Capitals = countries.stream()
//              .map(Countray::getCountrayCapital)
//              .distinct()
//              .collect(toList());
//      City maxPopulatedCapital = cities.stream()
//              .filter(t -> Capitals.contains(t))
//              .collect(Collectors.maxBy(Comparator.comparingInt(City::getPopulation))).get();
//      System.out.println("The Biggest Populated Capital"+ maxPopulatedCapital);      
              
              
        
    }
}
