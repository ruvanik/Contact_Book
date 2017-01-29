/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.addressbook;

import com.addressbook.ContactFormGUI;
import com.addressbook.DBManager;
import com.addressbook.Users;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

/**
 *
 * @author ruvani
 */
public class ViewAllContactsGUI extends javax.swing.JFrame implements ListSelectionListener  {

    /**
     * Creates new form ViewAllContactsGUI
     */
    public ViewAllContactsGUI() {
        initComponents();
     ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.addListSelectionListener( this );
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ADBookPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("AddressBookProPU").createEntityManager();
        usersQuery = java.beans.Beans.isDesignTime() ? null : ADBookPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery.getResultList();
        usersQuery1 = java.beans.Beans.isDesignTime() ? null : ADBookPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery1.getResultList();
        AddressBookProPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("AddressBookProPU").createEntityManager();
        usersQuery2 = java.beans.Beans.isDesignTime() ? null : AddressBookProPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery2.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usersList2, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstname}"));
        columnBinding.setColumnName("Firstname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastname}"));
        columnBinding.setColumnName("Lastname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mobile}"));
        columnBinding.setColumnName("Mobile");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${website}"));
        columnBinding.setColumnName("Website");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-Delete-icon.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("  View All Contacts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(ViewAllContactsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllContactsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllContactsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllContactsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               ViewAllContactsGUI va= new ViewAllContactsGUI();
                va.setLocation(600,200);
                va.setLocationRelativeTo(null);
                va.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ADBookPUEntityManager;
    private javax.persistence.EntityManager AddressBookProPUEntityManager;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<com.addressbook.Users> usersList;
    private java.util.List<com.addressbook.Users> usersList1;
    private java.util.List<com.addressbook.Users> usersList2;
    private javax.persistence.Query usersQuery;
    private javax.persistence.Query usersQuery1;
    private javax.persistence.Query usersQuery2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
            if (e.getSource() == jTable1.getSelectionModel()
            && e.getValueIsAdjusting()) {
            //get the value of the primary key column for row being clicked
            TableModel model = (TableModel) jTable1.getModel();
            Integer i = (Integer) model.getValueAt(jTable1.getSelectedRow(), 0);
            
            //create new instance of DBManager and find the Contacts bean
            //with this primary key
            DBManager dbm = new DBManager();
            Users c = dbm.findById(i);
            dbm.close();
            
            //create a new GridBagGUI window
            ContactFormGUI cf=new ContactFormGUI(c);
            cf.setLocation(600,200);
            cf.setLocationRelativeTo(null);
            cf.setVisible(true);
            
            //close this window
            setVisible(false);
            dispose();
        }
    
    }

    
}
