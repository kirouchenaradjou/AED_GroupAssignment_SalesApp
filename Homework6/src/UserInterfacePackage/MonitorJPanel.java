/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfacePackage;

import BusinessPackage.Business;
import BusinessPackage.Market;
import BusinessPackage.Sales;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragha
 */
public class MonitorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitorJPanel
     */
    Business b;
    private JPanel userContainer;

    Sales sales;

    public MonitorJPanel(JPanel userContainer, Business b, Sales sales) {
        initComponents();
        this.b = b;
        this.userContainer = userContainer;

        this.sales = sales;
        tableForMarket.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboForMoniotring = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableForMarket = new javax.swing.JTable();

        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboForMoniotring.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Revenue totals for Xerox", "Product sales revenues by market", "Top 10 sales persons by revenues broken down by market", "Sales persons with consist above target sales", "Sales person with below total order target sales", "Top 3 products consistently sold above market target price" }));
        comboForMoniotring.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboForMoniotringItemStateChanged(evt);
            }
        });
        comboForMoniotring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboForMoniotringActionPerformed(evt);
            }
        });
        add(comboForMoniotring, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 58, 450, -1));

        tableForMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Market Name", "Total Revenues"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableForMarket);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void comboForMoniotringItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboForMoniotringItemStateChanged
        // TODO add your handling code here:
        if(comboForMoniotring.getSelectedIndex()==1)
        {
            tableForMarket.setVisible(true);
             DefaultTableModel defaultTableModel = (DefaultTableModel) tableForMarket.getModel();
        defaultTableModel.setRowCount(0);
        
        for (Market market : b.getMarketList().getMarketList()) {
            {

                Object[] row = new Object[2];
                row[0] = market.getMarketName();
                row[1] = market.getRevenue();
               
                defaultTableModel.addRow(row);

            }
        }
        }
    }//GEN-LAST:event_comboForMoniotringItemStateChanged

    private void comboForMoniotringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboForMoniotringActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_comboForMoniotringActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboForMoniotring;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableForMarket;
    // End of variables declaration//GEN-END:variables
}
