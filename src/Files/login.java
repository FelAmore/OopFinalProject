import java.awt.Color;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame implements Interface{

    @Override
    public void goBack() {
        new main().setVisible(true);
        dispose();
    }
    
    public login() {
        initComponents();
        // set the warning label (Incorrect Username or Password) invisible when first starting the page
        warningLbl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBtn = new javax.swing.JButton();
        loginLbl = new javax.swing.JLabel();
        warningLbl = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        showPass = new javax.swing.JCheckBox();
        loginBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setForeground(new java.awt.Color(0, 118, 221));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        loginLbl.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 118, 221));
        loginLbl.setText("LOGIN");
        getContentPane().add(loginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        warningLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        warningLbl.setText("Incorrect Username or Password");
        getContentPane().add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        username.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 118, 221));
        username.setText("Enter Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 303, -1));

        password.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 118, 221));
        password.setText("Enter password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 303, -1));

        loginBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(0, 118, 221));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        showPass.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        showPass.setForeground(new java.awt.Color(0, 118, 221));
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, -1, -1));

        loginBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background.PNG"))); // NOI18N
        getContentPane().add(loginBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // when the exit button is clicked, pop up message will appear asking confirmation to exit app
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0 ) { // if user chooses yes
            System.exit(0); // exit the program
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // if the username and password are correct
        if (username.getText().equals("Admin") && password.getText().equals("oop final project")) {             
            // redirecting to main page
            goBack();
        }
        else { // if the username and/ or password is incorrect
            // set the warning label to visible
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // set the warning label to invisible
        warningLbl.setVisible(false);
        // if the text is "Enter Username", change it into nothing or blank and set the color
        if (username.getText().equals("Enter Username")) {
            username.setText("");
            username.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // set the warning label to invisible
        warningLbl.setVisible(false);
        // if there is no text, set it to "Enter Username" and set the color
        if (username.getText().equals("")) {
            username.setText("Enter Username");
            username.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // set the warning label to invisible
        warningLbl.setVisible(false);
        // if the text is "Enter Password", change it into nothing or blank and set the color
        if (password.getText().equals("Enter Password")) {
            password.setText("");
            password.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // set the warning label to invisible
        warningLbl.setVisible(false);
        // if there is no text, set it to "Enter Password" and set the color
        if (password.getText().equals("")) {
            password.setText("Enter Password");
            password.setForeground(new Color(0,118,221));
        } 
    }//GEN-LAST:event_passwordFocusLost

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) { // if the show password checkbox is ticked
            password.setEchoChar((char)0); // whatever written in the password textfield will appear as it is
        }
        else { // if the show password checkbox is not ticked
            password.setEchoChar('*'); // whatever written in the password textfield will appear as *
        }
    }//GEN-LAST:event_showPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel loginBg;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField username;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
