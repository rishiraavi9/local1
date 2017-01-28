/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.PollutionSensor.PollutionSensorList;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private PollutionSensorList pollutionSensorList;
    private String Area;

    public Employee() {
        id = count;
        count++;
        pollutionSensorList=new PollutionSensorList();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public PollutionSensorList getPollutionSensorList() {
        return pollutionSensorList;
    }

    public void setPollutionSensorList(PollutionSensorList pollutionSensorList) {
        this.pollutionSensorList = pollutionSensorList;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
    
}
