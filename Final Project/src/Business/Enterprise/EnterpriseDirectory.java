/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
     public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Parking){
            enterprise = new ParkingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Pollution){
        enterprise = new PollutionEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.Waste){
        enterprise = new WasteEnterprise(name);
            enterpriseList.add(enterprise);
        }
         
       
        return enterprise;
    }
    
    
}
