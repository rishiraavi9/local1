/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.WasteTracker;
import Business.Role.ParkingControlAdmin;
import Business.Role.Role;
import Business.Role.WasteTracker;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class WasteTrackerOrganization extends Organization{
    public WasteTrackerOrganization() {
        super(Organization.Type.WasteTracker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WasteTracker());
        return roles;
    }
}
