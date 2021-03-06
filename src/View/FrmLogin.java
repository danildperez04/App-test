/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Galileo blandón
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmLogin() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        PMain = new javax.swing.JPanel();
        PBanner = new javax.swing.JPanel();
        LblBannerImg = new javax.swing.JLabel();
        LblPhrase = new javax.swing.JLabel();
        LblSubPhrase = new javax.swing.JLabel();
        PUserFeatures = new javax.swing.JTabbedPane();
        PSignIn = new javax.swing.JPanel();
        TxtPassword = new javax.swing.JPasswordField();
        LblSignIn = new javax.swing.JLabel();
        LblCarnet = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        BtnSignIn = new javax.swing.JButton();
        LblSignInImg = new javax.swing.JLabel();
        FtxtSignInCarnet = new javax.swing.JFormattedTextField();
        PSign = new javax.swing.JPanel();
        LblSignUp = new javax.swing.JLabel();
        LblSignUpUsername = new javax.swing.JLabel();
        TxtSignUpUsername = new javax.swing.JTextField();
        LblSignUpCarnet = new javax.swing.JLabel();
        BtnSignUp = new javax.swing.JButton();
        LblSignUpPassword = new javax.swing.JLabel();
        TxtSignUpPassword = new javax.swing.JPasswordField();
        RbtnSignUpMale = new javax.swing.JRadioButton();
        RbtnSignUpFemale = new javax.swing.JRadioButton();
        FtxtSignUpCarnet = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 31, 61));
        setMinimumSize(new java.awt.Dimension(720, 449));
        setResizable(false);

        PMain.setBackground(new java.awt.Color(18, 31, 61));
        PMain.setMinimumSize(new java.awt.Dimension(720, 429));
        PMain.setPreferredSize(new java.awt.Dimension(720, 429));

        PBanner.setBackground(new java.awt.Color(18, 31, 61));
        PBanner.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        PBanner.setPreferredSize(new java.awt.Dimension(450, 449));

        LblBannerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion-de-papel (1).png"))); // NOI18N

        LblPhrase.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LblPhrase.setForeground(new java.awt.Color(255, 255, 255));
        LblPhrase.setText("CONOCE TU NIVEL DE INGLES");

        LblSubPhrase.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LblSubPhrase.setForeground(new java.awt.Color(255, 255, 255));
        LblSubPhrase.setText(" CON NUESTROS DIVERSOS TESTS");

        javax.swing.GroupLayout PBannerLayout = new javax.swing.GroupLayout(PBanner);
        PBanner.setLayout(PBannerLayout);
        PBannerLayout.setHorizontalGroup(
            PBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBannerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBannerLayout.createSequentialGroup()
                        .addComponent(LblBannerImg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addComponent(LblPhrase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBannerLayout.createSequentialGroup()
                        .addComponent(LblSubPhrase)
                        .addGap(27, 27, 27)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PBannerLayout.setVerticalGroup(
            PBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblBannerImg)
                .addGap(55, 55, 55)
                .addComponent(LblPhrase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblSubPhrase))
        );

        PUserFeatures.setBackground(new java.awt.Color(18, 31, 61));
        PUserFeatures.setForeground(new java.awt.Color(204, 204, 204));
        PUserFeatures.setToolTipText("");
        PUserFeatures.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PUserFeatures.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        PUserFeatures.setMinimumSize(new java.awt.Dimension(220, 449));
        PUserFeatures.setName(""); // NOI18N
        PUserFeatures.setOpaque(true);
        PUserFeatures.setPreferredSize(new java.awt.Dimension(270, 449));

        PSignIn.setBackground(new java.awt.Color(18, 31, 61));
        PSignIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        LblSignIn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblSignIn.setForeground(new java.awt.Color(255, 255, 255));
        LblSignIn.setText("SIGN IN");

        LblCarnet.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblCarnet.setForeground(new java.awt.Color(255, 255, 255));
        LblCarnet.setText("Carnet");

        LblPassword.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblPassword.setForeground(new java.awt.Color(255, 255, 255));
        LblPassword.setText("Password");

        BtnSignIn.setBackground(new java.awt.Color(102, 255, 102));
        BtnSignIn.setText("SIGN IN");
        BtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSignInActionPerformed(evt);
            }
        });

        LblSignInImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (1).png"))); // NOI18N

        try {
            FtxtSignInCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PSignInLayout = new javax.swing.GroupLayout(PSignIn);
        PSignIn.setLayout(PSignInLayout);
        PSignInLayout.setHorizontalGroup(
            PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PSignInLayout.createSequentialGroup()
                .addGroup(PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PSignInLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblSignIn)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSignInLayout.createSequentialGroup()
                                .addComponent(LblSignInImg)
                                .addGap(8, 8, 8))))
                    .addGroup(PSignInLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PSignInLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblCarnet)
                                    .addComponent(LblPassword)))
                            .addGroup(PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FtxtSignInCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PSignInLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(BtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        PSignInLayout.setVerticalGroup(
            PSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSignInLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LblSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblSignInImg)
                .addGap(26, 26, 26)
                .addComponent(LblCarnet)
                .addGap(18, 18, 18)
                .addComponent(FtxtSignInCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblPassword)
                .addGap(18, 18, 18)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        PUserFeatures.addTab("SIGN IN", PSignIn);

        PSign.setBackground(new java.awt.Color(18, 31, 61));
        PSign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        PSign.setPreferredSize(new java.awt.Dimension(246, 397));

        LblSignUp.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        LblSignUp.setText("SIGN UP");

        LblSignUpUsername.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblSignUpUsername.setForeground(new java.awt.Color(255, 255, 255));
        LblSignUpUsername.setText("Username");

        TxtSignUpUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSignUpUsernameActionPerformed(evt);
            }
        });

        LblSignUpCarnet.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblSignUpCarnet.setForeground(new java.awt.Color(255, 255, 255));
        LblSignUpCarnet.setText("Carnet");

        BtnSignUp.setBackground(new java.awt.Color(102, 255, 102));
        BtnSignUp.setText("SIGN UP");
        BtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSignUpActionPerformed(evt);
            }
        });

        LblSignUpPassword.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblSignUpPassword.setForeground(new java.awt.Color(255, 255, 255));
        LblSignUpPassword.setText("Password");

        TxtSignUpPassword.setPreferredSize(new java.awt.Dimension(206, 22));
        TxtSignUpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSignUpPasswordActionPerformed(evt);
            }
        });

        RbtnSignUpMale.setBackground(new java.awt.Color(18, 31, 61));
        buttonGroup1.add(RbtnSignUpMale);
        RbtnSignUpMale.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        RbtnSignUpMale.setForeground(new java.awt.Color(255, 255, 255));
        RbtnSignUpMale.setText("Male");

        RbtnSignUpFemale.setBackground(new java.awt.Color(18, 31, 61));
        buttonGroup1.add(RbtnSignUpFemale);
        RbtnSignUpFemale.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        RbtnSignUpFemale.setForeground(new java.awt.Color(255, 255, 255));
        RbtnSignUpFemale.setText("Female");

        try {
            FtxtSignUpCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PSignLayout = new javax.swing.GroupLayout(PSign);
        PSign.setLayout(PSignLayout);
        PSignLayout.setHorizontalGroup(
            PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PSignLayout.createSequentialGroup()
                .addGroup(PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PSignLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(LblSignUp))
                    .addGroup(PSignLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblSignUpPassword)
                                .addComponent(LblSignUpCarnet)
                                .addComponent(LblSignUpUsername)
                                .addComponent(TxtSignUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FtxtSignUpCarnet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(TxtSignUpUsername, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(PSignLayout.createSequentialGroup()
                                .addComponent(RbtnSignUpFemale)
                                .addGap(10, 10, 10)
                                .addComponent(RbtnSignUpMale))))
                    .addGroup(PSignLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        PSignLayout.setVerticalGroup(
            PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSignLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblSignUpUsername)
                .addGap(18, 18, 18)
                .addComponent(TxtSignUpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblSignUpCarnet)
                .addGap(18, 18, 18)
                .addComponent(FtxtSignUpCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblSignUpPassword)
                .addGap(18, 18, 18)
                .addComponent(TxtSignUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtnSignUpMale)
                    .addComponent(RbtnSignUpFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        PUserFeatures.addTab("SIGN UP", PSign);

        javax.swing.GroupLayout PMainLayout = new javax.swing.GroupLayout(PMain);
        PMain.setLayout(PMainLayout);
        PMainLayout.setHorizontalGroup(
            PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PUserFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PMainLayout.setVerticalGroup(
            PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMainLayout.createSequentialGroup()
                .addGroup(PMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PUserFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE)
                    .addGroup(PMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSignUpActionPerformed

    private void TxtSignUpUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSignUpUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSignUpUsernameActionPerformed

    private void BtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSignInActionPerformed

    private void TxtSignUpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSignUpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSignUpPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnSignIn;
    public javax.swing.JButton BtnSignUp;
    public javax.swing.JFormattedTextField FtxtSignInCarnet;
    public javax.swing.JFormattedTextField FtxtSignUpCarnet;
    private javax.swing.JLabel LblBannerImg;
    private javax.swing.JLabel LblCarnet;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblPhrase;
    private javax.swing.JLabel LblSignIn;
    private javax.swing.JLabel LblSignInImg;
    private javax.swing.JLabel LblSignUp;
    private javax.swing.JLabel LblSignUpCarnet;
    private javax.swing.JLabel LblSignUpPassword;
    private javax.swing.JLabel LblSignUpUsername;
    private javax.swing.JLabel LblSubPhrase;
    private javax.swing.JPanel PBanner;
    public javax.swing.JPanel PMain;
    public javax.swing.JPanel PSign;
    private javax.swing.JPanel PSignIn;
    public javax.swing.JTabbedPane PUserFeatures;
    public javax.swing.JRadioButton RbtnSignUpFemale;
    public javax.swing.JRadioButton RbtnSignUpMale;
    public javax.swing.JPasswordField TxtPassword;
    public javax.swing.JPasswordField TxtSignUpPassword;
    public javax.swing.JTextField TxtSignUpUsername;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
