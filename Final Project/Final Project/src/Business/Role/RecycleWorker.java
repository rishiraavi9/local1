/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PollutionTrackerOrganization;
import Business.Organization.RecycleWorkerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Pollutiom.PollutionTrackerWorkAreaJPanel;
import userinterface.Waste.RecycleWorkerWorkArea;

/**
 *
 * @author RishikRaavi
 */
public class RecycleWorker extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new RecycleWorkerWorkArea(userProcessContainer, account, (RecycleWorkerOrganization) organization, enterprise);
    }
}
