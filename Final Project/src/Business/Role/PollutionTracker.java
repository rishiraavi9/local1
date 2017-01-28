/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ParkingOfficerOrganization;
import Business.Organization.PollutionTrackerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ParkingWorkArea.ParkingWorkAreaJPanel;
import userinterface.Pollutiom.PollutionTrackerWorkAreaJPanel;

/**
 *
 * @author RishikRaavi
 */
public class PollutionTracker extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PollutionTrackerWorkAreaJPanel(userProcessContainer, account, (PollutionTrackerOrganization) organization, enterprise);
    }
}
