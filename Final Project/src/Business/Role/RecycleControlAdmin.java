/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RecycleAdminOrganization;
import Business.Organization.WasteTrackerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Waste.RecycleAdminWorkArea;
import userinterface.Waste.WasteTrackerJPanel;

/**
 *
 * @author RishikRaavi
 */
public class RecycleControlAdmin extends Role{

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new RecycleAdminWorkArea(userProcessContainer, account, (RecycleAdminOrganization) organization, enterprise);
    }
}
