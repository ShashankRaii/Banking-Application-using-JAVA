
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shash
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        StaffLogin = new javax.swing.JButton();
        LUser = new javax.swing.JLabel();
        LPass = new javax.swing.JLabel();
        TUser = new javax.swing.JTextField();
        TPass = new javax.swing.JPasswordField();
        BLogin = new javax.swing.JButton();
        BRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Login");

        StaffLogin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        StaffLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\shash\\Downloads\\admin-fill.png")); // NOI18N
        StaffLogin.setText("Staff Login");
        StaffLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StaffLoginMouseEntered(evt);
            }
        });
        StaffLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(StaffLogin)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(StaffLogin))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 636, 80));

        LUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MiniProjIcons/user-fill.png"))); // NOI18N
        jPanel1.add(LUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        LPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MiniProjIcons/lock-fill.png"))); // NOI18N
        jPanel1.add(LPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        TUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TUserMouseEntered(evt);
            }
        });
        TUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUserActionPerformed(evt);
            }
        });
        jPanel1.add(TUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 217, 33));

        TPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TPassMouseEntered(evt);
            }
        });
        TPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPassActionPerformed(evt);
            }
        });
        jPanel1.add(TPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 217, 31));

        BLogin.setBackground(new java.awt.Color(255, 255, 255));
        BLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BLogin.setText("Login");
        BLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BLoginMouseEntered(evt);
            }
        });
        BLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 110, 50));

        BRegister.setBackground(new java.awt.Color(255, 255, 255));
        BRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BRegister.setText("Register");
        BRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BRegisterMouseEntered(evt);
            }
        });
        BRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(BRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MiniProjIcons/LOGO (2) (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 176, 132));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MiniProjIcons/Profile pic-pana (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 325, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegisterActionPerformed
        REGISTERfORM r = new REGISTERfORM();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_BRegisterActionPerformed

    private void BLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginActionPerformed
        if(verifyPass()){
        if(verifyFields()){
            String q = "select * from login where Username = ? and Password  = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3307/bank","root","")) {
                PreparedStatement pt=con.prepareStatement(q);
                pt.setString(1, TUser.getText());
                pt.setString(2, new String(TPass.getPassword()));
                ResultSet rs =pt.executeQuery();
                if (rs.next()){
                    JOptionPane.showMessageDialog(null, "Welcome "+ TUser.getText(), "SUCCESSFUL LOGIN ", JOptionPane.PLAIN_MESSAGE);
                    HomePage h = new HomePage();
                    h.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "INVALID USERNAME & PASSWORD", "UNSUCCESSFUL LOGIN", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
                dispose();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        }
    }//GEN-LAST:event_BLoginActionPerformed
    
    private void TUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TUserActionPerformed

    private void TPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPassActionPerformed

    private void StaffLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffLoginActionPerformed
StaffLogin sl = new StaffLogin();
        sl.setVisible(true); 
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_StaffLoginActionPerformed

    private void BLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLoginMouseEntered
        // TODO add your handling code here:
        BLogin.setToolTipText("Login");
    }//GEN-LAST:event_BLoginMouseEntered

    private void BRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BRegisterMouseEntered
        // TODO add your handling code here:
        BRegister.setToolTipText("Register");
    }//GEN-LAST:event_BRegisterMouseEntered

    private void StaffLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffLoginMouseEntered
        // TODO add your handling code here:
        StaffLogin.setToolTipText("StaffLogin");
    }//GEN-LAST:event_StaffLoginMouseEntered

    private void TUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TUserMouseEntered
        // TODO add your handling code here:
        TUser.setToolTipText("Enter your UserName");
    }//GEN-LAST:event_TUserMouseEntered

    private void TPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPassMouseEntered
        // TODO add your handling code here:
       TPass.setToolTipText("Enter your Password"); 
    }//GEN-LAST:event_TPassMouseEntered
public boolean verifyFields()
    {
        String fuser = TUser.getText();
        String fpass = String.valueOf(TPass.getPassword());
        if(fuser.trim().equals("") || fpass.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username and passord cannot be empty","Empty fields",2);
            return false;
        }
        else{
            return true;
        }
    }
public boolean verifyPass() {
        String pass= TPass.getText();
        int digCount = 0;
        int capsCount = 0;
        int specCount = 0;
        
        for (int i = 0 ; i < pass.length() ; i++) {
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57)
                digCount ++;//|| (word.charAt(i) >= 97 && word.charAt(i) <= 122) || (word.charAt(i) >= 65 && word.charAt(i) <= 90));
            else if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90)
                capsCount ++;
            
            if ((pass.charAt(i) >= 48 && pass.charAt(i) <= 57) || (pass.charAt(i) >= 97 && pass.charAt(i) <= 122) || (pass.charAt(i) >= 65 && pass.charAt(i) <= 90));
            else if (pass.charAt(i) == 32)
                specCount --;
            else
                specCount ++;
        }

        if (specCount >= 2 && digCount >= 2 && capsCount >= 1)
        {
            return true;}
            else{
            JOptionPane.showMessageDialog(null,"Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            } 
}

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLogin;
    private javax.swing.JButton BRegister;
    private javax.swing.JLabel LPass;
    private javax.swing.JLabel LUser;
    private javax.swing.JButton StaffLogin;
    private javax.swing.JPasswordField TPass;
    private javax.swing.JTextField TUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
