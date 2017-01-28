/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.WasteControlAdmin;
import Business.Role.Role;
import Business.Role.WasteControlAdmin;
import Business.Role.WasteTracker;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class WasteControlAdminOrganization extends Organization{
    public WasteControlAdminOrganization() {
        super(Organization.Type.WasteControlAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WasteControlAdmin());
        return roles;
    }
}
