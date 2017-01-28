/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pollutiom;

import Business.Enterprise.Enterprise;
import Business.Organization.PollutionControlAdminOrganization;
import Business.PollutionSensor.PollutionSensor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PollutionWorkRequest;
import Business.WorkQueue.WasteWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.Browser;

import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;




import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.w3c.dom.Document;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author RishikRaavi
 */
public class ManageWorkRequesarkingControlAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestControlAdmin
     */
    JPanel userProcessContainer; UserAccount account;PollutionControlAdminOrganization pollutionControlAdminOrganization; Enterprise enterprise;
    public ManageWorkRequesarkingControlAdmin(JPanel userProcessContainer, UserAccount account, PollutionControlAdminOrganization pollutionControlAdminOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.pollutionControlAdminOrganization=pollutionControlAdminOrganization;
        this.enterprise=enterprise;
         populateWorkRequestTable();
         
                
                
    }
public String getCellValue(int x,int y){
        return  workRequestJTable.getValueAt(x, y).toString();

}
  public void writeToExcel(){
      XSSFWorkbook wb=new XSSFWorkbook();
      XSSFSheet ws=wb.createSheet();
      TreeMap<String,Object[]> data=new TreeMap<>();
      data.put("0",new Object[]{workRequestJTable.getColumnName(0),workRequestJTable.getColumnName(1)
      ,workRequestJTable.getColumnName(2)
      ,workRequestJTable.getColumnName(3)
      ,workRequestJTable.getColumnName(4)
      ,workRequestJTable.getColumnName(5)
      ,workRequestJTable.getColumnName(6)
      ,workRequestJTable.getColumnName(7)});
      
      for(int i=0;i<workRequestJTable.getRowCount();i++){
//         data.put("i",new Object[]{getCellValue(0,0),getCellValue(0,1),getCellValue(0,2),getCellValue(0,3),getCellValue(0,4),getCellValue(0,5),getCellValue(0,6),getCellValue(0,7)});
               
        data.put("1",new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2),getCellValue(i,3),getCellValue(i,4),getCellValue(i,5),getCellValue(i,6),getCellValue(i,7)});
           // data.put("4",new Object[]{getCellValue(3,0),getCellValue(3,1),getCellValue(3,2),getCellValue(3,3),getCellValue(3,4),getCellValue(3,5),getCellValue(3,6),getCellValue(3,7)});
      }        
      
      Set<String> ids=data.keySet();
      XSSFRow row;
      int rowId=0;
      for(String key:ids){
      row=ws.createRow(rowId++);
      Object[] values=data.get(key);
      int cellId=0;
      for(Object o:values){
      XSSFCell cell=row.createCell(cellId++);
      cell.setCellValue(o.toString());
      }
      }
      try{
      FileOutputStream f=new FileOutputStream(new File("D:/Excel.xlsx"));
      wb.write(f);
      f.close();
      }catch(Exception e){
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

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        viewMap = new javax.swing.JButton();
        mapJText = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        processJButton.setText("Submit Result");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Assign Request To Me");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Result");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Control Admin Work Request:");

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area", "Receiver", "Status", "Result", "Emergency Level", "CO2", "CO", "CN", "ZipCode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(workRequestJTable);

        viewMap.setText("View Map");
        viewMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMapActionPerformed(evt);
            }
        });

        jButton4.setText("Polluted Area Map");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Export Data To Excel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Area Vs Pollution Graph");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("View Pie Chart For Co2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Pie Chat for CO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("View Pie Chart for CN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(refreshJButton)
                                        .addGap(244, 244, 244)
                                        .addComponent(viewMap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(processJButton)
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(227, 227, 227)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(311, 311, 311)
                                                .addComponent(jButton1)))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mapJText, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(viewMap)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processJButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton2))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addComponent(jButton7)
                .addGap(46, 46, 46)
                .addComponent(mapJText, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
 DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
 if(txtResult.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null,"Plz Enter Result");
        return;
        }

        int selectedRow = workRequestJTable.getSelectedRow();
        
        
        if (selectedRow >= 0){
            
        String assignedReceiver = (String)model.getValueAt(selectedRow, 1);
        
        String statusFlag = (String)model.getValueAt(selectedRow, 2);
        
        if(assignedReceiver == null){
          JOptionPane.showMessageDialog(null, "Please assign a receiver",
                    "Warning",JOptionPane.WARNING_MESSAGE);
          
        }
        
        else if(statusFlag.equals("Completed")){
            JOptionPane.showMessageDialog(null,"The work request cant be pushed as it is completed");
            return;
        }
        
        else if(txtResult.getText() == null || txtResult.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Result cannot be blank");
            return;
        }
        else{
        PollutionWorkRequest request = (PollutionWorkRequest)(WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
if(request.getStatus().equals("Sent")){
               JOptionPane.showMessageDialog(null, "Requested should be assigned first",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
                return;
                }
                if(request.getStatus().equals("Completed")){
               JOptionPane.showMessageDialog(null, "Requested is already Completed",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
                return;
                }
       
        request.setTestResult(txtResult.getText());
        request.setStatus("Completed");
        
        populateWorkRequestTable();
        
        JOptionPane.showMessageDialog(null, "Request completed successfully",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
         }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row to submit the request",
                    "Warning",JOptionPane.WARNING_MESSAGE);  
        }
        

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to assign the request",
                    "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String statusFlag = (String)model.getValueAt(selectedRow, 2);     
       if(statusFlag.equals("Completed")){
            JOptionPane.showMessageDialog(null,"The work request cant be assigned as it is completed");
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Pending")){
        
        JOptionPane.showMessageDialog(null, "Request is already Set to Pending ",
            "Information",JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        if(request.getStatus().equals("Completed")){
        
        JOptionPane.showMessageDialog(null, "Request is already Set to Completed ",
            "Information",JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        request.setReceiver(account);
        request.setStatus("Pending");
        populateWorkRequestTable();
       
        JOptionPane.showMessageDialog(null, "Request assigned to you successfully",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
        viewMap.setEnabled(true);
        }
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMapActionPerformed
        // TODO add your handling code here:
int selectedRow = workRequestJTable.getSelectedRow();
        
        
        if (selectedRow >= 0){
            
         PollutionWorkRequest request = (PollutionWorkRequest)(WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        String loc1 = String.valueOf(request.getZipcode());
            loc1 = loc1.replace(' ', '+');

            String marker1 = loc1;
     
BufferedImage image;
        try {
            image = ImageIO.read(new URL("http://maps.googleapis.com/maps/api/staticmap?autoscale=1&size=400x400&maptype=roadmap&format=png&visual_refresh=true&markers=size:mid%7Ccolor:0xff0000%7Clabel:1%7C" + marker1));
         mapJText.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            Logger.getLogger(ManageWorkRequesarkingControlAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
        else{
        JOptionPane.showMessageDialog(null, "Please select a row to submit the request",
                    "Warning",JOptionPane.WARNING_MESSAGE); 
        
        }
    }//GEN-LAST:event_viewMapActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     int selectedRow = workRequestJTable.getSelectedRow();
        
        
        if (selectedRow >= 0){
            
         PollutionWorkRequest request = (PollutionWorkRequest)(WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);  
        Browser browser=new Browser();
        BrowserView view=new BrowserView(browser);

JFrame frame = new JFrame("JxBrowser Google Maps");
//frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

frame.add(view,BorderLayout.CENTER);

frame.setSize(700, 500);

frame.setLocationRelativeTo(null);

frame.setVisible(true);

 

browser.loadURL("https://www.google.com/maps/place/"+request.getZipcode());}
        else{
        
        JOptionPane.showMessageDialog(null, "Please select a row to submit the request",
                    "Warning",JOptionPane.WARNING_MESSAGE); 
        
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         
        HSSFWorkbook fWorkbook = new HSSFWorkbook();
                    HSSFSheet fSheet = fWorkbook.createSheet("new Sheet");
                    TreeMap<String,Object[]> data=new TreeMap<>();
    
                    HSSFFont sheetTitleFont = fWorkbook.createFont();
                    File file = new File(new File("").getAbsolutePath() + "/Pollution.xls");
                    HSSFCellStyle cellStyle = fWorkbook.createCellStyle();

                    sheetTitleFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                    //sheetTitleFont.setColor();
                    TableModel model = workRequestJTable.getModel();
                    TableColumnModel tcm = workRequestJTable.getColumnModel();
                    HSSFRow fRow1 = fSheet.createRow((short) 0);

                

                    for (int i = 0; i < model.getRowCount(); i++) {
                      
                        HSSFRow fRow = fSheet.createRow((short)i);
 for (int j = 0; j < model.getColumnCount(); j++) {
                            HSSFCell cell = fRow.createCell((short) j);
                            cell.setCellValue(tcm.getColumn(j).getHeaderValue().toString());
                            cell.setCellValue(model.getValueAt(i, j).toString());
  cell.setCellStyle(cellStyle);

                        }

                    }
               try{ FileOutputStream fileOutputStream;
                fileOutputStream = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
                fWorkbook.write(bos);
                bos.close();
             fileOutputStream.close();
 
                 }
               catch(Exception e){
               JOptionPane.showMessageDialog(null,"vvxcvxcv");
               }
              
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        XYSeriesCollection dataset = new XYSeriesCollection();
        JFreeChart lineChart = ChartFactory.createXYLineChart("Pollution Vs Area ","Area" , "Pollution", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        XYSeries cd= new XYSeries("Carbon Dioxide");
        XYSeries cm = new XYSeries("Carbon Monoxide");
        XYSeries cy = new XYSeries("Hydrogen Cyanide");
        
        int count = 0;
        
        for (WorkRequest p :pollutionControlAdminOrganization.getWorkQueue().getWorkRequestList()) {
        cd.add(count,((PollutionWorkRequest) p).getCabonDioxide());
        cm.add(count, ((PollutionWorkRequest) p).getCarbonMonoxide());
        cy.add(count, ((PollutionWorkRequest) p).getCyanide());
        
        count++;
        }
        
        dataset.addSeries(cd);
        dataset.addSeries(cm);
        dataset.addSeries(cy);
        
        
        ChartFrame chartFrame = new ChartFrame("VITAL SIGNS REPORT",lineChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(400,4000);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultPieDataset piedataset=new DefaultPieDataset();
        int rowcount=workRequestJTable.getRowCount();
        
        for(int i=0;i<=rowcount-1;i++){
           
            PollutionWorkRequest inventory = (PollutionWorkRequest)workRequestJTable.getValueAt(i,0);
            int j = inventory.getCabonDioxide();
            piedataset.setValue(inventory.toString(), j);
            
        }
            JFreeChart freechart=ChartFactory.createPieChart("Pie Chart for Carbon Dioxide", piedataset, true, true, Locale.ENGLISH);
            PiePlot plot=(PiePlot)freechart.getPlot();
            //plot.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame=new ChartFrame("Pie Chart",freechart);
            frame.setVisible(true);
            frame.setSize(500,500);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         DefaultPieDataset piedataset=new DefaultPieDataset();
        int rowcount=workRequestJTable.getRowCount();
        
        for(int i=0;i<=rowcount-1;i++){
           
            PollutionWorkRequest inventory = (PollutionWorkRequest)workRequestJTable.getValueAt(i,0);
            int j = inventory.getCarbonMonoxide();
            piedataset.setValue(inventory.toString(), j);
            
        }
            JFreeChart freechart=ChartFactory.createPieChart("Pie Chart for Carbon Monoxide", piedataset, true, true, Locale.ENGLISH);
            PiePlot plot=(PiePlot)freechart.getPlot();
            //plot.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame=new ChartFrame("Pie Chart",freechart);
            frame.setVisible(true);
            frame.setSize(500,500);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         DefaultPieDataset piedataset=new DefaultPieDataset();
        int rowcount=workRequestJTable.getRowCount();
        
        for(int i=0;i<=rowcount-1;i++){
           
            PollutionWorkRequest inventory = (PollutionWorkRequest)workRequestJTable.getValueAt(i,0);
            int j = inventory.getCyanide();
            piedataset.setValue(inventory.toString(), j);
            
        }
            JFreeChart freechart=ChartFactory.createPieChart("Pie Chart for Cyanide", piedataset, true, true, Locale.ENGLISH);
            PiePlot plot=(PiePlot)freechart.getPlot();
            //plot.setForegroundAlpha(TOP_ALIGNMENT);
            ChartFrame frame=new ChartFrame("Pie Chart",freechart);
            frame.setVisible(true);
            frame.setSize(500,500);  
    }//GEN-LAST:event_jButton7ActionPerformed
 public void populateWorkRequestTable(){
 DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        
            for(WorkRequest request :pollutionControlAdminOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[9];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            row[3] = request.getReceiver() == null ? "To be Assigned" : request.getReceiver().getEmployee().getName();
            row[4] = ((PollutionWorkRequest) request).getEmerLevel();
            row[5] = ((PollutionWorkRequest) request).getCabonDioxide();
            row[6] = ((PollutionWorkRequest) request).getCarbonMonoxide();
            row[7] = ((PollutionWorkRequest) request).getCyanide();
             row[8] = ((PollutionWorkRequest) request).getZipcode();
            
            
            model.addRow(row);
        }
 
 
 
 
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel mapJText;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField txtResult;
    private javax.swing.JButton viewMap;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
