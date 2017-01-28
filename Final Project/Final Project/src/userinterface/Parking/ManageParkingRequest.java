/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Parking;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ParkingControlAdminOrganization;
import Business.Organization.ParkingOfficerOrganization;
import Business.Person.Person;
import Business.Role.ParkingControlAdmin;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ParkingWorkRequest;
import Business.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import java.io.FileOutputStream;



import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;



import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Document;

/**
 *
 * @author RishikRaavi
 */
public class ManageParkingRequest extends javax.swing.JPanel {

    /**
     * Creates new form ManageParkingRequest
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    UserAccount account;
    ParkingOfficerOrganization parkingOfficerOrganization;
    Enterprise enterprise;

    public ManageParkingRequest(JPanel userProcessContainer, UserAccount userAccount, ParkingOfficerOrganization parkingOfficerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.parkingOfficerOrganization = parkingOfficerOrganization;
        this.enterprise = enterprise;
        populateTable();
        populateAmountTable();
        populateWorkRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateWorkRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRequest = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        priceJTex = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        taxJText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalJText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        personTable1 = new javax.swing.JTable();
        geneParking = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCreateWorkRequest.setText("Sent to Control Admin For Approval");
        btnCreateWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateWorkRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("Manage Parking Work Request");

        tblManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Message", "Status", "Result", "Address", "Total Price", "Bill No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageRequest);

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Person Id", "Name", "Vehcile Number", "Area", "typeOfParking"
            }
        ));
        jScrollPane3.setViewportView(personTable);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        priceJTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceJTexActionPerformed(evt);
            }
        });

        jLabel7.setText("Tax");

        taxJText.setEnabled(false);

        jLabel8.setText("Total Price");

        totalJText.setEnabled(false);

        jButton3.setText("Calculate Total Price");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        personTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Person Id", "Area", "Name", "Vehcile Number", "Total Price", "Bill No", "Ticket Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(personTable1);

        geneParking.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Parking Bill No:");

        jButton2.setText("Generate Parking Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(taxJText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(priceJTex, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(totalJText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(jButton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(geneParking, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCreateWorkRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(priceJTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(taxJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(totalJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(geneParking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnCreateWorkRequest))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        model.setRowCount(0);
        if (enterprise.getPersonList().getPersonList() != null) {
            for (Person p : enterprise.getPersonList().getPersonList()) {

                Object row[] = new Object[5];
                row[0] = p;
                row[1] = p.getPersonFirstName() + p.getPersonLastName();
                row[2] = p.getVehcileNumber();
                row[3] = p.getArea();
                row[4] = p.getTypeOfParking();
                 personTable.getColumnModel().getColumn(0).setMinWidth(0);
            personTable.getColumnModel().getColumn(0).setMaxWidth(0);
            personTable.getColumnModel().getColumn(0).setWidth(0);

                ((DefaultTableModel) personTable.getModel()).addRow(row);
            }
        }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = personTable.getSelectedRow();
        if(priceJTex.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please Enter the Price");
        return;
        }
        if (selectedRow >= 0) {
            
            
            
            Person p = (Person) personTable.getValueAt(selectedRow, 0);
            String initialStatus = p.getStatus();
            if (initialStatus == "Ticket Generated") {
                JOptionPane.showMessageDialog(null, "Tiket has been already generated");
                return;
            } else {
                float price = Float.parseFloat(priceJTex.getText());
                float taxpercent = 0.05f;
                float f = price + price * taxpercent;
                totalJText.setText(String.valueOf(price + price * taxpercent));
                String status = "Ticket Generated";

                taxJText.setText(String.valueOf(taxpercent));
                geneParking.setText("PAR" + String.valueOf((int) (Math.random() * 100000)));
                
                enterprise.getPersonList().createTicket(geneParking.getText(), p);

                enterprise.getPersonList().createAmount(price, taxpercent, f, status, p);
JOptionPane.showMessageDialog(null,"Bill Generated Success");
                populateAmountTable();
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select a row");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public void populateAmountTable() {
        DefaultTableModel model = (DefaultTableModel) personTable1.getModel();
        model.setRowCount(0);
        if (enterprise.getPersonList().getPersonList() != null) {
            for (Person p : enterprise.getPersonList().getPersonList()) {

                Object row[] = new Object[7];
                row[0] = p;
                row[1] = p.getPersonFirstName() + p.getPersonLastName();
                row[2] = p.getVehcileNumber();
                row[3] = p.getArea();
                row[4] = p.getTotalPrice();
                row[5] = p.getBillNo();
                row[6] = p.getStatus();
                 personTable1.getColumnModel().getColumn(0).setMinWidth(0);
            personTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            personTable1.getColumnModel().getColumn(0).setWidth(0);

                ((DefaultTableModel) personTable1.getModel()).addRow(row);
            }
        }

    }
    private void btnCreateWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateWorkRequestActionPerformed

        int selectedRow = personTable1.getSelectedRow();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) personTable1.getModel();
            Person p = (Person) model.getValueAt(selectedRow, 0);
            if(p.getBillNo()==null){
                JOptionPane.showMessageDialog(null,"Plz Generate Bill First");
                return;
            }
            if(p.getStatus()!="Ticket Generated"){
            JOptionPane.showMessageDialog(null,"Plz check status");
                return;
            
            }
            if(p.getParkingRequestStatus()=="Created"){
                JOptionPane.showMessageDialog(null,"Record Exist");
                return;
            }
            ParkingControlAdmin pa;
            String message = p.getArea();
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    Role role = ua.getRole();
                    if (role instanceof ParkingControlAdmin) {
                        account = ua;
                    }

                }

            }
            ParkingWorkRequest pwr = new ParkingWorkRequest();
            pwr.setMessage(message);
            pwr.setSender(userAccount);
            pwr.setStatus("Sent");
            pwr.setReceiver(account);
            pwr.setAddress(p.getAddress());
            pwr.setTotalPrice(p.getTotalPrice());
            pwr.setZipCode(p.getZipCode());
            pwr.setPersonFirstName(p.getPersonFirstName());
            pwr.setBillNo(p.getBillNo());
            pwr.setTax(p.getTax());
            pwr.setPrice(p.getPrice());
            p.setParkingRequestStatus("Created");
            Organization org = null;
            for (Organization org1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (org1 instanceof ParkingControlAdminOrganization) {
                    org = org1;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(pwr);
                userAccount.getWorkQueue().getWorkRequestList().add(pwr);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;

        }
        populateWorkRequestTable();
        JOptionPane.showMessageDialog(null, "Work Request was added successfully");
      
    }//GEN-LAST:event_btnCreateWorkRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      int selectedRow = tblManageRequest.getSelectedRow();

        if (selectedRow >= 0) {
         DefaultTableModel model = (DefaultTableModel) tblManageRequest.getModel();
         ParkingWorkRequest p = (ParkingWorkRequest) model.getValueAt(selectedRow, 0);
        if(p.getStatus().equals("Completed")){
        ParkingBill doctorPrescriptionJPanel = new ParkingBill(userProcessContainer, userAccount, parkingOfficerOrganization, enterprise,p);
        userProcessContainer.add("Parking Bill", doctorPrescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
        JOptionPane.showMessageDialog(null,"Please select completed request");
        return;
        
        }
     
        }
        else{
        
        JOptionPane.showMessageDialog(null, "Please select a row");
        return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void priceJTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceJTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceJTexActionPerformed



 


        public void populateWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageRequest.getModel();
        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((ParkingWorkRequest) request).getTestResult();
                row[3] = result == null ? "Waiting" : result;
                String emLevel = ((ParkingWorkRequest) request).getAddress();
                row[4] = emLevel;
                float carbonO2 = ((ParkingWorkRequest) request).getTotalPrice();
                row[5] = carbonO2;
                row[6]=((ParkingWorkRequest) request).getBillNo();

                model.addRow(row);
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateWorkRequest;
    private javax.swing.JTextField geneParking;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable personTable;
    private javax.swing.JTable personTable1;
    private javax.swing.JTextField priceJTex;
    private javax.swing.JTextField taxJText;
    private javax.swing.JTable tblManageRequest;
    private javax.swing.JTextField totalJText;
    // End of variables declaration//GEN-END:variables
}
