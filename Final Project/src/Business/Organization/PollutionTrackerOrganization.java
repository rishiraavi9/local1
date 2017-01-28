/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.PollutionTracker;
import Business.Role.ParkingControlAdmin;
import Business.Role.PollutionTracker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class PollutionTrackerOrganization extends Organization{
    public PollutionTrackerOrganization() {
        super(Organization.Type.PollutionTracker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PollutionTracker());
        return roles;
    }
}
