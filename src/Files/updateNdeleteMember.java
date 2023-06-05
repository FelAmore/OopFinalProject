import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;

public class updateNdeleteMember extends javax.swing.JFrame implements Interface{

    @Override
    public void goBack() {
        new main().setVisible(true);
        dispose();
    }
    
    public updateNdeleteMember() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        updateNdeleteMemberLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idData = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        nameData = new javax.swing.JTextField();
        mobileNumLbl = new javax.swing.JLabel();
        mobileNumData = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailData = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        genderData = new javax.swing.JTextField();
        fatherLbl = new javax.swing.JLabel();
        fatherData = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        motherLbl = new javax.swing.JLabel();
        motherData = new javax.swing.JTextField();
        timeLbl = new javax.swing.JLabel();
        timeData = new javax.swing.JTextField();
        idNumLbl = new javax.swing.JLabel();
        idNumData = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageData = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        amountData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        closeBtn.setForeground(new java.awt.Color(0, 118, 221));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        updateNdeleteMemberLbl.setBackground(new java.awt.Color(255, 255, 255));
        updateNdeleteMemberLbl.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        updateNdeleteMemberLbl.setForeground(new java.awt.Color(0, 118, 221));
        updateNdeleteMemberLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update & delete member.png"))); // NOI18N
        updateNdeleteMemberLbl.setText("Update and Delete ");
        updateNdeleteMemberLbl.setLocation(new java.awt.Point(-31816, -32653));

        idLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idLbl.setText("Member ID:");

