/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PollutionSensor;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class PollutionSensorList {
     private ArrayList<PollutionSensor> pollutionSensorList;

    public PollutionSensorList() {
        pollutionSensorList = new ArrayList<>();
    }

    public ArrayList<PollutionSensor> getPollutionSensorList() {
        return pollutionSensorList;
    }

    public void setPollutionSensorList(ArrayList<PollutionSensor> pollutionSensorList) {
        this.pollutionSensorList = pollutionSensorList;
    }
    public PollutionSensor createSensor(int co2,int co,int cy,String area,int zipCode,String em){
        PollutionSensor ps = new PollutionSensor();
       
        ps.setCarbonDioxide(co2);
        ps.setCarbonMonoxide(co);
        ps.setCyanide(cy);
        ps.setArea(area);
        ps.setZipCode(zipCode);
        ps.setEmergencyLevel(em);
        pollutionSensorList.add(ps);
        return ps;
    }
    
}
