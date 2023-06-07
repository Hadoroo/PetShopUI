import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;


import javax.swing.*;

public class RegisterForm extends javax.swing.JFrame {
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;

    public RegisterForm() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokter Hewan", "Groomer", "Admin" }));
        jComboBox1.setBackground(Color.WHITE);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        jLabel1.setText("REGISTER");

        jLabel2.setText("USERNAME");

        jLabel3.setText("PASSWORD");

        jLabel4.setText("CONFIRM PASSWORD");
        
        jLabel5.setText("Karyawan");

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) // Add the new label
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jPasswordField1)
                        .addComponent(jPasswordField2)
                        .addComponent(jComboBox1)) // Add the JComboBox
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel2))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordField1)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordField2)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1)
                        .addComponent(jLabel5)) // Add the new label
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        String confirmPassword = new String(jPasswordField2.getPassword());
    
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        if (password.equals(confirmPassword)) {
            // Passwords match, proceed with registration logic
    
            try {
                // Generate hash of the password
                String hashedPassword = getHashedPassword(password);
    
                // Check if the username already exists
                if (isUsernameExists(username)) {
                    JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
    
                // Save the registered account to a file
                saveAccountToFile(username, hashedPassword);
    
                // Display a message or perform necessary actions after successful registration
                JOptionPane.showMessageDialog(this, "Registration Successful!");
    
                // Clear the input fields
                jTextField1.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
    
                Login lg = new Login();
                lg.setVisible(true);
                this.setVisible(false);
            } catch (NoSuchAlgorithmException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "An error occurred during registration. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Passwords don't match, display an error message
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    
            // Clear the password fields
            jPasswordField1.setText("");
            jPasswordField2.setText("");
        }
    }
    
    private boolean isUsernameExists(String username) throws IOException {
        Map<String, String> accounts = loadAccountsFromFile();
    
        return accounts.containsKey(username);
    }
    
    private Map<String, String> loadAccountsFromFile() throws IOException {
        Map<String, String> accounts = new HashMap<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader("Accounts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Username: ")) {
                    String storedUsername = line.substring("Username: ".length());
    
                    // Read the next line containing the password
                    String storedPassword = reader.readLine().substring("Password: ".length());
    
                    accounts.put(storedUsername, storedPassword);
                }
            }
        }
    
        return accounts;
    }
    
    private void saveAccountToFile(String username, String hashedPassword) throws IOException {
        try (FileWriter writer = new FileWriter("Accounts.txt", true)) {
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + hashedPassword + "\n");
            writer.write("\n");
        }
    }

    public static String getHashedPassword(String password) throws NoSuchAlgorithmException {
        try {
            // Create MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
    
            // Add password bytes to digest
            md.update(password.getBytes());
    
            // Get the hash's bytes
            byte[] hashedBytes = md.digest();
    
            // Convert the byte array to a hexadecimal string representation
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw e;
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }
}