        idData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 118, 221));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 118, 221));
        nameLbl.setText("Name");

        nameData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameData.setForeground(new java.awt.Color(0, 118, 221));

        mobileNumLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        mobileNumLbl.setForeground(new java.awt.Color(0, 118, 221));
        mobileNumLbl.setText("Mobile Number");

        mobileNumData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        mobileNumData.setForeground(new java.awt.Color(0, 118, 221));

        emailLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(0, 118, 221));
        emailLbl.setText("Email");

        emailData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        emailData.setForeground(new java.awt.Color(0, 118, 221));

        genderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(0, 118, 221));
        genderLbl.setText("Gender");

        genderData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        genderData.setForeground(new java.awt.Color(0, 118, 221));

        fatherLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fatherLbl.setForeground(new java.awt.Color(0, 118, 221));
        fatherLbl.setText("Father's Name");

        fatherData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fatherData.setForeground(new java.awt.Color(0, 118, 221));

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 118, 221));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 118, 221));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(0, 118, 221));
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        motherLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        motherLbl.setForeground(new java.awt.Color(0, 118, 221));
        motherLbl.setText("Mother's Name");

        motherData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        motherData.setForeground(new java.awt.Color(0, 118, 221));

        timeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(0, 118, 221));
        timeLbl.setText("Gym Time");

        timeData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        timeData.setForeground(new java.awt.Color(0, 118, 221));

        idNumLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idNumLbl.setForeground(new java.awt.Color(0, 118, 221));
        idNumLbl.setText("ID Number");

        idNumData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idNumData.setForeground(new java.awt.Color(0, 118, 221));

        ageLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(0, 118, 221));
        ageLbl.setText("Age");

        ageData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ageData.setForeground(new java.awt.Color(0, 118, 221));

        amountLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(0, 118, 221));
        amountLbl.setText("Amount to Pay per Month");

        amountData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        amountData.setForeground(new java.awt.Color(0, 118, 221));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateNdeleteMemberLbl)
                .addGap(20, 20, 20))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(updateBtn)
                .addGap(47, 47, 47)
                .addComponent(deleteBtn)
                .addGap(48, 48, 48)
                .addComponent(resetBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(idLbl)
                        .addGap(18, 18, 18)
                        .addComponent(idData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(searchBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fatherLbl)
                            .addComponent(genderLbl)
                            .addComponent(emailLbl)
                            .addComponent(mobileNumLbl)
                            .addComponent(nameLbl)
                            .addComponent(nameData)
                            .addComponent(mobileNumData)
                            .addComponent(emailData)
                            .addComponent(genderData)
                            .addComponent(fatherData, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(motherLbl)
                            .addComponent(motherData)
                            .addComponent(timeLbl)
                            .addComponent(idNumLbl)
                            .addComponent(ageLbl)
                            .addComponent(amountLbl)
                            .addComponent(timeData)
                            .addComponent(idNumData)
                            .addComponent(ageData)
                            .addComponent(amountData, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateNdeleteMemberLbl)
                    .addComponent(closeBtn))
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(49, 49, 49)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(motherLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumLbl)
                    .addComponent(timeLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(idNumLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNumData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(ageLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherLbl)
                    .addComponent(amountLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(resetBtn))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // go back to the main page
        goBack();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // reset the update and delete page
        new updateNdeleteMember().setVisible(true);
        dispose();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int checkId = 0; // counter to check the id exist or not
        String ids = idData.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from member where id = '"+ids+"'"); // search the user from member labeled with id
            while (rs.next()) {
                 checkId = 1; // counter
                 idData.setEditable(false); // make the id data uneditable
                 // displaying the data retrieved from database
                 nameData.setText(rs.getString(2));
                 mobileNumData.setText(rs.getString(3));
                 emailData.setText(rs.getString(4));
                 genderData.setText(rs.getString(5));
                 fatherData.setText(rs.getString(6));
                 motherData.setText(rs.getString(7));
                 timeData.setText(rs.getString(8));
                 idNumData.setText(rs.getString(9));
                 ageData.setText(rs.getString(10));
                 amountData.setText(rs.getString(11));
                 // make the gender and time uneditable
                 genderData.setEditable(false);
                 timeData.setEditable(false);
            }
            if (checkId == 0) { 
                JOptionPane.showMessageDialog(null, "Member ID does not exist "); // display message
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // retrieve the new data
        String id = idData.getText();
        String name = nameData.getText();
        String mobileNumber = mobileNumData.getText();
        String email = emailData.getText();
        String fatherName = fatherData.getText();
        String motherName = motherData.getText();
        String idNumber = idNumData.getText();
        String age = ageData.getText();
        String amount = amountData.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("update member set name = ?, mobileNumber = ?, email = ?, fatherName = ?, motherName = ?, idNum = ?, age = ?, amount = ? where id = ?");
            // assigning new value
            ps.setString(1, name);
            ps.setString(2, mobileNumber);
            ps.setString(3, email);
            ps.setString(4, fatherName);
            ps.setString(5, motherName);
            ps.setString(6, idNumber);
            ps.setString(7, age);
            ps.setString(8, amount);
            ps.setString(9, id);
            ps.executeUpdate(); // updates database
            JOptionPane.showMessageDialog(null, "Successfully Updated"); // display message
            // reset page
            new updateNdeleteMember().setVisible(true);
            dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) { // if user chooses yes
            String id = idData.getText();
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("delete from member where id = '"+id+"'"); // delete the user from member labeled with id
                JOptionPane.showMessageDialog(null, "Successfully Deleted"); // display message
                // reset page
                new updateNdeleteMember().setVisible(true);
                dispose();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e); // display error
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageData;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField amountData;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailData;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField fatherData;
    private javax.swing.JLabel fatherLbl;
    private javax.swing.JTextField genderData;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JTextField idData;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idNumData;
    private javax.swing.JLabel idNumLbl;
    private javax.swing.JTextField mobileNumData;
    private javax.swing.JLabel mobileNumLbl;
    private javax.swing.JTextField motherData;
    private javax.swing.JLabel motherLbl;
    private javax.swing.JTextField nameData;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPanel panel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField timeData;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel updateNdeleteMemberLbl;
    // End of variables declaration//GEN-END:variables
}
