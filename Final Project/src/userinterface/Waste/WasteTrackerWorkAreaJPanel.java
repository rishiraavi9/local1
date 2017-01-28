/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Waste;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WasteControlAdminOrganization;
import Business.Organization.WasteTrackerOrganization;
import Business.PollutionSensor.PollutionSensor;
import Business.Role.Role;
import Business.Role.WasteControlAdmin;
import Business.UserAccount.UserAccount;
import Business.WasteSensor.WasteSensor;
import Business.WorkQueue.WasteWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author RishikRaavi
 */
public class WasteTrackerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WasteTrackerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private WasteTrackerOrganization wasteTrackerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Role role;
   

    public WasteTrackerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, WasteTrackerOrganization wasteTrackerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.wasteTrackerOrganization = wasteTrackerOrganization;
        populateWorkRequestTable();
        populateWasteTable();
    }

    private void populateWorkRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tblManageRequest.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (userAccount.getWorkQueue().getWorkRequestList() != null) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((WasteWorkRequest) request).getResult();
                row[3] = result == null ? "Waiting" : result;
                String emerLevel = ((WasteWorkRequest) request).getEmerLevel();
                row[4] = emerLevel;
                int totalWaste = ((WasteWorkRequest) request).getTotalWaste();
                row[5] = totalWaste;

                model.addRow(row);
            }
        }
    }

    public void populateWasteTable() {
        DefaultTableModel model = (DefaultTableModel) gasTable.getModel();
        model.setRowCount(0);
        if (enterprise.getWasteSensorList().getWasteSensorList() != null) {
            for (WasteSensor p : enterprise.getWasteSensorList().getWasteSensorList()) {
                Object row[] = new Object[7];
                row[0] = p;
                row[1] = p.getHouseWaste();
                row[2] = p.getHazardousWaste();
                row[3] = p.getHouseWaste();
                row[4] = p.getEmergencyLevel();
                row[5] = p.getTotalWeight();
                row[6] = p.getWasteStatus();
                ((DefaultTableModel) gasTable.getModel()).addRow(row);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdJtext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        coJText = new javax.swing.JTextField();
        zipJText = new javax.swing.JTextField();
        cyJText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        areaText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gasTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkDanger = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        alert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblManageRequest = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("ZipCode");

        jLabel10.setText("Wastes");

        jLabel11.setText("Area Details:");

        jLabel1.setText(" Area");

        gasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area", "House Waste", "Hospital Waste", "Hazardous Waste", "Danger Level", "Total Weight", "Status"
            }
        ));
        jScrollPane3.setViewportView(gasTable);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Pollutiom/big-data-and-implications-on-platform-architecture-22-638.jpg"))); // NOI18N

        jLabel2.setText("House Waste");

        jLabel3.setText("Hospital Waste");

        checkDanger.setBackground(new java.awt.Color(0, 204, 51));
        checkDanger.setText("Check Danger Level ");
        checkDanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDangerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 51));
        jLabel7.setText("Work Request");

        jLabel5.setText("Hazardous Waste");

        alert.setBackground(new java.awt.Color(0, 204, 51));
        alert.setText("Alert to Waste Control Admin");
        alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 51));
        jLabel6.setText("Enter Waste Sensor Data:");

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblManageRequest.setBackground(new java.awt.Color(153, 255, 255));
        tblManageRequest.setForeground(new java.awt.Color(51, 0, 255));
        tblManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Receiver", "Status", "Result", "Emergency Level", "Total Garbage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblManageRequest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(121, 121, 121)
                        .addComponent(alert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(checkDanger)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel10)
                                .addComponent(jLabel5))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cyJText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coJText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel11)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel8))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(areaText)
                                .addComponent(zipJText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(checkDanger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addComponent(alert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(6, 6, 6))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addContainerGap(452, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(zipJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(coJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cyJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(439, 439, 439)))))
        );
    }// </editor-fold>//GEN-END:initComponents
