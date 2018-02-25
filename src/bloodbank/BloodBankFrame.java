
package bloodbank;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BloodBankFrame extends javax.swing.JFrame {

   private boolean newDonor;
   private Controller cont;
   private String accDonationFile;
   private String rejDonationFile;
   private String accDonorFile;
   private String rejDonorFile;
   private String JsonAccDonation;
   private String JsonRejDonation;
   private String JsonAccDonor;
   private String JsonRejDonor;
   
   private Graph g;
   
    public BloodBankFrame() {
        initComponents();
        scndInitComps();
    }
    
    private void scndInitComps(){
       
        changeState(1);
        this.setTitle("Blood Bank");
        ImageIcon icon = new ImageIcon("blood.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocation(540, 30);

        cont = new Controller();
        accDonationFile = "AccepetedDonation.json";
        rejDonationFile = "RejectedDonation.json";
        accDonorFile = "AccepetedDonors.json";
        rejDonorFile = "RejectedDonors.json";
        JsonAccDonation = "Json1";
        JsonRejDonation = "Json2";
        JsonAccDonor = "Json3";
        JsonRejDonor = "Json4";

        cont.loadAccDonations(accDonationFile);
        cont.loadRejDonations(rejDonationFile);
        cont.loadAccDonors(accDonorFile);
        cont.loadRejDonors(rejDonorFile);
        
        LocalDate l = LocalDate.now();
        ToDay1.setSelectedIndex(l.getDayOfMonth());
        CurrentMonth1.setSelectedIndex(l.getMonthValue());
        CurrentYear1.setSelectedIndex(l.getYear()-2005);
    }
    
    private void changeState(int x){
        if (x == 1){
            graphPanel.setVisible(false);
            detailsPanel1.setVisible(false);
            title2.setVisible(false);
            backButton.setVisible(false);
            clearButton.setVisible(false);
            quitButton.setVisible(true);
            title1.setVisible(true);
            logo.setVisible(true);
            newDonationButton.setVisible(true);
            showGraphsButton.setVisible(true);
            submitButton.setVisible(false);
            clearButton.setVisible(false);
            saveAllButton.setVisible(false);
            CurrentMonth1.setVisible(false);
            CurrentYear1.setVisible(false);
            ToDay1.setVisible(false);
            dateLabel.setVisible(false);
            jButton2.setVisible(false);
            
            
        }
        else if (x == 2){
            graphPanel.setVisible(false);
            detailsPanel1.setVisible(true);
            title1.setVisible(false);
            logo.setVisible(false);
            newDonationButton.setVisible(false);
            showGraphsButton.setVisible(false);
            title2.setVisible(true);
            backButton.setVisible(true);
            clearButton.setVisible(true);
            quitButton.setVisible(false);
            submitButton.setVisible(true);
            clearButton.setVisible(true);
            saveAllButton.setVisible(true);
            CurrentMonth1.setVisible(true);
            CurrentYear1.setVisible(true);
            ToDay1.setVisible(true);
            dateLabel.setVisible(true);
            jButton2.setVisible(true);
        }
        
        else if (x == 3){
            graphPanel.setVisible(true);
            title1.setVisible(false);
            logo.setVisible(false);
            newDonationButton.setVisible(false);
            showGraphsButton.setVisible(false);
            quitButton.setVisible(false);
            backButton.setVisible(true);
            timeGraphsPanel.setVisible(false);
            CurrentMonth1.setVisible(false);
            CurrentYear1.setVisible(false);
            ToDay1.setVisible(false);
            dateLabel.setVisible(false);
            jButton2.setVisible(false);
        }
        
    }
    
    private void clear(){
        name1.setText("");
        Age1.setText("");
        Mobile1.setText("");
        email1.setText("");
        Gender1.setSelectedIndex(0);
        BloodType1.setSelectedIndex(0);
        LastDonationDay1.setSelectedIndex(0);
        LastDonationMonth1.setSelectedIndex(0);
        LastDonationYear1.setSelectedIndex(0);
        jRadioButton6.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        newDonationButton = new javax.swing.JButton();
        showGraphsButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        detailsPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Gender1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Age1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Mobile1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        BloodType1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        LastDonationDay1 = new javax.swing.JComboBox<>();
        LastDonationMonth1 = new javax.swing.JComboBox<>();
        LastDonationYear1 = new javax.swing.JComboBox<>();
        saveAllButton = new javax.swing.JButton();
        graphPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        timeGraphsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        formMonth = new javax.swing.JComboBox<>();
        fromYear = new javax.swing.JComboBox<>();
        formDay = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        toDay = new javax.swing.JComboBox<>();
        toMonth = new javax.swing.JComboBox<>();
        toYear = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        CurrentYear1 = new javax.swing.JComboBox<>();
        CurrentMonth1 = new javax.swing.JComboBox<>();
        ToDay1 = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 120)); // NOI18N
        title1.setForeground(new java.awt.Color(204, 0, 0));
        title1.setText("Blood Bank");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 119));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/b.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 360));

        newDonationButton.setBackground(new java.awt.Color(102, 102, 102));
        newDonationButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        newDonationButton.setForeground(new java.awt.Color(255, 255, 255));
        newDonationButton.setText("New Donation");
        newDonationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDonationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newDonationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 151, 38));

        showGraphsButton.setBackground(new java.awt.Color(102, 102, 102));
        showGraphsButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        showGraphsButton.setForeground(new java.awt.Color(255, 255, 255));
        showGraphsButton.setText("Show Graphs");
        showGraphsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showGraphsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 151, 38));

        quitButton.setBackground(new java.awt.Color(204, 0, 0));
        quitButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 255, 255));
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 151, 38));

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(204, 0, 0));
        title2.setText("Please fill the form:");
        title2.setAlignmentX(0.5F);
        getContentPane().add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 50));

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        clearButton.setForeground(new java.awt.Color(204, 0, 0));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 140, 30));

        submitButton.setBackground(new java.awt.Color(204, 0, 0));
        submitButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 140, 30));

        backButton.setBackground(new java.awt.Color(204, 0, 0));
        backButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 151, 35));

        detailsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donation Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(153, 153, 153))); // NOI18N
        detailsPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel11.setText("Full Name:");

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel12.setText("Gender:");

        Gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel13.setText("Age:");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel14.setText("Mobile Number:");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel15.setText("Blood Type:");

        BloodType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-" }));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel16.setText("Last Time Blood Donated:");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(102, 255, 0));
        jRadioButton6.setText("Accepted");
        jRadioButton6.setToolTipText("");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton7.setText("Rejected");
        jRadioButton7.setToolTipText("");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        jLabel19.setText("Email:");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jRadioButton8.setText("Registered Donor");
        jRadioButton8.setToolTipText("");
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jRadioButton9.setText("New Donor");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        LastDonationDay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        LastDonationMonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December " }));

        LastDonationYear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        javax.swing.GroupLayout detailsPanel1Layout = new javax.swing.GroupLayout(detailsPanel1);
        detailsPanel1.setLayout(detailsPanel1Layout);
        detailsPanel1Layout.setHorizontalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(LastDonationDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(LastDonationMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LastDonationYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BloodType1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mobile1)
                            .addComponent(email1)
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton7))
                            .addGroup(detailsPanel1Layout.createSequentialGroup()
                                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton8)
                                        .addGap(35, 35, 35)
                                        .addComponent(jRadioButton9))
                                    .addComponent(name1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gender1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Age1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(210, 210, 210))))
        );
        detailsPanel1Layout.setVerticalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9))
                        .addGap(18, 18, 18)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodType1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastDonationDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastDonationMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastDonationYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6)))
        );

        getContentPane().add(detailsPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, -1));

        saveAllButton.setBackground(new java.awt.Color(204, 0, 0));
        saveAllButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        saveAllButton.setForeground(new java.awt.Color(255, 255, 255));
        saveAllButton.setText("Save All");
        saveAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 140, 30));

        graphPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select a graph to show:");
        jLabel2.setAlignmentX(0.5F);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("Type Quantity vs. Time");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setText("Quantity vs. Accepted/Rejected");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox3.setText("Accepted/Rejected vs. Time");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        timeGraphsPanel.setBackground(new java.awt.Color(255, 255, 255));
        timeGraphsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time Graphs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 28)); // NOI18N
        jLabel1.setText("Blood Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-" }));

        formMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December " }));

        fromYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        formDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("From:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 28)); // NOI18N
        jLabel4.setText("Period:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("To:");

        toDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        toMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December " }));

        toYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        javax.swing.GroupLayout timeGraphsPanelLayout = new javax.swing.GroupLayout(timeGraphsPanel);
        timeGraphsPanel.setLayout(timeGraphsPanelLayout);
        timeGraphsPanelLayout.setHorizontalGroup(
            timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeGraphsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeGraphsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(timeGraphsPanelLayout.createSequentialGroup()
                        .addComponent(toDay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toYear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timeGraphsPanelLayout.createSequentialGroup()
                        .addComponent(formDay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 253, Short.MAX_VALUE))
        );
        timeGraphsPanelLayout.setVerticalGroup(
            timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeGraphsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(formMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(timeGraphsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(toDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, graphPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeGraphsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(graphPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(33, 33, 33)
                .addComponent(jCheckBox1)
                .addGap(36, 36, 36)
                .addComponent(jCheckBox3)
                .addGap(38, 38, 38)
                .addComponent(timeGraphsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(graphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 700));

        CurrentYear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        getContentPane().add(CurrentYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 10, 81, 27));

        CurrentMonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December " }));
        getContentPane().add(CurrentMonth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 27));

        ToDay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ToDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToDay1ActionPerformed(evt);
            }
        });
        getContentPane().add(ToDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 10, 81, 27));

        dateLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 27)); // NOI18N
        dateLabel.setText("Date:");
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 10, -1, 27));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newDonationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDonationButtonActionPerformed
        changeState(2);
    
    }//GEN-LAST:event_newDonationButtonActionPerformed

    private void showGraphsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphsButtonActionPerformed
       changeState(3);
       if (jCheckBox1.isSelected() || jCheckBox3.isSelected())
           timeGraphsPanel.setVisible(true);
    }//GEN-LAST:event_showGraphsButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        changeState(1);
      
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clear();
      
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        LocalDate current = LocalDate.of(this.CurrentYear1.getSelectedIndex()+2005, this.CurrentMonth1.getSelectedIndex(),
                this.ToDay1.getSelectedIndex());
        if(newDonor){
            LocalDate lastTime = LocalDate.of(this.LastDonationYear1.getSelectedIndex()+2005, this.LastDonationMonth1.getSelectedIndex(),
                this.LastDonationDay1.getSelectedIndex());
            if(cont.isValid(lastTime, current)){
                cont.addDonor(this.jRadioButton6.isSelected(), this.name1.getText(), this.Age1.getText(), this.email1.getText(), 
                this.Gender1.getSelectedIndex(), this.Mobile1.getText(), current, 
                this.BloodType1.getSelectedIndex(),true);
        }
            else {
                cont.addDonor(this.jRadioButton6.isSelected(), this.name1.getText(), this.Age1.getText(), this.email1.getText(),
                        this.Gender1.getSelectedIndex(), this.Mobile1.getText(), lastTime,
                        this.BloodType1.getSelectedIndex(),false);
                JOptionPane.showMessageDialog(this, "For the donor's health, the period between two successive donations should be more than 90 days. He will be notified of the date on which he can donate.");
            }
        }
        else{
            Donor D = cont.getDonor(this.email1.getText());
            if(cont.isValid(D.getLastDonation(), current)){
                D.setLastDonation(current);
                cont.addDonation(true, D, current);
            }
            else{
                JOptionPane.showMessageDialog(this, "For the donor's health, the period between two successive donations should be more than 90 days. He will be notified of the date on which he can donate.");
            }
            D.setCanDonate(false);
        }
        clear();
       
    }//GEN-LAST:event_submitButtonActionPerformed

    private void saveAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAllButtonActionPerformed
        cont.saveDonations(cont.getAccDonations(), accDonationFile, JsonAccDonation);
        cont.saveDonations(cont.getRejDonations(), rejDonationFile, JsonRejDonation);
        cont.saveDonors(cont.getAccDonors(), accDonorFile, JsonAccDonor);
        cont.saveDonors(cont.getRejDonors(), rejDonorFile, JsonRejDonor);
    }//GEN-LAST:event_saveAllButtonActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton8.isSelected())
        jRadioButton8.setSelected(false);
        newDonor = true;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton9.isSelected())
        jRadioButton9.setSelected(false);
        String Email;
        do{
            Email = JOptionPane.showInputDialog("Please enter donor's email: ");
        }
        while(Email != null && Email.equals(""));
        if(Email != null){
            newDonor = false;
            Donor D = cont.getDonor(Email);
            if(D!=null){
                this.Age1.setText(D.getAge());
                this.name1.setText(D.getName());
                this.Mobile1.setText(D.getMobileNum());
                this.email1.setText(Email);
                this.BloodType1.setSelectedIndex(D.getBloodType());
                this.Gender1.setSelectedIndex(D.getGender());
                this.LastDonationYear1.setSelectedIndex(D.getLastDonation().getYear()-2005);
                this.LastDonationMonth1.setSelectedIndex(D.getLastDonation().getMonthValue());
                this.LastDonationDay1.setSelectedIndex(D.getLastDonation().getDayOfMonth());
                this.invalidate();
                if(!D.isAccepted()){
                    JOptionPane.showMessageDialog(this, "Sorry the donor can't donate as his blood sample is rejected");
                    changeState(2);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Sorry there's no registered donor with this email, please re-check your spelling");
                jRadioButton8.doClick();
            }
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton6.isSelected())
            jRadioButton6.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton7.isSelected())
            jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void ToDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToDay1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        timeGraphsPanel.setVisible(true);
        jCheckBox2.setSelected(false);
        jCheckBox1.setSelected(true);
        jCheckBox3.setSelected(false);
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        timeGraphsPanel.setVisible(false);
        jCheckBox2.setSelected(true);
        jCheckBox1.setSelected(false);
        jCheckBox3.setSelected(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        timeGraphsPanel.setVisible(true);
        jCheckBox2.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox3.setSelected(true);
        jComboBox1.setEnabled(false);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (jCheckBox3.isSelected() || jCheckBox1.isSelected()){
            g  = new Graph(cont);
            LocalDate from = LocalDate.of(Integer.parseInt(fromYear.getItemAt(fromYear.getSelectedIndex())),formMonth.getSelectedIndex(),Integer.parseInt(formDay.getItemAt(formDay.getSelectedIndex())));
            LocalDate to = LocalDate.of(Integer.parseInt(toYear.getItemAt(toYear.getSelectedIndex())),toMonth.getSelectedIndex(),Integer.parseInt(toDay.getItemAt(toDay.getSelectedIndex())));
            g.setDates(from, to);
            if(jCheckBox1.isSelected()){
                g.setBloodType(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                g.drawGraph2();
            }
            else{
                g.drawGraph3();
            }
        }
        else if (jCheckBox2.isSelected()){
            g  = new Graph(cont);
            g.drawGraph1();
        }
        else 
            JOptionPane.showMessageDialog(null, "Please select a graph to show.");
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cont.dateChanged(LocalDate.of(this.CurrentYear1.getSelectedIndex()+2005, this.CurrentMonth1.getSelectedIndex(),
                this.ToDay1.getSelectedIndex()));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age1;
    private javax.swing.JComboBox<String> BloodType1;
    private javax.swing.JComboBox<String> CurrentMonth1;
    private javax.swing.JComboBox<String> CurrentYear1;
    private javax.swing.JComboBox<String> Gender1;
    private javax.swing.JComboBox<String> LastDonationDay1;
    private javax.swing.JComboBox<String> LastDonationMonth1;
    private javax.swing.JComboBox<String> LastDonationYear1;
    private javax.swing.JTextField Mobile1;
    private javax.swing.JComboBox<String> ToDay1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel detailsPanel1;
    private javax.swing.JTextField email1;
    private javax.swing.JComboBox<String> formDay;
    private javax.swing.JComboBox<String> formMonth;
    private javax.swing.JComboBox<String> fromYear;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField name1;
    private javax.swing.JButton newDonationButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton saveAllButton;
    private javax.swing.JButton showGraphsButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel timeGraphsPanel;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JComboBox<String> toDay;
    private javax.swing.JComboBox<String> toMonth;
    private javax.swing.JComboBox<String> toYear;
    // End of variables declaration//GEN-END:variables
}
