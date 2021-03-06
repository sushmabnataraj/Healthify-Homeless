/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.SystemAdminWorkArea.ManageNetworkJPanel;
import java.util.logging.*;

/**
 *
 * @author maneesh
 */
public class NgoLoginPage extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form NgoLoginPage
     */
    JPanel container;
    Organization org;
    Enterprise enterprise;
    Network network;
     EcoSystem business;
    public NgoLoginPage(JPanel container, Organization org, Enterprise enterprise, Network network,  EcoSystem business) {
        this.container = container;
        this.org = org;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        initComponents();
        logr.info("LoggingIn");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignToHospital1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        payBills = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        managepatients1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        assignToHospital = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        assignToHospital1.setBackground(new java.awt.Color(0, 102, 153));
        assignToHospital1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignToHospital1.setForeground(new java.awt.Color(0, 102, 153));
        assignToHospital1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignToHospital1MouseClicked(evt);
            }
        });

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, jLabel5.getFont().getSize()+3));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ASSIGN TO HOSPITAL");

        javax.swing.GroupLayout assignToHospital1Layout = new javax.swing.GroupLayout(assignToHospital1);
        assignToHospital1.setLayout(assignToHospital1Layout);
        assignToHospital1Layout.setHorizontalGroup(
            assignToHospital1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        assignToHospital1Layout.setVerticalGroup(
            assignToHospital1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignToHospital1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );

        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NGO Logged in");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 59));

        payBills.setBackground(new java.awt.Color(0, 102, 153));
        payBills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payBills.setForeground(new java.awt.Color(0, 102, 153));
        payBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payBillsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payBillsMouseEntered(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+3));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAY BILLS");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/gen_bills_pj.png"))); // NOI18N

        javax.swing.GroupLayout payBillsLayout = new javax.swing.GroupLayout(payBills);
        payBills.setLayout(payBillsLayout);
        payBillsLayout.setHorizontalGroup(
            payBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        payBillsLayout.setVerticalGroup(
            payBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payBillsLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );

        add(payBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 220, 240));

        managepatients1.setBackground(new java.awt.Color(0, 102, 153));
        managepatients1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managepatients1.setForeground(new java.awt.Color(0, 102, 153));
        managepatients1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managepatients1MouseClicked(evt);
            }
        });

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+3));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGE PATIENTS");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/patients_pj.png"))); // NOI18N

        javax.swing.GroupLayout managepatients1Layout = new javax.swing.GroupLayout(managepatients1);
        managepatients1.setLayout(managepatients1Layout);
        managepatients1Layout.setHorizontalGroup(
            managepatients1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        managepatients1Layout.setVerticalGroup(
            managepatients1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managepatients1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );

        add(managepatients1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 220, 240));

        assignToHospital.setBackground(new java.awt.Color(0, 102, 153));
        assignToHospital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignToHospital.setForeground(new java.awt.Color(0, 102, 153));
        assignToHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignToHospitalMouseClicked(evt);
            }
        });

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, jLabel6.getFont().getSize()+3));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ASSIGN TO HOSPITAL");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/assg_to_doc.png"))); // NOI18N

        javax.swing.GroupLayout assignToHospitalLayout = new javax.swing.GroupLayout(assignToHospital);
        assignToHospital.setLayout(assignToHospitalLayout);
        assignToHospitalLayout.setHorizontalGroup(
            assignToHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        assignToHospitalLayout.setVerticalGroup(
            assignToHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignToHospitalLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(32, 32, 32))
        );

        add(assignToHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 220, 240));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/ngo_bg.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void payBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBillsMouseClicked
 // TODO add your handling code here:
        AssignToHospitalPanel assignHospital=new AssignToHospitalPanel(org, enterprise, container, network);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
                
    }//GEN-LAST:event_payBillsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AssignToHospitalPanel assignHospital=new AssignToHospitalPanel(org, enterprise, container, network);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        AssignToHospitalPanel assignHospital=new AssignToHospitalPanel(org, enterprise, container, network);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void managepatients1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managepatients1MouseClicked
        // TODO add your handling code here:        
        ManagePatientsJPanel manageNetworkJPanel=new ManagePatientsJPanel(org, container);
        container.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_managepatients1MouseClicked

    private void assignToHospital1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignToHospital1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_assignToHospital1MouseClicked

    private void assignToHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignToHospitalMouseClicked
        // TODO add your handling code here:
        AssignToHospitalPanel assignHospital=new AssignToHospitalPanel(org, enterprise, container, network);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_assignToHospitalMouseClicked

    private void payBillsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBillsMouseEntered
        // TODO add your handling code here:
        PayPatientBill assignHospital=new PayPatientBill(org, enterprise, container, network, business);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_payBillsMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignToHospital;
    private javax.swing.JPanel assignToHospital1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel managepatients1;
    private javax.swing.JPanel payBills;
    // End of variables declaration//GEN-END:variables
}
