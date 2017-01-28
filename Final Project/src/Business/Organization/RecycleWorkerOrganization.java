/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RecycleControlAdmin;
import Business.Role.RecycleWorker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RishikRaavi
 */
public class RecycleWorkerOrganization extends Organization{
    public RecycleWorkerOrganization() {
        super(Organization.Type.RecylceWorker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RecycleWorker());
        return roles;
}
}
