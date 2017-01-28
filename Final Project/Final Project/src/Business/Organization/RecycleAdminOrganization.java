/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.RecycleAdmin;
import Business.Role.RecycleControlAdmin;
import Business.Role.Role;
import Business.Role.WasteTracker;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class RecycleAdminOrganization extends Organization{
    public RecycleAdminOrganization() {
        super(Organization.Type.RecycleAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RecycleControlAdmin());
        return roles;
    }
    
}
