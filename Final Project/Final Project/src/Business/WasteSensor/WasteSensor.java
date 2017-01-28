/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WasteSensor;

/**
 *
 * @author RishikRaavi
 */
public class WasteSensor {
    private int houseWaste;
    private int hospitalWaste;
    private int hazardousWaste;
    private int id;
    private String area;
    private int zipCode;
    private String emergencyLevel;
    private int totalWeight;
    private static int count=1;
    private String wasteStatus;

    public WasteSensor(){
id=count;
count++;

}

    public String getWasteStatus() {
        return wasteStatus;
    }

    public void setWasteStatus(String wasteStatus) {
        this.wasteStatus = wasteStatus;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
   
    public int getHouseWaste() {
        return houseWaste;
    }

    public void setHouseWaste(int houseWaste) {
        this.houseWaste = houseWaste;
    }

    public int getHospitalWaste() {
        return hospitalWaste;
    }

    public void setHospitalWaste(int hospitalWaste) {
        this.hospitalWaste = hospitalWaste;
    }

    public int getHazardousWaste() {
        return hazardousWaste;
    }

    public void setHazardousWaste(int hazardousWaste) {
        this.hazardousWaste = hazardousWaste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    @Override
    public String toString() {
        return  area + "";
    }
    
    
}
