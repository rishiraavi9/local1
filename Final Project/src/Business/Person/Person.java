/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author RishikRaavi
 */
public class Person {
    private String personFirstName;
    private String typeOfParking;
    private int personSSN;
    private long phoneNum;
    private String personLastName;
    private String vehcileNumber;
    private String vehcileType;
    private String zipCode;
    private String area;
    private String address;
    private float price;
    private float tax;
    private float totalPrice;
    private String billNo;
    private int personId;
    private String status; 
    private String parkingRequestStatus;
    
    
    private static int count = 1;
    public Person(){
        personId = count;
        count++;
    }

    public String getParkingRequestStatus() {
        return parkingRequestStatus;
    }

    public void setParkingRequestStatus(String parkingRequestStatus) {
        this.parkingRequestStatus = parkingRequestStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getTypeOfParking() {
        return typeOfParking;
    }

    public void setTypeOfParking(String typeOfParking) {
        this.typeOfParking = typeOfParking;
    }

    public int getPersonSSN() {
        return personSSN;
    }

    public void setPersonSSN(int personSSN) {
        this.personSSN = personSSN;
    }

    

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getVehcileNumber() {
        return vehcileNumber;
    }

    public void setVehcileNumber(String vehcileNumber) {
        this.vehcileNumber = vehcileNumber;
    }

    public String getVehcileType() {
        return vehcileType;
    }

    public void setVehcileType(String vehcileType) {
        this.vehcileType = vehcileType;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @Override
    public String toString() {
        return  personId +"";
    }

  
   
    

   
}
