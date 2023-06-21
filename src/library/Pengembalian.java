/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LEGION
 */
public class Pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Pengembalian() {
        initComponents();
        Connect();
        LoadAnggota();
        LoadBuku();
        LoadStaf();
        cboAnggota.setSelectedIndex(-1);
        cboBuku.setSelectedIndex(-1);
        cboStaf.setSelectedIndex(-1);
        LoadTable();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_perpustakaan", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LoadTable() {
        int c;

        try {
            pst = con.prepareStatement("SELECT id_peminjaman,nama_anggota,judul,nama_staf,jatuh_tempo,tgl_pengembalian,jumlah_hari,CONCAT('Rp.',total_denda) AS total_denda FROM peminjaman JOIN anggota USING(id_anggota) JOIN buku USING(id_buku) JOIN staf USING(id_staf) ORDER BY id_peminjaman");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) tblAnggota.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("id_peminjaman"));
                    v2.add(rs.getString("nama_anggota"));
                    v2.add(rs.getString("judul"));
                    v2.add(rs.getString("nama_staf"));
                    v2.add(rs.getString("jatuh_tempo"));
                    v2.add(rs.getString("tgl_pengembalian"));
                    v2.add(rs.getString("jumlah_hari"));
                    v2.add(rs.getString("total_denda"));
                }
                model.addRow(v2);
            }
        } catch (Exception e) {
        }

    }

    public void LoadAnggota() {
        String sql = "SELECT * FROM anggota";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("nama_anggota");
                cboAnggota.addItem(name);
            }
            cboAnggota.setEnabled(false);
        } catch (Exception e) {
        }
    }

    public void LoadBuku() {
        String sql = "SELECT * FROM buku";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("judul");
                cboBuku.addItem(name);
            }
            cboBuku.setEnabled(false);
        } catch (Exception e) {
        }
    }

    public void LoadStaf() {
        String sql = "SELECT * FROM staf";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("nama_staf");
                cboStaf.addItem(name);
            }
            cboStaf.setEnabled(false);
        } catch (Exception e) {
        }
    }

    public void Search(String str) {
        DefaultTableModel model = (DefaultTableModel) tblAnggota.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblAnggota.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
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
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cboAnggota = new javax.swing.JComboBox<>();
        cboBuku = new javax.swing.JComboBox<>();
        cboStaf = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jdcPengembalian = new com.toedter.calendar.JDateChooser();
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Pengembalian");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 10, 120, 40);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtSearch);
        txtSearch.setBounds(20, 70, 600, 30);

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Anggota", "Buku", "Staf", "Jatuh Tempo", "Tgl Pengembalian", "Total Hari", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnggota);
        if (tblAnggota.getColumnModel().getColumnCount() > 0) {
            tblAnggota.getColumnModel().getColumn(0).setResizable(false);
            tblAnggota.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAnggota.getColumnModel().getColumn(1).setResizable(false);
            tblAnggota.getColumnModel().getColumn(2).setResizable(false);
            tblAnggota.getColumnModel().getColumn(3).setResizable(false);
            tblAnggota.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblAnggota.getColumnModel().getColumn(4).setResizable(false);
            tblAnggota.getColumnModel().getColumn(5).setResizable(false);
            tblAnggota.getColumnModel().getColumn(6).setResizable(false);
            tblAnggota.getColumnModel().getColumn(6).setPreferredWidth(30);
            tblAnggota.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 600, 170);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate);
        btnUpdate.setBounds(410, 330, 200, 50);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(410, 400, 90, 50);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel);
        btnCancel.setBounds(520, 400, 90, 50);

        jPanel3.add(cboAnggota);
        cboAnggota.setBounds(120, 330, 270, 30);

        jPanel3.add(cboBuku);
        cboBuku.setBounds(120, 370, 270, 30);

        cboStaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStafActionPerformed(evt);
            }
        });
        jPanel3.add(cboStaf);
        cboStaf.setBounds(120, 410, 270, 30);

        jLabel12.setText("Staf");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 410, 80, 30);

        jLabel11.setText("Buku");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 370, 80, 30);

        jLabel10.setText("Anggota");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 330, 80, 30);

        jLabel14.setText("Tgl Pengembalian");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 450, 100, 30);

        jdcPengembalian.setDateFormatString("yyyy-MM-d");
        jPanel3.add(jdcPengembalian);
        jdcPengembalian.setBounds(120, 450, 270, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(171, 0, 640, 650);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 170, 30);

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(204, 204, 204));
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

        lblTransaksi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        java.util.Date tglPengembalian = jdcPengembalian.getDate();
        java.sql.Date pengembalian = new java.sql.Date(tglPengembalian.getTime());

        DefaultTableModel model = (DefaultTableModel) tblAnggota.getModel();
        int selectIndex = tblAnggota.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());

        try {
            pst = con.prepareStatement("UPDATE peminjaman SET tgl_pengembalian=?,jumlah_hari=CASE WHEN DATEDIFF('" + pengembalian + "',jatuh_tempo) <=0 THEN jumlah_hari=NULL ELSE DATEDIFF('" + pengembalian + "',jatuh_tempo) END,total_denda=(CASE WHEN DATEDIFF('" + pengembalian + "',jatuh_tempo) <=0 THEN total_denda=NULL ELSE DATEDIFF('" + pengembalian + "',jatuh_tempo)*3000 END) WHERE id_peminjaman=?");
            pst.setInt(2, id);
            pst.setDate(1, pengembalian);
            System.out.println(id);
            System.out.println(pengembalian);
            int k = pst.executeUpdate();

            if (k == 1) {
                JOptionPane.showMessageDialog(this, "Pengembalian berhasil diupdate");
                cboAnggota.setSelectedIndex(-1);
                cboBuku.setSelectedIndex(-1);
                cboStaf.setSelectedIndex(-1);
                jdcPengembalian.setDate(null);
                LoadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAnggota.getModel();
        int selectIndex = tblAnggota.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());

        try {
            pst = con.prepareStatement("DELETE FROM peminjaman WHERE id_peminjaman=?");
            pst.setInt(1, id);
            int k = pst.executeUpdate();

            if (k == 1) {
                JOptionPane.showMessageDialog(this, "Pengembalian berhasil dihapus");
                cboAnggota.setSelectedIndex(-1);
                cboBuku.setSelectedIndex(-1);
                cboStaf.setSelectedIndex(-1);
                jdcPengembalian.setDate(null);
                LoadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        cboAnggota.setSelectedIndex(-1);
        cboBuku.setSelectedIndex(-1);
        cboStaf.setSelectedIndex(-1);
        jdcPengembalian.setDate(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchString = txtSearch.getText();
        Search(searchString);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAnggota.getModel();
        int selectIndex = tblAnggota.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectIndex, 0).toString());
        cboAnggota.setSelectedItem(model.getValueAt(selectIndex, 1).toString());
        cboBuku.setSelectedItem(model.getValueAt(selectIndex, 2).toString());
        cboStaf.setSelectedItem(model.getValueAt(selectIndex, 3).toString());
        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectIndex, 4));
            jdcPengembalian.setDate(date);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblAnggotaMouseClicked

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

    private void cboStafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboStafActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboAnggota;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JComboBox<String> cboStaf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcPengembalian;
    private javax.swing.JLabel lblCariBuku;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblKeluar;
    private javax.swing.JLabel lblLaporan;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
