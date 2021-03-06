/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WasteWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author RishikRaavi
 */
public class WasteWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WasteWorkAreaJPanel
     */
    JPanel userProcessContainer; UserAccount account; Organization organization; Enterprise enterprise;EcoSystem business;
    public WasteWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
        this.userProcessContainer=userProcessContainer;
        this.business=business;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PolEnt = new javax.swing.JButton();
        PolUser = new javax.swing.JButton();
        PolOrg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        PolEnt.setBackground(new java.awt.Color(0, 204, 51));
        PolEnt.setText("Manage Waste Employee");
        PolEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolEntActionPerformed(evt);
            }
        });

        PolUser.setBackground(new java.awt.Color(0, 204, 51));
        PolUser.setText("Manage Waste User Accounts");
        PolUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolUserActionPerformed(evt);
            }
        });

        PolOrg.setBackground(new java.awt.Color(0, 204, 51));
        PolOrg.setText("Manage Waste Organization");
        PolOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolOrgActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/WasteWorkArea/ShowImage (1).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PolEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 541, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PolOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(PolEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(PolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(552, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PolEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolEntActionPerformed
        // TODO add your handling code here:
        ManageWasteEmployee mwrp = new ManageWasteEmployee(userProcessContainer,account,organization,enterprise);
        userProcessContainer.add("Manage Organization",mwrp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PolEntActionPerformed

    private void PolUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolUserActionPerformed
        // TODO add your handling code here:
        ManageWasteUserAccounts mwrp = new ManageWasteUserAccounts(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("Manage Organization",mwrp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PolUserActionPerformed

    private void PolOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolOrgActionPerformed
        // TODO add your handling code here:
        ManageWasteOrganization mwrp = new ManageWasteOrganization(userProcessContainer,account,organization,enterprise);
        userProcessContainer.add("Manage Organization",mwrp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PolOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PolEnt;
    private javax.swing.JButton PolOrg;
    private javax.swing.JButton PolUser;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
