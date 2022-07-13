package B3_View;

import B1_Model.*;
import B2_Controller.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ATMUI extends javax.swing.JFrame {

    private ATMasController controller;

    public ATMUI(Bank bank, String lokasi) {
        controller = new ATMasController(bank, lokasi);
        initComponents();
    }

    public ATMasController getController() {
        return controller;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saldoBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        setorBtn = new javax.swing.JButton();
        tarikBtn = new javax.swing.JButton();
        transferBtn = new javax.swing.JButton();
        rekKoranBtn = new javax.swing.JButton();
        pembayaranBtn = new javax.swing.JButton();
        pembelianBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        findNasabahBtn = new javax.swing.JButton();
        allRekeningBtn = new javax.swing.JButton();
        findRekeningBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        regRekeningBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK SYSTEM");

        saldoBtn.setText("Saldo");
        saldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoBtnActionPerformed(evt);
            }
        });

        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        setorBtn.setText("Setor");
        setorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorBtnActionPerformed(evt);
            }
        });

        tarikBtn.setText("Tarik");
        tarikBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarikBtnActionPerformed(evt);
            }
        });

        transferBtn.setText("Transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        rekKoranBtn.setText("Rekening Koran");
        rekKoranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekKoranBtnActionPerformed(evt);
            }
        });

        pembayaranBtn.setText("Pembayaran");
        pembayaranBtn.setEnabled(false);
        pembayaranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranBtnActionPerformed(evt);
            }
        });

        pembelianBtn.setText("Pembelian");
        pembelianBtn.setEnabled(false);
        pembelianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Bank System");

        findNasabahBtn.setText("Find Nasabah");
        findNasabahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNasabahBtnActionPerformed(evt);
            }
        });

        allRekeningBtn.setText("All Rekening");
        allRekeningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRekeningBtnActionPerformed(evt);
            }
        });

        findRekeningBtn.setText("Find Rekening");
        findRekeningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRekeningBtnActionPerformed(evt);
            }
        });

        screen.setEditable(false);
        screen.setColumns(20);
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        regRekeningBtn.setText("Register Rekening");
        regRekeningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRekeningBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(transferBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allRekeningBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findNasabahBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findRekeningBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pembelianBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pembayaranBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rekKoranBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(tarikBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saldoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regRekeningBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addGap(17, 17, 17)
                        .addComponent(saldoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setorBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarikBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rekKoranBtn)
                        .addGap(18, 18, 18)
                        .addComponent(pembayaranBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pembelianBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allRekeningBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findRekeningBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findNasabahBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regRekeningBtn)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals("LOGIN")) {
            String pin = JOptionPane.showInputDialog(this, "Masukkan PIN ATM");
            if (controller.loginPin(pin)) {
                screen.append("\n\n\n" + controller.getRekeningAktifasModel()
                        .getNasabahNama() + ", Selamat Datang di ATM" 
                        + controller.getBank().getNama());
                screen.append("\nLokasi " + controller.getLokasi());
                screen.append("\n" + Log.getTime());
                screen.append("\n--------------------");
                loginBtn.setText("LOG OUT");
            } else {
                JOptionPane.showMessageDialog(this, "Rekening tidak ditemukan",
                        "peringatan PIN salah", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (evt.getActionCommand().equals("LOG OUT")) {
            screen.setText("");
            loginBtn.setText("LOGIN");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void saldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoBtnActionPerformed
        // TODO add your handling code here:
        screen.append("\n Saldo Sebesar : "
                + controller.getRekeningAktifasModel().getSaldo());
    }//GEN-LAST:event_saldoBtnActionPerformed

    private void setorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorBtnActionPerformed
        // TODO add your handling code here:
        double jumlah = Double.parseDouble(JOptionPane.showInputDialog(this
                , "Masukkan Jumlah "));
        controller.getRekeningAktifasModel().setor(jumlah);

        controller.getRekeningAktifasModel().addLogTransaction(Log.addLog(
                TransactionType.CREDIT, jumlah, controller
                .getRekeningAktifasModel().getSaldo()));
        screen.append("\nSetor Sejumlah " + jumlah);
    }//GEN-LAST:event_setorBtnActionPerformed

    private void tarikBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarikBtnActionPerformed
        // TODO add your handling code here:
        double jumlah = Double.parseDouble(JOptionPane.showInputDialog(this
                , "Masukkan Jumlah"));
        controller.getRekeningAktifasModel().tarik(jumlah);
        controller.getRekeningAktifasModel().addLogTransaction(
                Log.addLog(TransactionType.DEBET, jumlah, controller
                .getRekeningAktifasModel().getSaldo()));
        screen.append("\nTarik Sejumlah " + jumlah);
    }//GEN-LAST:event_tarikBtnActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
        String noRekTujuan = JOptionPane.showInputDialog(this
                , "Masukkan Nomor Rekening Tujuan");
        Rekening rekTujuan = null;

        if (controller.getBank().findRekeningById(noRekTujuan) == null) {
            JOptionPane.showMessageDialog(this, "Rekening Tidak Ditemukan"
                    , "Pesan", JOptionPane.WARNING_MESSAGE);
        } else {
            rekTujuan = controller.getBank().findRekeningById(noRekTujuan);
            double jumlah = Integer.parseInt(JOptionPane.showInputDialog(this
                    , "Masukkan Jumlah Transfer"));

            controller.Transfer(jumlah, noRekTujuan);
            screen.append("\nTransfer Sejumlah " + jumlah + " ke Rekening " 
                    + noRekTujuan + " Telah berhasil ");
            Log.addLog(TransactionType.DEBET, jumlah, controller
                    .getRekeningAktifasModel().getSaldo());
        }
    }//GEN-LAST:event_transferBtnActionPerformed

    private void rekKoranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekKoranBtnActionPerformed
        // TODO add your handling code here:
        screen.append("\n\n -------- Cek Rekening Koran --------");
        for (String log : controller.getRekeningAktifasModel().getLogTransaction()) {
            screen.append(log);
        }
        screen.append("\n-------------------------------------");
    }//GEN-LAST:event_rekKoranBtnActionPerformed

    private void pembayaranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pembayaranBtnActionPerformed

    private void pembelianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pembelianBtnActionPerformed

    private void allRekeningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRekeningBtnActionPerformed
        // TODO add your handling code here:
        screen.append("No Rekening\t| Nama         \t\t| PIN  |");
        screen.append("\n------------------------------------------------------------------");
        for (Rekening rekening : controller.getBank().getListRekening()) {
            screen.append("\n " + rekening.getRekeningID() + "    \t| "
                + rekening.getNasabahNama() + "\t| " + rekening.getPin() + "|");
        }
    }//GEN-LAST:event_allRekeningBtnActionPerformed

    private void findRekeningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRekeningBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findRekeningBtnActionPerformed

    private void findNasabahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNasabahBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findNasabahBtnActionPerformed

    private void regRekeningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRekeningBtnActionPerformed
        // TODO add your handling code here:
        RegisterRekeningDialog dialog = new RegisterRekeningDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_regRekeningBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Bank bank = new Bank(" BANK RADAR ");
        bank.registrasiRekening(new Nasabah("Wahyu Wiradarma", "01012020"),
                new Rekening("01400001", "1234", 500000));
        bank.registrasiRekening(new Nasabah("Ahmad Ahua Iqomuddin", "01012021"),
                new Rekening("01400002", "4321", 150000));

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
            java.util.logging.Logger.getLogger(ATMUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMUI(bank, "ATM BANK RADAR cabang Bekasi")
                        .setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allRekeningBtn;
    private javax.swing.JButton findNasabahBtn;
    private javax.swing.JButton findRekeningBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton pembayaranBtn;
    private javax.swing.JButton pembelianBtn;
    private javax.swing.JButton regRekeningBtn;
    private javax.swing.JButton rekKoranBtn;
    private javax.swing.JButton saldoBtn;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton setorBtn;
    private javax.swing.JButton tarikBtn;
    private javax.swing.JButton transferBtn;
    // End of variables declaration//GEN-END:variables
}
