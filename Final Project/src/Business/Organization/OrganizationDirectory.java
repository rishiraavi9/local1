/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.ParkingOfficer.getValue())){
            organization = new ParkingOfficerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ParkingControlAdmin.getValue())){
            organization = new ParkingControlAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PollutionTracker.getValue())){
            organization = new PollutionTrackerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.PollutionControlAdmin.getValue())){
            organization = new PollutionControlAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.WasteControlAdmin.getValue())){
            organization = new WasteControlAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.WasteTracker.getValue())){
            organization = new WasteTrackerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.RecycleAdmin.getValue())){
            organization = new RecycleAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.RecylceWorker.getValue())){
            organization = new RecycleWorkerOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
