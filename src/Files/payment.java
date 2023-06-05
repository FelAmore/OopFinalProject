import javax.swing.table.DefaultTableModel;
import java.sql.*;
import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class payment extends javax.swing.JFrame implements Interface{
    
    @Override
    public void goBack() {
        new main().setVisible(true);
        dispose();
    }
    
    // method to organize table details
    public void tableDetails() {
        DefaultTableModel dtm = (DefaultTableModel)table.getModel();
        dtm.setRowCount(0);  // clear all data when the tableDetails methos is called
        String ids = idData.getText(); 
        try {
             Connection con = ConnectionProvider.getCon();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select *from payment where id = '"+ids+"'"); // search for user from payment labeled with id
             while (rs.next()) { 
                 dtm.addRow(new Object[]{rs.getString(2), rs.getString(3)}); // input the month and amount to a new row
             }             
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }
    
    // method to set the date
    public void date() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-YYY"); 
        Date date = new Date();
        String month = sdf.format(date); // to take only the month and year 
        dateData.setText(month); // assigning value
    }
    
    public payment() {
        initComponents();
        date(); // call the date method
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        paymentLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idData = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        dateLbl = new javax.swing.JLabel();
        dateData = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameData = new javax.swing.JTextField();
        mobileNumLbl = new javax.swing.JLabel();
        mobileNumData = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailData = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        amountData = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        closeBtn.setForeground(new java.awt.Color(0, 118, 221));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        paymentLbl.setBackground(new java.awt.Color(255, 255, 255));
        paymentLbl.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        paymentLbl.setForeground(new java.awt.Color(0, 118, 221));
        paymentLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment.png"))); // NOI18N
        paymentLbl.setText("Payment");

        idLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idLbl.setForeground(new java.awt.Color(0, 118, 221));
        idLbl.setText("Member ID :");

        idData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        idData.setForeground(new java.awt.Color(0, 118, 221));

        searchBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 118, 221));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        dateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(0, 118, 221));
        dateLbl.setText("Date            :");

        dateData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        dateData.setForeground(new java.awt.Color(0, 118, 221));
        dateData.setText("dd-mm-yyy");

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

        amountLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        amountLbl.setForeground(new java.awt.Color(0, 118, 221));
        amountLbl.setText("Amount to Pay");

        amountData.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        amountData.setForeground(new java.awt.Color(0, 118, 221));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Amount"
            }
        ));
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addGap(67, 67, 67)
                                .addComponent(resetBtn))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(amountLbl)
                                .addComponent(emailLbl)
                                .addComponent(mobileNumLbl)
                                .addComponent(nameLbl)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(dateLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(dateData))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(idLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(idData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(searchBtn))
                                .addComponent(nameData)
                                .addComponent(mobileNumData)
                                .addComponent(emailData)
                                .addComponent(amountData, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentLbl)))
                .addGap(34, 34, 34))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentLbl)
                    .addComponent(closeBtn))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl)
                            .addComponent(idData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLbl)
                            .addComponent(dateData))
                        .addGap(40, 40, 40)
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(nameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobileNumLbl)
                        .addGap(18, 18, 18)
                        .addComponent(mobileNumData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLbl)
                        .addGap(18, 18, 18)
                        .addComponent(emailData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amountLbl)
                        .addGap(18, 18, 18)
                        .addComponent(amountData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(resetBtn)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        tableDetails(); // call the tableDetails method
        int checkId = 0; // counter to check the id exist or not
        String id = idData.getText();
        String month = dateData.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from member where id = '"+id+"'"); // search for user from member labeled id
            while (rs.next()) {
                checkId = 1; // counter
                idData.setEditable(false); // make the id data uneditable
                // retrieve data from database and display them
                nameData.setText(rs.getString(2)); 
                mobileNumData.setText(rs.getString(3));
                emailData.setText(rs.getString(4));
                amountData.setText(rs.getString(11));
            }
            if (checkId == 0) { // if id does not exits
                JOptionPane.showMessageDialog(null, "Member ID does not exist"); // display message
            }
            
            // search from both payment and member from database
            ResultSet rs2 = st.executeQuery("select *from payment inner join member where payment.month='"+month+"' and payment.id='"+id+"' and member.id='"+id+"'");
            while (rs2.next()) { 
                saveBtn.setVisible(false); // make the save button invisible
                JOptionPane.showMessageDialog(null, "Payment is already done for this month"); // display message
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // go back to main page
        goBack();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // reset page
        new payment().setVisible(true);
        dispose();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String ids = idData.getText();
        String month = dateData.getText();
        String amount = amountData.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into payment values (?, ?, ?)");
            // assigning values to the payment database
            ps.setString(1, ids);
            ps.setString(2, month);
            ps.setString(3, amount);
            ps.executeUpdate(); // updates database
            tableDetails(); 
            JOptionPane.showMessageDialog(null, "Successfully Updated"); // display message
            // reset page
            new payment().setVisible(true);
            dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); // display error
        }
    }//GEN-LAST:event_saveBtnActionPerformed

//    public static void main(String args[]) {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountData;
    private javax.swing.JLabel amountLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel dateData;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField emailData;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField idData;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField mobileNumData;
    private javax.swing.JLabel mobileNumLbl;
    private javax.swing.JTextField nameData;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel paymentLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
