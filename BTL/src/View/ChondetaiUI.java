package View;




import Control.excuteSQL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.DeTai;
import CustomTable.CustomTableDeTai;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ledan
 */

public class ChondetaiUI extends javax.swing.JFrame {
    /**
     * Creates new form ChondetaiUI
     */
    ArrayList<DeTai> listdt;
    int selectedRow = 0;
    excuteSQL ex = new excuteSQL();
    public ChondetaiUI() {
        initComponents();
        setLocationRelativeTo(null);
        ex.getDetai();
        listdt = ex.getDsdt();
        hienThiBang();
    }

    public void hienThiBang()
    {
        jTableDetai.setModel(new CustomTableDeTai(listdt));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetai = new javax.swing.JTable();
        jbtnthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Chọn đề tài");

        jTableDetai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDetai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDetaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDetai);

        jbtnthoat.setText("Thoát");
        jbtnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jbtnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbtnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnthoatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Do you want to exit ? ","Exit",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            new DangNhapNhomTruong().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jbtnthoatActionPerformed

    private void jTableDetaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDetaiMouseClicked
        // TODO add your handling code here:
        selectedRow = jTableDetai.getSelectedRow();
        int ret = JOptionPane.showConfirmDialog(null, "Bạn chọn đề tài này ?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            JOptionPane.showConfirmDialog(null, "Chọn thành công", "Thông báo",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            try {
                ex.setTrangthaidt(listdt.get(selectedRow).getMaDeTai());
            } catch (Exception ex) {
                Logger.getLogger(ChondetaiUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ex.setmaDeTai(listdt.get(selectedRow).getMaDeTai());
            } catch (Exception ex) {
                Logger.getLogger(ChondetaiUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            listdt.remove(selectedRow);
            jTableDetai.setModel(new CustomTableDeTai(listdt));
        }
    }//GEN-LAST:event_jTableDetaiMouseClicked

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
            java.util.logging.Logger.getLogger(ChondetaiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChondetaiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChondetaiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChondetaiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChondetaiUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetai;
    private javax.swing.JButton jbtnthoat;
    // End of variables declaration//GEN-END:variables
}
