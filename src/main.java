import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        welcomeLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        newMember = new javax.swing.JMenu();
        updateNdelete = new javax.swing.JMenu();
        listMember = new javax.swing.JMenu();
        payment = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 118, 221));

        welcomeLbl.setFont(new java.awt.Font("American Typewriter", 1, 90)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLbl.setText("Welcome!");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(welcomeLbl)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(welcomeLbl)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        newMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new member.png"))); // NOI18N
        newMember.setText("New Member");
        newMember.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        newMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newMemberMouseClicked(evt);
            }
        });
        menuBar.add(newMember);

        updateNdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update & delete member.png"))); // NOI18N
        updateNdelete.setText("Update and Delete Member");
        updateNdelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateNdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNdeleteMouseClicked(evt);
            }
        });
        menuBar.add(updateNdelete);

        listMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list of members.png"))); // NOI18N
        listMember.setText("List of Members");
        listMember.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        listMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMemberMouseClicked(evt);
            }
        });
        menuBar.add(listMember);

        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment.png"))); // NOI18N
        payment.setText("Payment");
        payment.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });
        menuBar.add(payment);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        menuBar.add(logout);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        menuBar.add(exit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // when the logout button is clicked, pop up message will appear asking confirmation to logout 
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) { // if user chooses yes
            // redirecting to login page
            new login().setVisible(true); 
            dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // when the exit button is clicked, pop up message will appear asking confirmation to exiy app
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) { // if user chooses yes
            System.exit(0); // exit the program
        }
    }//GEN-LAST:event_exitMouseClicked

    private void newMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMemberMouseClicked
        // redirecting to new member page
        new newMember().setVisible(true); 
        dispose();
    }//GEN-LAST:event_newMemberMouseClicked

    private void updateNdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNdeleteMouseClicked
        // redirecting to update and delete member page
        new updateNdeleteMember().setVisible(true);  
        dispose();
    }//GEN-LAST:event_updateNdeleteMouseClicked

    private void listMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMemberMouseClicked
        // redirecting to list of member page
        new listMember().setVisible(true); 
        dispose();
    }//GEN-LAST:event_listMemberMouseClicked

    private void paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMouseClicked
        // redirecting to payment page
        new payment().setVisible(true); 
        dispose();
    }//GEN-LAST:event_paymentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exit;
    private javax.swing.JMenu listMember;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu newMember;
    private javax.swing.JPanel panel;
    private javax.swing.JMenu payment;
    private javax.swing.JMenu updateNdelete;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
