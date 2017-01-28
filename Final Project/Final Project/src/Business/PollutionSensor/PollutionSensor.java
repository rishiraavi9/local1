/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PollutionSensor;

/**
 *
 * @author RishikRaavi
 */
public class PollutionSensor {
    private int carbonDioxide;
    private int carbonMonoxide;
    private int cyanide;
    private int id;
    private String area;
    private int zipCode;
    private String emergencyLevel;
    private String polStatus;

    
    
private static int count=1;

public PollutionSensor(){
id=count;
count++;

}

    public String getPolStatus() {
        return polStatus;
    }

    public void setPolStatus(String polStatus) {
        this.polStatus = polStatus;
    }

public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public int getCarbonDioxide() {
        return carbonDioxide;
    }

    public void setCarbonDioxide(int carbonDioxide) {
        this.carbonDioxide = carbonDioxide;
    }

    public int getCarbonMonoxide() {
        return carbonMonoxide;
    }

    public void setCarbonMonoxide(int carbonMonoxide) {
        this.carbonMonoxide = carbonMonoxide;
    }

    public String getArea() {
        return area;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }
    

    public void setArea(String area) {
        this.area = area;
    }

    public int getCyanide() {
        return cyanide;
    }

    public void setCyanide(int cyanide) {
        this.cyanide = cyanide;
    }

    @Override
    public String toString() {
        return   area  ;
    }

    
    
    
}
