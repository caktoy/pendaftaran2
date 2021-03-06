/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pendaftaran2;

import java.awt.Color;

/**
 *
 * @author Thony
 */
public class FormPendaftaran extends javax.swing.JFrame {

    private java.sql.Connection koneksi = new Koneksi().connect();
    
    /** Creates new form FormPendaftaran */
    public FormPendaftaran() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        btnShow.setBorderPainted(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblNoHp = new javax.swing.JLabel();
        txtNoHp = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        watermark = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pendaftaran2");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));

        lblNama.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNama.setText("Nama :");

        txtNama.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        txtNama.setForeground(new java.awt.Color(153, 153, 153));
        txtNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNama.setText("Nama kamu siapa?");
        txtNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNamaFocusLost(evt);
            }
        });

        lblNoHp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNoHp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoHp.setText("No. Handphone :");

        txtNoHp.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        txtNoHp.setForeground(new java.awt.Color(153, 153, 153));
        txtNoHp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoHp.setText("Minta nomer hp-nya dong..");
        txtNoHp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoHpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoHpFocusLost(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(128, 128, 128));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSubmitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSubmitFocusLost(evt);
            }
        });

        watermark.setForeground(new java.awt.Color(204, 204, 204));
        watermark.setText("form by Thony Hermawan - ©2013.");

        btnShow.setBackground(new java.awt.Color(255, 255, 255));
        btnShow.setForeground(new java.awt.Color(204, 204, 204));
        btnShow.setText("show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNama)
                    .addComponent(lblNoHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoHp, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(watermark)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNama)
                .addGap(18, 18, 18)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNoHp)
                .addGap(18, 18, 18)
                .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watermark)
                    .addComponent(btnShow))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("stikom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("JAVA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("NETWORK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(270, 270, 270))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusGained
        txtNama.setText(null);
    }//GEN-LAST:event_txtNamaFocusGained

    private void txtNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusLost
        /**
         * String nama = txtNama.getText();
        if(!nama.equalsIgnoreCase("Nama kamu siapa?")){
            txtNama.setText(nama);
        }else{
            txtNama.setText("Nama kamu siapa?");
        }
        * */
    }//GEN-LAST:event_txtNamaFocusLost

    private void txtNoHpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusGained
        txtNoHp.setText(null);
    }//GEN-LAST:event_txtNoHpFocusGained

    private void txtNoHpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusLost
        /**
         * String notelp = txtNoHp.getText();
        if(!notelp.equalsIgnoreCase("Minta nomer hp-nya dong..")){
            txtNoHp.setText(notelp);
        }else{
            txtNoHp.setText("Minta nomer hp-nya dong..");
        }
        * */
    }//GEN-LAST:event_txtNoHpFocusLost

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        btnSubmit.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        btnSubmit.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnSubmitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubmitFocusGained
        btnSubmit.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnSubmitFocusGained

    private void btnSubmitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubmitFocusLost
        btnSubmit.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnSubmitFocusLost

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        ListPendaftar form = new ListPendaftar();
        form.setVisible(true);
        form.show();
        resetText();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        insert_data();
        resetText();
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoHp;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables

    private void insert_data(){
        try{
            String sql = "insert into pendaftar values (?, ?);";
            java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
            
            stmt.setString(1, txtNama.getText());
            stmt.setString(2, txtNoHp.getText());
            
            stmt.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null, "Terima kasih sudah mendaftar.", "Informasi", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtNama.setText(null);
            txtNoHp.setText(null);
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Terjadi kesalahan. Sumber : \n" + e, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void resetText(){
        txtNama.setText("Nama kamu siapa?");
        txtNoHp.setText("Minta nomer hp-nya dong..");
    }
    
}
