/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author RishikRaavi
 */
public class PollutionWorkRequest extends WorkRequest{
    
    private String testResult;
    private String emerLevel;
    private int cabonDioxide;
    private int carbonMonoxide;
    private int cyanide;
    private int zipcode;

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    public int getCabonDioxide() {
        return cabonDioxide;
    }

    public void setCabonDioxide(int cabonDioxide) {
        this.cabonDioxide = cabonDioxide;
    }

    public int getCarbonMonoxide() {
        return carbonMonoxide;
    }

    public void setCarbonMonoxide(int carbonMonoxide) {
        this.carbonMonoxide = carbonMonoxide;
    }

    public int getCyanide() {
        return cyanide;
    }

    public void setCyanide(int cyanide) {
        this.cyanide = cyanide;
    }
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getEmerLevel() {
        return emerLevel;
    }

    public void setEmerLevel(String emerLevel) {
        this.emerLevel = emerLevel;
    }
    
}
