/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Countray {
    private String countrayName;
    private String countrayID;
    private int totalPopulation;
    private String countrayCapital;
    private String continent;
    private double surfaceArea;
    private ArrayList<City> cities = new ArrayList<City>();

    public Countray(String countrayName, String countrayID, int totalPopulation, String countrayCapital, String continent, double surfaceArea) {
        this.countrayName = countrayName;
        this.countrayID = countrayID;
        this.totalPopulation = totalPopulation;
        this.countrayCapital = countrayCapital;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
    }

    public void setCountrayName(String countrayName) {
        this.countrayName = countrayName;
    }

    public void setCountrayID(String countrayID) {
        this.countrayID = countrayID;
    }

    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public void setCountrayCapital(String countrayCapital) {
        this.countrayCapital = countrayCapital;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    
    public void setCities(List<City> cities) {
        for(City t:cities){
            if(this.getCountrayID().equals(t.getCountrayID())){
                this.cities.add(t);}
        }
        
        

    }

    public String getCountrayName() {
        return countrayName;
    }

    public String getCountrayID() {
        return countrayID;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }

    public String getCountrayCapital() {
        return countrayCapital;
    }
    
    public String getContinent() {
        return continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
    
    public ArrayList<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Countray{" + "countrayName=" + countrayName + ", countrayID=" + countrayID + ", totalPopulation=" + totalPopulation + ", countrayCapital=" + countrayCapital + ", continent=" + continent + ", surfaceArea=" + surfaceArea + ", cities=" + cities + '}';
    }

   

    

    

}
