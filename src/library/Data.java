/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;


/**
 *
 * @author LEGION
 */
public class Data extends javax.swing.JFrame {

    /**
     * Creates new form Data
     */
    public Data() {
        initComponents();
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCariBuku = new javax.swing.JLabel();
        lblTransaksi = new javax.swing.JLabel();
        lblLaporan = new javax.swing.JLabel();
        lblKeluar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/images/profile (4).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 50, 170, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 170, 160);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Anggota");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 116, 130, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(50, 30, 130, 150);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Buku");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(0, 120, 130, 30);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(250, 30, 130, 150);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Staf");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(0, 120, 130, 30);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(440, 30, 130, 150);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("User");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(0, 120, 130, 30);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(50, 230, 130, 150);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(171, 0, 640, 650);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 170, 30);

        lblData.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblData.setText("Data");
        lblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDataMouseClicked(evt);
            }
        });
        jPanel2.add(lblData);
        lblData.setBounds(30, 90, 60, 30);

        lblCariBuku.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCariBuku.setForeground(new java.awt.Color(204, 204, 204));
        lblCariBuku.setText("Cari Buku");
        lblCariBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCariBukuMouseClicked(evt);
            }
        });
        jPanel2.add(lblCariBuku);
        lblCariBuku.setBounds(30, 140, 80, 30);

        lblTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTransaksi.setForeground(new java.awt.Color(204, 204, 204));
        lblTransaksi.setText("Transaksi");
        lblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTransaksiMouseClicked(evt);
            }
        });
        jPanel2.add(lblTransaksi);
        lblTransaksi.setBounds(30, 190, 80, 30);

        lblLaporan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLaporan.setForeground(new java.awt.Color(204, 204, 204));
        lblLaporan.setText("Riwayat");
        lblLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLaporanMouseClicked(evt);
            }
        });
        jPanel2.add(lblLaporan);
        lblLaporan.setBounds(30, 240, 80, 30);

        lblKeluar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKeluar.setForeground(new java.awt.Color(255, 0, 0));
        lblKeluar.setText("Keluar");
        lblKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKeluarMouseClicked(evt);
            }
        });
        jPanel2.add(lblKeluar);
        lblKeluar.setBounds(30, 410, 70, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 160, 170, 490);

        setSize(new java.awt.Dimension(823, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Anggota a = new Anggota();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        Buku b = new Buku();
        this.dispose();
        b.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        Staf s = new Staf();
        this.dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        User u = new User();
        this.dispose();
        u.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void lblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDataMouseClicked
        // TODO add your handling code here:
        this.hide();
        Data d = new Data();
        d.setVisible(true);
    }//GEN-LAST:event_lblDataMouseClicked

    private void lblCariBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCariBukuMouseClicked
        // TODO add your handling code here:
        this.hide();
        Search s = new Search();
        s.setVisible(true);
    }//GEN-LAST:event_lblCariBukuMouseClicked

    private void lblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTransaksiMouseClicked
        // TODO add your handling code here:
        this.hide();
        Transaksi t = new Transaksi();
        t.setVisible(true);
    }//GEN-LAST:event_lblTransaksiMouseClicked

    private void lblLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLaporanMouseClicked
        // TODO add your handling code here:
        History l = new History();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_lblLaporanMouseClicked

    private void lblKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKeluarMouseClicked
        // TODO add your handling code here:
        this.hide();
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }//GEN-LAST:event_lblKeluarMouseClicked

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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblCariBuku;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblKeluar;
    private javax.swing.JLabel lblLaporan;
    private javax.swing.JLabel lblTransaksi;
    // End of variables declaration//GEN-END:variables
}