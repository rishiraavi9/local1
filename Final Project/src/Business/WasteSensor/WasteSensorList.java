/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WasteSensor;

import Business.PollutionSensor.PollutionSensor;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class WasteSensorList {

    private ArrayList<WasteSensor> wasteSensorList;
    
    public WasteSensorList()
    {
        this.wasteSensorList = new ArrayList<>();
    }
    public ArrayList<WasteSensor> getWasteSensorList() {
        return wasteSensorList;
    }

    public void setWasteSensorList(ArrayList<WasteSensor> wasteSensorList) {
        this.wasteSensorList = wasteSensorList;
    }

    public WasteSensor createSensor(String area, int house, int hosp, int haza, String emerLevel, int zipCode, int totalWaste) {

        WasteSensor s = new WasteSensor();
        s.setArea(area);
        s.setEmergencyLevel(emerLevel);
        s.setHazardousWaste(haza);
        s.setHospitalWaste(hosp);
        s.setHouseWaste(house);
        s.setTotalWeight(totalWaste);
        s.setZipCode(zipCode);
        wasteSensorList.add(s);
        return s;
    }
}
