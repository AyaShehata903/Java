/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_3;

import assignment_2_1.*;
import java.util.*;

/**
 *
 * @author Home
 */
public class City implements Comparable<City>{
    private String cityName;
    private String cityID;
    private String countrayID;
    private int population;
    private String continent;

    public City(String cityName, String cityID, String countrayID, int population, String continent) {
        this.cityName = cityName;
        this.cityID = cityID;
        this.countrayID = countrayID;
        this.population = population;
        this.continent = continent;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public void setCountrayID(String countrayID) {
        this.countrayID = countrayID;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityID() {
        return cityID;
    }

    public String getCountrayID() {
        return countrayID;
    }

    public int getPopulation() {
        return population;
    }
    
    public String getContinent() {
        return continent;
    }
    
    @Override
    public int compareTo(City compareCity){
        int comparePopulation = compareCity.getPopulation();
        return comparePopulation - this.population;
    }
    
    
    @Override
    public String toString() {
        return "City{" + "cityName=" + cityName + ", cityID=" + cityID + ", countrayID=" + countrayID + ", population=" + population + ", continent=" + continent + '}';
    }

    
}
