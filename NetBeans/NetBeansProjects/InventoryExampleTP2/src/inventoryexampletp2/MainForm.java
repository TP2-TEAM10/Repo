/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryexampletp2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cyanp
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        AppointmentTable_update();
        ContactUsTable_update();
    }
    Connection con1;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        MainFormOrdersLabel = new javax.swing.JLabel();
        AudiLabel = new javax.swing.JLabel();
        MainFormStockLevels = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MainFormCustomerLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MainFormStockLevels1 = new javax.swing.JLabel();
        MainFormStockLevels2 = new javax.swing.JLabel();
        MainFormStockLevels3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContactUsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(191, 30, 46));

        jLabel12.setBackground(new java.awt.Color(102, 0, 0));
        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dashboard");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        MainFormOrdersLabel.setBackground(new java.awt.Color(102, 0, 0));
        MainFormOrdersLabel.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormOrdersLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainFormOrdersLabel.setText("Orders");

        AudiLabel.setBackground(new java.awt.Color(102, 0, 0));
        AudiLabel.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        AudiLabel.setForeground(new java.awt.Color(255, 255, 255));
        AudiLabel.setText("Audi");
        AudiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AudiLabelMouseClicked(evt);
            }
        });

        MainFormStockLevels.setBackground(new java.awt.Color(102, 0, 0));
        MainFormStockLevels.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormStockLevels.setForeground(new java.awt.Color(255, 255, 255));
        MainFormStockLevels.setText("Bmw");
        MainFormStockLevels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFormStockLevelsMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Log Out");

        MainFormCustomerLabel.setBackground(new java.awt.Color(102, 0, 0));
        MainFormCustomerLabel.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormCustomerLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainFormCustomerLabel.setText("Customers");
        MainFormCustomerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFormCustomerLabelMouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(102, 0, 0));
        jLabel13.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Exit");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        MainFormStockLevels1.setBackground(new java.awt.Color(102, 0, 0));
        MainFormStockLevels1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormStockLevels1.setForeground(new java.awt.Color(255, 255, 255));
        MainFormStockLevels1.setText("Toyota");
        MainFormStockLevels1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFormStockLevels1MouseClicked(evt);
            }
        });

        MainFormStockLevels2.setBackground(new java.awt.Color(102, 0, 0));
        MainFormStockLevels2.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormStockLevels2.setForeground(new java.awt.Color(255, 255, 255));
        MainFormStockLevels2.setText("Volkswagen");
        MainFormStockLevels2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFormStockLevels2MouseClicked(evt);
            }
        });

        MainFormStockLevels3.setBackground(new java.awt.Color(102, 0, 0));
        MainFormStockLevels3.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        MainFormStockLevels3.setForeground(new java.awt.Color(255, 255, 255));
        MainFormStockLevels3.setText("Mercedes");
        MainFormStockLevels3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainFormStockLevels3MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Main Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainFormCustomerLabel)
                    .addComponent(MainFormOrdersLabel)
                    .addComponent(AudiLabel)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3)
                    .addComponent(MainFormStockLevels1)
                    .addComponent(MainFormStockLevels2)
                    .addComponent(MainFormStockLevels3)
                    .addComponent(MainFormStockLevels))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(64, 64, 64)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFormOrdersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AudiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFormStockLevels1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFormStockLevels2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainFormStockLevels3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainFormStockLevels, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFormCustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        ContactUsTable.setBackground(new java.awt.Color(255, 255, 255));
        ContactUsTable.setBorder(new javax.swing.border.MatteBorder(null));
        ContactUsTable.setForeground(new java.awt.Color(0, 0, 0));
        ContactUsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "name", "email", "subject", "textarea"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ContactUsTable);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Customer Enquiries");

        AppointmentTable.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentTable.setBorder(new javax.swing.border.MatteBorder(null));
        AppointmentTable.setForeground(new java.awt.Color(0, 0, 0));
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "email", "first_name", "last_name", "date", "time", "booking_number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(AppointmentTable);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Appointments Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(199, 199, 199))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AudiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AudiLabelMouseClicked
        // TODO add your handling code here:

        AudiForm AudiForm = new AudiForm();
        AudiForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_AudiLabelMouseClicked

    private void AppointmentTable_update() {
        try {
            int x;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "");
                pst = con1.prepareStatement("select * from `appointments` ");
                ResultSet rs = pst.executeQuery();

                ResultSetMetaData rsd = rs.getMetaData();
                x = rsd.getColumnCount();

                DefaultTableModel d = (DefaultTableModel) AppointmentTable.getModel();
                d.setRowCount(0);

                while (rs.next()) {

                    Vector v2 = new Vector();
                    for (int i = 1; i <= x; i++) {
                        v2.add(rs.getString("id"));
                        v2.add(rs.getString("email"));
                        v2.add(rs.getString("first_name"));
                        v2.add(rs.getString("last_name"));
                        v2.add(rs.getString("date"));
                        v2.add(rs.getString("time"));
                        v2.add(rs.getString("booking_number"));

                    }

                    d.addRow(v2);

                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void ContactUsTable_update() {
        try {
            int x;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "");
                pst = con1.prepareStatement("select * from `contact_us` ");
                ResultSet rs = pst.executeQuery();

                ResultSetMetaData rsd = rs.getMetaData();
                x = rsd.getColumnCount();

                DefaultTableModel d = (DefaultTableModel) ContactUsTable.getModel();
                d.setRowCount(0);

                while (rs.next()) {

                    Vector v2 = new Vector();
                    for (int i = 1; i <= x; i++) {
                        v2.add(rs.getString("id"));
                        v2.add(rs.getString("name"));
                        v2.add(rs.getString("email"));
                        v2.add(rs.getString("subject"));
                        v2.add(rs.getString("textarea"));

                    }

                    d.addRow(v2);

                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void StockLevelsTable_update() {
        int x;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "");
            pst = con1.prepareStatement("SELECT t1.id_toyota, t2.id_bmw, t3.id_audi, t4.id_volkswagen, t5.id_mercedes, \n"
                    + "t1.make, t2.model, t3.quantity, t4.make, t5.model \n"
                    + "FROM java_toyota t1 \n"
                    + "INNER JOIN java_bmw t2 ON t1.id_toyota = t2.id_bmw \n"
                    + "INNER JOIN java_audi t3 ON t1.id_toyota = t3.id_audi \n"
                    + "INNER JOIN java_volkswagen t4 ON t1.id_toyota = t4.id_volkswagen \n"
                    + "INNER JOIN java_mercedes t5 ON t1.id_toyota = t5.id_mercedes;");
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            x = rsd.getColumnCount();

            DefaultTableModel d = (DefaultTableModel) ContactUsTable.getModel();
            d.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();
                for (int i = 1; i <= x; i++) {
                    v2.add(rs.getString("id_audi"));
                    v2.add(rs.getString("make"));
                    v2.add(rs.getString("model"));
                    v2.add(rs.getString("quantity"));
                   // v2.add(rs.getString("textarea"));

                }
                d.addRow(v2);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void MainFormCustomerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFormCustomerLabelMouseClicked
        // TODO add your handling code here:
        CustomerForm MyCustomerForm = new CustomerForm();
        MyCustomerForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_MainFormCustomerLabelMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        MainForm MainForm = new MainForm();
        MainForm.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void MainFormStockLevels1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFormStockLevels1MouseClicked
        // TODO add your handling code here:
        ToyotaForm ToyotaForm = new ToyotaForm();
        ToyotaForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_MainFormStockLevels1MouseClicked

    private void MainFormStockLevels2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFormStockLevels2MouseClicked
        // TODO add your handling code here:
        VolkswagenForm VolkswagenForm = new VolkswagenForm();
        VolkswagenForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_MainFormStockLevels2MouseClicked

    private void MainFormStockLevels3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFormStockLevels3MouseClicked
        // TODO add your handling code here:
        MercedesForm MercedesForm = new MercedesForm();
        MercedesForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_MainFormStockLevels3MouseClicked

    private void MainFormStockLevelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainFormStockLevelsMouseClicked
        // TODO add your handling code here:
        BmwForm BmwForm = new BmwForm();
        BmwForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_MainFormStockLevelsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JLabel AudiLabel;
    private javax.swing.JTable ContactUsTable;
    private javax.swing.JLabel MainFormCustomerLabel;
    private javax.swing.JLabel MainFormOrdersLabel;
    private javax.swing.JLabel MainFormStockLevels;
    private javax.swing.JLabel MainFormStockLevels1;
    private javax.swing.JLabel MainFormStockLevels2;
    private javax.swing.JLabel MainFormStockLevels3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}