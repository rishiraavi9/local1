/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ParkingControlAdmin;
import Business.Role.ParkingOfficer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class ParkingOfficerOrganization extends Organization{

    public ParkingOfficerOrganization() {
        super(Organization.Type.ParkingOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ParkingOfficer());
        return roles;
    }
     
}