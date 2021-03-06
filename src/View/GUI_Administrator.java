package View;

import Controller.Controller_Admin;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class GUI_Administrator extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Administrator
     */
    public GUI_Administrator() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        donatur = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldonatur = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caridonatur = new javax.swing.JTextField();
        btncari2 = new javax.swing.JButton();
        penggalang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caripenggalang = new javax.swing.JTextField();
        btncari1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelPenggalangdana = new javax.swing.JTable();
        penerima = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelPenerima = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btn5 = new javax.swing.JButton();
        konfrim = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnkonfirm = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cariverifikasi = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablekonfirmasi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ADMINISTATOR");

        LOGOUT.setText("LOGOUT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(LOGOUT)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(LOGOUT))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        donatur.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabeldonatur.setAutoCreateRowSorter(true);
        tabeldonatur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabeldonatur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabeldonatur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Email", "Username", "Alamat", "Password", "Gender", "No_Hp", "Tempat_Lahir", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabeldonatur);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Data Donatur");

        jLabel4.setText("Cari Event");

        caridonatur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caridonaturActionPerformed(evt);
            }
        });

        btncari2.setText("cari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caridonatur, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncari2)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caridonatur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        donatur.addTab("Donatur", jPanel1);

        penggalang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Data Penggalang Dana");

        jLabel6.setText("Cari Event");

        caripenggalang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caripenggalangActionPerformed(evt);
            }
        });

        btncari1.setText("cari");

        tabelPenggalangdana.setAutoCreateRowSorter(true);
        tabelPenggalangdana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelPenggalangdana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelPenggalangdana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Email", "Username", "Alamat", "Password", "Gender", "No_Hp", "Tempat_Lahir", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelPenggalangdana);

        javax.swing.GroupLayout penggalangLayout = new javax.swing.GroupLayout(penggalang);
        penggalang.setLayout(penggalangLayout);
        penggalangLayout.setHorizontalGroup(
            penggalangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penggalangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penggalangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penggalangLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penggalangLayout.createSequentialGroup()
                        .addGap(0, 850, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caripenggalang, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncari1))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE))
                .addContainerGap())
        );
        penggalangLayout.setVerticalGroup(
            penggalangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penggalangLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penggalangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caripenggalang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        donatur.addTab("Penggalang Dana", penggalang);

        penerima.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Data Penerima");

        TabelPenerima.setAutoCreateRowSorter(true);
        TabelPenerima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TabelPenerima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabelPenerima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Tanggal_Lahir", "notlp", "Lokasi", "Judul_Event", "TanggalMulai", "TanggalBerakhir", "Id_Perusahaan", "PembuatEvent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelPenerima);

        jLabel7.setText("Cari Event");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        btn5.setText("cari");

        javax.swing.GroupLayout penerimaLayout = new javax.swing.GroupLayout(penerima);
        penerima.setLayout(penerimaLayout);
        penerimaLayout.setHorizontalGroup(
            penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penerimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(1026, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penerimaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn5)
                .addContainerGap())
        );
        penerimaLayout.setVerticalGroup(
            penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penerimaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        donatur.addTab("Penerima", penerima);

        konfrim.setBackground(new java.awt.Color(255, 255, 255));

        btnkonfirm.setText("Konfirmasi");
        btnkonfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonfirmActionPerformed(evt);
            }
        });

        jLabel8.setText("Cari Event");

        cariverifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariverifikasiActionPerformed(evt);
            }
        });

        btn4.setText("cari");

        jButton3.setText("Delete");

        jButton5.setText("Delete");

        jTablekonfirmasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kategori", "judul_event", "target_donasi", "nama", "tanggalLahir", "notlp", "lokasi", "TanggalMulai", "tanggalBerakhir", "id_perusahaan", "Username", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTablekonfirmasi);

        javax.swing.GroupLayout konfrimLayout = new javax.swing.GroupLayout(konfrim);
        konfrim.setLayout(konfrimLayout);
        konfrimLayout.setHorizontalGroup(
            konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konfrimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(konfrimLayout.createSequentialGroup()
                        .addGap(59, 257, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(93, 93, 93)
                        .addComponent(btnkonfirm)
                        .addGap(257, 257, 257)
                        .addComponent(jButton3)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konfrimLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konfrimLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(218, 218, 218))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konfrimLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariverifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4)
                                .addContainerGap())))))
            .addGroup(konfrimLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        konfrimLayout.setVerticalGroup(
            konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konfrimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cariverifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4))
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(243, 243, 243)
                .addGroup(konfrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(btnkonfirm))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        donatur.addTab("Verifikasi", konfrim);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(donatur)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(donatur, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariverifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariverifikasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariverifikasiActionPerformed

    private void btnkonfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkonfirmActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void caripenggalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caripenggalangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caripenggalangActionPerformed

    private void caridonaturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caridonaturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caridonaturActionPerformed

  
    public JTable getTabeldonatur() {
        return tabeldonatur;
    }
    public void setTbDonatur(DefaultTableModel x){
        tabeldonatur.setModel(x);
    }
    public void setTbPenggalang(DefaultTableModel x){
        tabelPenggalangdana.setModel(x);
    }
    public void setTbkonfirmasi(DefaultTableModel x){
        jTablekonfirmasi.setModel(x);
    }
    public void setTbPenerima(DefaultTableModel x){
        TabelPenerima.setModel(x);
    }
  
    public JButton getBtnkonfirm() {
        return btnkonfirm;
    }

    public JTable getJtbkonfir() {
        return jTablekonfirmasi;
    }
    public int getSelectedkonfir(){
        return jTablekonfirmasi.getSelectedRow();
    }

    public JToggleButton getLOGOUT() {
        return LOGOUT;
    }
    public void addActionListener(ActionListener aThis) {
        btncari1.addActionListener(aThis);
        btnkonfirm.addActionListener(aThis);
        LOGOUT.addActionListener(aThis);
    }
    public void addMouseAdapter(MouseAdapter x){
        tabeldonatur.addMouseListener(x);
        tabelPenggalangdana.addMouseListener(x);
        TabelPenerima.addMouseListener(x);
     
        jTablekonfirmasi.addMouseListener(x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton LOGOUT;
    private javax.swing.JTable TabelPenerima;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btncari1;
    private javax.swing.JButton btncari2;
    private javax.swing.JButton btnkonfirm;
    private javax.swing.JTextField caridonatur;
    private javax.swing.JTextField caripenggalang;
    private javax.swing.JTextField cariverifikasi;
    private javax.swing.JTabbedPane donatur;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTablekonfirmasi;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel konfrim;
    private javax.swing.JPanel penerima;
    private javax.swing.JPanel penggalang;
    private javax.swing.JTable tabelPenggalangdana;
    private javax.swing.JTable tabeldonatur;
    // End of variables declaration//GEN-END:variables

    
}
