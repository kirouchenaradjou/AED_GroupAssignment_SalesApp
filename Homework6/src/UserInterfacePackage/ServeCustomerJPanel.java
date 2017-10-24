/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage;

import BusinessPackage.Business;
import BusinessPackage.Customer;
import BusinessPackage.Order;
import BusinessPackage.Sales;
import UserInterfacePackage.Customer.CustomerViewJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ENVY
 */
public class ServeCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServeCustomerJPanel
     */
    Business b;
    private JPanel userContainer;
    private Customer customer;
    Order order = new Order();
    private static int actualTotla = 0;
    Sales sales;

    public ServeCustomerJPanel(JPanel userContainer, Business b, Customer customer, Sales sales) {
        initComponents();
        this.b = b;
        this.userContainer = userContainer;
        this.customer = customer;
        this.sales = sales;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnViewCust = new javax.swing.JButton();
        btnBookCust = new javax.swing.JButton();
        btnCheckOrder = new javax.swing.JButton();
        btnBrowseCatalog = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Customer Information Summary ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Person Contact Information");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 32, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 106, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Activity: Serve Customer");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 211, -1));

        btnViewCust.setText("View Customer History");
        btnViewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustActionPerformed(evt);
            }
        });
        add(btnViewCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 217, 201, -1));

        btnBookCust.setText("Book Customer Order");
        btnBookCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookCustActionPerformed(evt);
            }
        });
        add(btnBookCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 282, 201, -1));

        btnCheckOrder.setText("Check Order Status");
        btnCheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOrderActionPerformed(evt);
            }
        });
        add(btnCheckOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 347, 201, -1));

        btnBrowseCatalog.setText("Browse Product Catalog");
        btnBrowseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseCatalogActionPerformed(evt);
            }
        });
        add(btnBrowseCatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 417, -1, -1));

        backButton.setText("Back<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookCustActionPerformed
        // TODO add your handling code here:
        SalesBookCustomerOrder salesBookCustomerOrder = new SalesBookCustomerOrder(userContainer, b, customer, sales);
        userContainer.add("SalesBookCustomerOrder", salesBookCustomerOrder);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_btnBookCustActionPerformed

    private void btnCheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOrderActionPerformed
        // TODO add your handling code here:
        SalesOrderStatus salesOrderStatus = new SalesOrderStatus(userContainer, b, customer);
        userContainer.add("SalesOrderStatus", salesOrderStatus);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_btnCheckOrderActionPerformed

    private void btnBrowseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseCatalogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseCatalogActionPerformed

    private void btnViewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustActionPerformed
        // TODO add your handling code here:
        CustomerViewJPanel customerViewJPanel = new CustomerViewJPanel(userContainer, b, sales);
        userContainer.add("CustomerViewJPanel", customerViewJPanel);
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.next(userContainer);
    }//GEN-LAST:event_btnViewCustActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);

        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnBookCust;
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JButton btnCheckOrder;
    private javax.swing.JButton btnViewCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
