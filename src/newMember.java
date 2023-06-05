import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class newMember extends javax.swing.JFrame implements Interface{

    @Override
    public void goBack() {
        new main().setVisible(true);
        dispose();
    }
    
    public newMember() {
        initComponents();
        try {
            int id = 1; // initialize the id 
            String ids1 = String.valueOf(id); // convert id to string type
            idDataLbl.setText(ids1); // set the value to ids
            // settings to connect to the database
            Connection con = ConnectionProvider.getCon(); // get the connection
            Statement st = con.createStatement(); // send sql statements to database
            ResultSet rs = st.executeQuery("select max(id) from member");
            while (rs.next()) { 
                id = rs.getInt(1); // retrieve the value of max(id)
                id++; // increase it by one
                String ids2 = String.valueOf(id); // convert the id++ value to string type
                idDataLbl.setText(ids2); // set the new text value
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        closeNM = new javax.swing.JButton();
        newMemberLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idDataLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameData = new javax.swing.JTextField();
        mobileLbl = new javax.swing.JLabel();
        mobileData = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailData = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        genderData = new javax.swing.JComboBox<>();
        fatherLbl = new javax.swing.JLabel();
        fatherData = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        motherLbl = new javax.swing.JLabel();
        motherData = new javax.swing.JTextField();
        timeLbl = new javax.swing.JLabel();
        timeData = new javax.swing.JComboBox<>();
        idNumLbl = new javax.swing.JLabel();
        idNumData = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageData = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        amountData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        closeNM.setForeground(new java.awt.Color(0, 118, 221));
        closeNM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        closeNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeNMActionPerformed(evt);
            }
        });

        newMemberLbl.setBackground(new java.awt.Color(255, 255, 255));
        newMemberLbl.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        newMemberLbl.setForeground(new java.awt.Color(0, 118, 221));
        newMemberLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new member.png"))); // NOI18N
        newMemberLbl.setText("New Member");

        idLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idLbl.setForeground(new java.awt.Color(0, 118, 221));
        idLbl.setText("Member ID:");

        idDataLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idDataLbl.setForeground(new java.awt.Color(255, 0, 0));
        idDataLbl.setText("00");

        nameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 118, 221));
        nameLbl.setText("Name");

        nameData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameData.setForeground(new java.awt.Color(0, 118, 221));

        mobileLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        mobileLbl.setForeground(new java.awt.Color(0, 118, 221));
        mobileLbl.setText("Mobile Number");

        mobileData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        mobileData.setForeground(new java.awt.Color(0, 118, 221));

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
        genderData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others", " " }));

        fatherLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fatherLbl.setForeground(new java.awt.Color(0, 118, 221));
        fatherLbl.setText("Father's Name");

        fatherData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fatherData.setForeground(new java.awt.Color(0, 118, 221));

        saveBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 118, 221));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
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
        timeLbl.setText("GYM Time");

        timeData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        timeData.setForeground(new java.awt.Color(0, 118, 221));
        timeData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 AM - 11:00 AM", "02:00 PM - 05:00 PM", "07:00 PM - 10:00 PM" }));

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
                .addComponent(closeNM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newMemberLbl)
                .addGap(32, 32, 32))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(30, 30, 30)
                        .addComponent(resetBtn)
                        .addContainerGap(684, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(idLbl)
                                .addGap(18, 18, 18)
                                .addComponent(idDataLbl))
                            .addComponent(nameLbl)
                            .addComponent(nameData)
                            .addComponent(mobileLbl)
                            .addComponent(mobileData)
                            .addComponent(emailLbl)
                            .addComponent(emailData)
                            .addComponent(genderLbl)
                            .addComponent(genderData, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fatherLbl)
                            .addComponent(fatherData, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(motherLbl)
                            .addComponent(motherData)
                            .addComponent(timeLbl)
                            .addComponent(timeData, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idNumLbl)
                            .addComponent(idNumData)
                            .addComponent(ageLbl)
                            .addComponent(ageData)
                            .addComponent(amountLbl)
                            .addComponent(amountData, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newMemberLbl)
                    .addComponent(closeNM))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idDataLbl))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(nameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobileLbl)
                        .addGap(18, 18, 18)
                        .addComponent(mobileData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLbl)
                        .addGap(18, 18, 18)
                        .addComponent(emailData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genderLbl)
                        .addGap(18, 18, 18)
                        .addComponent(genderData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fatherLbl)
                        .addGap(18, 18, 18)
                        .addComponent(fatherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(motherLbl)
                        .addGap(18, 18, 18)
                        .addComponent(motherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timeLbl)
                        .addGap(18, 18, 18)
                        .addComponent(timeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idNumLbl)
                        .addGap(18, 18, 18)
                        .addComponent(idNumData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ageLbl)
                        .addGap(18, 18, 18)
                        .addComponent(ageData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amountLbl)
                        .addGap(18, 18, 18)
                        .addComponent(amountData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(resetBtn))
                .addGap(20, 20, 20))
        );

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

    private void closeNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeNMActionPerformed
        // go back to the main page
        goBack();
    }//GEN-LAST:event_closeNMActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // saving each data to a variable
        String id = idDataLbl.getText();
        String name = nameData.getText();
        String mobileNumber = mobileData.getText();
        String email = emailData.getText();
        String gender = (String) genderData.getSelectedItem();
        String fatherName = fatherData.getText();
        String motherName = motherData.getText();
        String gymTime = (String) timeData.getSelectedItem();
        String idNum = idNumData.getText();
        String age = ageData.getText();
        String amount = amountData.getText();
        try {
            Connection con = ConnectionProvider.getCon(); // create the connection
            PreparedStatement ps = con.prepareStatement("insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"); // to send parameterized sql statements to the databse
            // assigning value
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, mobileNumber);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, fatherName);
            ps.setString(7, motherName);
            ps.setString(8, gymTime);
            ps.setString(9, idNum);
            ps.setString(10, age);
            ps.setString(11, amount);
            ps.executeUpdate(); // updates the data
            JOptionPane.showMessageDialog(null, "Successfully Saved"); // display message
            // reset the page after saving the data
            new newMember().setVisible(true);  
            dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // reset the page
        new newMember().setVisible(true); 
        dispose();
    }//GEN-LAST:event_resetBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageData;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField amountData;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JButton closeNM;
    private javax.swing.JTextField emailData;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField fatherData;
    private javax.swing.JLabel fatherLbl;
    private javax.swing.JComboBox<String> genderData;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel idDataLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idNumData;
    private javax.swing.JLabel idNumLbl;
    private javax.swing.JTextField mobileData;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JTextField motherData;
    private javax.swing.JLabel motherLbl;
    private javax.swing.JTextField nameData;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel newMemberLbl;
    private javax.swing.JPanel panel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> timeData;
    private javax.swing.JLabel timeLbl;
    // End of variables declaration//GEN-END:variables
}
