/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Tampilan.MainMenu;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Arimbi
 */
public class Tugas extends javax.swing.JFrame {

       private void kosong(){
           txtNoTugas.setEditable(true);
           txtNoTugas.setText(null);
           txtNamaTugas.setText(null);
           txtMatkul.setText(null);
           cbHari.setSelectedItem(this);
           txtWaktu.setText(null);
          
       }
       private void tampilkan_data(){
           DefaultTableModel model = new DefaultTableModel(); 
           model.addColumn("No.");
           model.addColumn("Nama Tugas");
           model.addColumn("Nama Matkul");
           model.addColumn("Hari");
           model.addColumn("Waktu pengumpulan");
           
        try{
            String sql = "select * from tugas";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] {res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});   
            }
            tugas.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
    /**
     * Creates new form Tugas
     */
    public Tugas() {
        initComponents();
        tampilkan_data();
        kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NoTugas = new javax.swing.JLabel();
        NamaTugas = new javax.swing.JLabel();
        Matkul = new javax.swing.JLabel();
        Hari = new javax.swing.JLabel();
        Waktu = new javax.swing.JLabel();
        btInsert = new javax.swing.JButton();
        btCheck = new javax.swing.JButton();
        btGanti = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tugas = new javax.swing.JTable();
        txtNoTugas = new javax.swing.JTextField();
        txtNamaTugas = new javax.swing.JTextField();
        txtMatkul = new javax.swing.JTextField();
        cbHari = new javax.swing.JComboBox();
        txtWaktu = new javax.swing.JTextField();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtsmatkul = new javax.swing.JComboBox();
        SEARCH = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("TUGAS");

        NoTugas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        NoTugas.setText("No tugas");

        NamaTugas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        NamaTugas.setText("Nama tugas");

        Matkul.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Matkul.setText("Nama Matakuliah");

        Hari.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Hari.setText("Hari Pengumpulan");

        Waktu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Waktu.setText("Waktu Pengumpulan");

        btInsert.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btInsert.setText("Insert");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });

        btCheck.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btCheck.setText("Check");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        btGanti.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btGanti.setText("Ganti");
        btGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGantiActionPerformed(evt);
            }
        });

        btSave.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        tugas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tugas.setModel(new javax.swing.table.DefaultTableModel(
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
        tugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tugasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tugas);

        txtNoTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTugasActionPerformed(evt);
            }
        });

        cbHari.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cbHari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", "MINGGU" }));

        txtWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaktuActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btExit.setText("EXIT");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*Tahun-Bulan-Tanggal Jam-Menit-Detik");

        txtsmatkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Mata Kuliah", "Basis Data", "DRPL", "Kewirausahaan", "PBO", "Sistem Operasi", "Strategi Algoritma", "TBFO" }));

        SEARCH.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        SEARCH.setText("SEARCH");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-HARI", "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "SABTU", "MINGGU" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NoTugas)
                                            .addComponent(NamaTugas)
                                            .addComponent(Matkul)
                                            .addComponent(Hari)
                                            .addComponent(Waktu)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btInsert)
                                            .addComponent(SEARCH))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtsmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btCheck)
                                                .addGap(27, 27, 27)
                                                .addComponent(btGanti)))))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSave)
                                        .addGap(39, 39, 39)
                                        .addComponent(btDelete)
                                        .addGap(109, 109, 109))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNoTugas)
                                            .addComponent(txtNamaTugas)
                                            .addComponent(txtMatkul))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoTugas)
                    .addComponent(txtNoTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaTugas)
                    .addComponent(txtNamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matkul)
                    .addComponent(txtMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Hari)
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Waktu)
                    .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCH)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsert)
                    .addComponent(btCheck)
                    .addComponent(btGanti)
                    .addComponent(btSave)
                    .addComponent(btDelete)
                    .addComponent(btExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed
        kosong();
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsertActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        tampilkan_data();
    }//GEN-LAST:event_btCheckActionPerformed

    private void btGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGantiActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE tugas SET no_tugas='"+txtNoTugas.getText()+"',nama_tugas='"+txtNamaTugas.getText()+"',mata_kuliah='"+txtMatkul.getText()+"',hari_pengumpulan='"+cbHari.getSelectedItem()+"',waktu_pengumpulan='"+txtWaktu.getText()+"' WHERE no_tugas = '"+txtNoTugas.getText()+"'";
            java.sql.Connection conn = (Connection)konek.konekDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Edit Data BERHASIL!!");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this,e.getMessage());
        }
        tampilkan_data();
        kosong();
    }//GEN-LAST:event_btGantiActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
           // TODO add your handling code here:
        try{
            String sql = "INSERT INTO tugas VALUES ('"+txtNoTugas.getText()+"','"+txtNamaTugas.getText()+"','"+txtMatkul.getText()+"','"+cbHari.getSelectedItem()+"','"+txtWaktu.getText()+"')";
            java.sql.Connection con = (Connection)konek.konekDB();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan data berhasil..");
            tampilkan_data();
            kosong();
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btSaveActionPerformed
     
    private void tugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tugasMouseClicked
        // TODO add your handling code here:
        int baris = tugas.rowAtPoint(evt.getPoint());
        String notugas = tugas.getValueAt(baris,0).toString();
        txtNoTugas.setText(notugas);
        
        String nama = tugas.getValueAt(baris,1).toString();
        txtNamaTugas.setText(nama);
        
        String matkul = tugas.getValueAt(baris,2).toString();
        txtMatkul.setText(matkul);
        
        String hari = tugas.getValueAt(baris,3).toString();
        cbHari.setSelectedItem(hari);
        
        String waktu = tugas.getValueAt(baris,4).toString();
        txtWaktu.setText(waktu);
    }//GEN-LAST:event_tugasMouseClicked

    private void txtWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaktuActionPerformed

    private void txtNoTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTugasActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "Delete FROM tugas WHERE no_tugas='"+txtNoTugas.getText()+"'";
        java.sql.Connection conn = (Connection)konek.konekDB();
        java.sql.PreparedStatement pstm= conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null,"Hapus Data Berhasil!!");
        }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        dispose();
        MainMenu n = new MainMenu();
        n.setVisible(true);
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hari;
    private javax.swing.JLabel Matkul;
    private javax.swing.JLabel NamaTugas;
    private javax.swing.JLabel NoTugas;
    private javax.swing.JLabel SEARCH;
    private javax.swing.JLabel Waktu;
    private javax.swing.JButton btCheck;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btGanti;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cbHari;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tugas;
    private javax.swing.JTextField txtMatkul;
    private javax.swing.JTextField txtNamaTugas;
    private javax.swing.JTextField txtNoTugas;
    private javax.swing.JTextField txtWaktu;
    private javax.swing.JComboBox txtsmatkul;
    // End of variables declaration//GEN-END:variables
}