//validation for alphabets

    public boolean Alphabet(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
//validation for Integers

    private boolean Int(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private void checkDangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDangerActionPerformed
        // TODO add your handling code here:
        String area = areaText.getText();
        String house = cdJtext.getText();
        String hospital = coJText.getText();
        String hazardous = cyJText.getText();
        String zipCode = zipJText.getText();
//Validations
        if (area == null || area.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Area cannot be blank");
            return;
        } else if (!Alphabet(area)) {
            JOptionPane.showMessageDialog(null, "Please Enter Area in Alphabets ");
            return;
        } else if (house == null || house.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "House Waste cannot be blank");
            return;
        } else if (!Int(house)) {
            JOptionPane.showMessageDialog(null, "Fileds should contain only numbers");
            return;
        } else if (Integer.parseInt(String.valueOf(house)) <= 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Positive House Waste Value");
            return;
        } else if (hospital == null || hospital.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Hospital Waste cannot be blank");
            return;
        } else if (!Int(hospital)) {
            JOptionPane.showMessageDialog(null, "Fileds should contain only numbers");
            return;
        } else if (Integer.parseInt(String.valueOf(hospital)) <= 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Positive Hospital Waste Value");
            return;
        } else if (hazardous == null || hazardous.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Hazardous Waste cannot be blank");
            return;
        } else if (!Int(hazardous)) {
            JOptionPane.showMessageDialog(null, "Fileds should contain only numbers");
            return;
        } else if (Integer.parseInt(String.valueOf(hazardous)) <= 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Positive Hazardous Waste Value");
            return;
        } else if (zipCode == null || zipCode.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be blank");
            return;
        } else if (!Int(zipCode)) {
            JOptionPane.showMessageDialog(null, "Fileds should contain only numbers");
            return;
        } else if (Integer.parseInt(String.valueOf(zipCode)) <= 0) {
            JOptionPane.showMessageDialog(null, "Zip Code cannot be Negative");
            return;
            
        } 
        
        else if (zipJText.getText().length()>6) {
            JOptionPane.showMessageDialog(null, "Zip Code should not exceed 6 numbers");
            return;
        } 
        else {

            String dangerStatus;

            if (Integer.parseInt(house) > 50 || Integer.parseInt(hospital) > 50 || Integer.parseInt(hazardous) > 50) {
                dangerStatus = "Critical";

            } else {
                dangerStatus = "Normal";
            }

            WasteSensor p = new WasteSensor();

            p.setArea(area);
            p.setHouseWaste(Integer.parseInt(house));
            p.setHospitalWaste(Integer.parseInt(hospital));
            p.setHazardousWaste(Integer.parseInt(hazardous));
            p.setEmergencyLevel(dangerStatus);
            p.setZipCode(Integer.parseInt(zipCode));
            int totalWaste = (Integer.parseInt(house)) + (Integer.parseInt(hospital)) + (Integer.parseInt(hazardous));

           
            enterprise.getWasteSensorList().createSensor(area, Integer.parseInt(house), Integer.parseInt(hospital), Integer.parseInt(hazardous), dangerStatus, Integer.parseInt(zipCode), totalWaste);
           
            populateWasteTable();
            JOptionPane.showMessageDialog(null, "Danger Level Checked");

            areaText.setText("");
            cdJtext.setText("");
            coJText.setText("");
            cyJText.setText("");
            zipJText.setText("");

        }

    }//GEN-LAST:event_checkDangerActionPerformed

    private void alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertActionPerformed
        // TODO add your handling code here:

        int selectedRow = gasTable.getSelectedRow();

        if (selectedRow >= 0) {

            DefaultTableModel model = (DefaultTableModel) gasTable.getModel();
            String emerFlag = (String) model.getValueAt(selectedRow, 4);

            if (emerFlag.equals("Normal")) {
                JOptionPane.showMessageDialog(null, "Selected request is Normal",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;

            }
            
            WasteSensor s = (WasteSensor) model.getValueAt(selectedRow, 0);
            
            String status = (String) model.getValueAt(selectedRow, 6);
            if (status != null) {
                JOptionPane.showMessageDialog(null, "Record Already Exist,Please Select Another Record");
                return;
            }
            WasteControlAdmin wc;
            String message = s.getArea();
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    Role role = ua.getRole();
                    if (role instanceof WasteControlAdmin) {
                        account = ua;
                    }
                }
            }
            WasteWorkRequest pwr = new WasteWorkRequest();
            s.setWasteStatus("Recorded");
            pwr.setMessage(message);
            pwr.setSender(userAccount);
            pwr.setStatus("Sent");
            pwr.setReceiver(account);
            pwr.setEmerLevel(s.getEmergencyLevel());

            pwr.setTotalWaste(s.getTotalWeight());
            pwr.setZipCode(s.getZipCode());

            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof WasteControlAdminOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {

                org.getWorkQueue().getWorkRequestList().add(pwr);
                userAccount.getWorkQueue().getWorkRequestList().add(pwr);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        populateWorkRequestTable();
        populateWasteTable();

        JOptionPane.showMessageDialog(null, "Waste Control Admin had been alerted to take necessary action");
        

    }//GEN-LAST:event_alertActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alert;
    private javax.swing.JTextField areaText;
    private javax.swing.JTextField cdJtext;
    private javax.swing.JButton checkDanger;
    private javax.swing.JTextField coJText;
    private javax.swing.JTextField cyJText;
    private javax.swing.JTable gasTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblManageRequest;
    private javax.swing.JTextField zipJText;
    // End of variables declaration//GEN-END:variables
}
