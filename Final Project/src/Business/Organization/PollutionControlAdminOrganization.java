/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.PollutionControlAdmin;
import Business.Role.ParkingControlAdmin;
import Business.Role.PollutionControlAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class PollutionControlAdminOrganization extends Organization{
    public PollutionControlAdminOrganization() {
        super(Organization.Type.PollutionControlAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PollutionControlAdmin());
        return roles;
    }
}
