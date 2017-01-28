/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

   
     public Person createPerson(String personFirstName,String typeOfParking,int personSSN,String personLastName,String vehcileNumber,String vehcileType,String zipCode,String area,String address,long phone){
        Person p = new Person();
        p.setPersonFirstName(personFirstName);
        p.setPersonLastName(personLastName);
        p.setPhoneNum(phone);
        p.setPersonSSN(personSSN);
        p.setTypeOfParking(typeOfParking);
        p.setVehcileNumber(vehcileNumber);
        p.setVehcileType(vehcileType);
        p.setZipCode(zipCode);
        p.setArea(area);
        p.setAddress(address);
       
        personList.add(p);
        return p;
    }
     public Person createAmount(float price,float tax,float total,String status,Person p){
    
     p.setPrice(price);
     p.setTax(tax);
     p.setTotalPrice(total);
     p.setStatus(status);
     return p;
     }
     public Person createTicket(String billNo,Person p){
     
     p.setBillNo(billNo);
     return p;
     }
      public Person searchPerson(String personName){
           for(Person p:personList){
               if(p.getPersonLastName().equalsIgnoreCase(personName)||p.getPersonFirstName().equalsIgnoreCase(personName)){
                   return p;
               }
           }
           return null;
       }
}
