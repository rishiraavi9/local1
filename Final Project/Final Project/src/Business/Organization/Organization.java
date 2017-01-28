/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Person.PersonDirectory;
import Business.PollutionSensor.PollutionSensorList;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WasteSensor.WasteSensorList;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author raunak
 */
public abstract class Organization {
private String name;
private WorkQueue workQueue;
private EmployeeDirectory employeeDirectory;
private UserAccountDirectory userAccountDirectory;
private int organizationID;
private static int counter;
private PollutionSensorList pollutionSensorList;
private PersonDirectory personList;
private WasteSensorList wasteSensorList;
    
    public enum Type{
        Admin("Admin Organization"),ParkingOfficer("Parking Officer Organization"),ParkingControlAdmin("Parking Control Admin Organization"),
        PollutionControlAdmin("Pollution Control Admin"),PollutionTracker("Pollution Tracker"),
        WasteTracker("WasteTracker"),WasteControlAdmin("WasteControlAdmin"),RecycleAdmin("RecycleAdmin"),RecylceWorker("RecylceWorker");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        pollutionSensorList=new PollutionSensorList();
        organizationID = counter;
        personList=new PersonDirectory();
        wasteSensorList=new WasteSensorList();
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public WasteSensorList getWasteSensorList() {
        return wasteSensorList;
    }

    public void setWasteSensorList(WasteSensorList wasteSensorList) {
        this.wasteSensorList = wasteSensorList;
    }
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PollutionSensorList getPollutionSensorList() {
        return pollutionSensorList;
    }

    public void setPollutionSensorList(PollutionSensorList pollutionSensorList) {
        this.pollutionSensorList = pollutionSensorList;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
   
    
    
}
