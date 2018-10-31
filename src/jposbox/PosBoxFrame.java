/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jposbox;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.JOptionPane;

/**
 *
 * @author Jove
 */
public class PosBoxFrame extends javax.swing.JFrame {
    public static String DriverDB="org.apache.derby.jdbc.EmbeddedDriver";
    static String connectionURL = "jdbc:derby:"+System.getProperty("user.home")+"/jPosBox/db;create=true";
    Statement stmt = null;

    /**
     * Creates new form PosBoxFrame
     */
    public PosBoxFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PosBoxesComboBox = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBoxStart = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        startminimized = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ComboPrinter1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        PortPrinter1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SaveButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComboPrinter2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        PortPrinter2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jPosBox");

        jLabel1.setText("PosBoxes:");

        PosBoxesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        jCheckBox1.setText("Run jPosBox on system startup");
        jCheckBox1.setEnabled(false);

        jCheckBoxStart.setText("Start PosBoxes automatically");

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Print main ref instead order");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setText("Save receipts to reprint");

        startminimized.setText("Start minimized");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBoxStart)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PosBoxesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1))
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startminimized)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PosBoxesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(startminimized))
                .addContainerGap())
        );

        jTabbedPane1.addTab("jPosBox", jPanel1);

        jLabel2.setText("Printer:");

        jLabel3.setText("Port:");

        PortPrinter1.setText("8069");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");

        SaveButton1.setText("Save");
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboPrinter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PortPrinter1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SaveButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboPrinter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PortPrinter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(SaveButton1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PosBox 1", jPanel2);

        jLabel4.setText("Printer:");

        jLabel5.setText("Port:");

        PortPrinter2.setText("8070");

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Stop");

        jButton5.setText("Start");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboPrinter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PortPrinter2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboPrinter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PortPrinter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PosBox 2", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("jPosBox");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StartPosBox1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        SaveAll();
    }//GEN-LAST:event_SaveButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SaveAll();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        StartPosBox2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SaveAll();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosBoxFrame().setVisible(true);
            }
        });
    }
    
    
    
    public void LoadDB() {
        try {
            Class.forName(DriverDB);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection conn = DriverManager.getConnection(PosBoxFrame.connectionURL, "PosBoxFrame", "PosBoxFrame");
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.execute("CREATE TABLE \"conf\"\n" +
            "(\n" +
            "\"id\" INT not null primary key\n" +
            "        GENERATED ALWAYS AS IDENTITY\n" +
            "        (START WITH 1, INCREMENT BY 1),   \n" +
            "\"name\" VARCHAR(80),     \n" +
            "\"value\" VARCHAR(300)     \n" +
            ")");
            } catch (Exception e) { /*If is created do nothing*/}
        //PosBoxes
        PosBoxesComboBox.setSelectedIndex(Integer.parseInt(getconf("PosBoxes")));
        if (getconf("PosBoxes").toString().equals("0")){
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
        }
        else if (getconf("PosBoxes").toString().equals("1")){
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, false);
        }
        else if (getconf("PosBoxes").toString().equals("2")){
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
        }
        //Printers
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
            for (PrintService printer : printServices){
            ComboPrinter1.addItem(printer.getName());
            ComboPrinter2.addItem(printer.getName());
        }
        ComboPrinter1.setSelectedItem(getconf("Printer1"));
        ComboPrinter2.setSelectedItem(getconf("Printer2"));
        
        //Ports
        PortPrinter1.setText(getconf("PortPrinter1"));
        PortPrinter2.setText(getconf("PortPrinter2"));
        
        //Run PosBoxes automatically
        if (getconf("auto").equals("on")){
            jCheckBoxStart.setSelected(true);
            if (getconf("PosBoxes").toString().equals("1") || getconf("PosBoxes").toString().equals("2")){
                StartPosBox1();
            }
            if (getconf("PosBoxes").toString().equals("2")){
                StartPosBox2();
            }
        }
        
        if (getconf("startminimized").equals("yes")) startminimized.setSelected(true);
        
    }
    
    
    public void tray(){
        Tray tray=new Tray();
        boolean istray=tray.tray();
        if (istray) setVisible(false);
    }
    
    public void StartPosBox1(){
        Web web=new Web();
        int error=web.StartServer(Integer.parseInt(getconf("PortPrinter1")), getconf("Printer1"));
        if (error>0){
            int dialogButton = JOptionPane.YES_OPTION;
            JOptionPane.showMessageDialog(this, "Port "+error+" is in use");
        }
    }
    
    
    public void StartPosBox2(){
        Web web=new Web();
        int error=web.StartServer(Integer.parseInt(getconf("PortPrinter2")), getconf("Printer2"));
        if (error>0){
            int dialogButton = JOptionPane.YES_OPTION;
            JOptionPane.showMessageDialog(this, "Port "+error+" is in use");
        }
    }
    
    
    public void saveconf(String name, String value){
        int count=0;
        try {
            count = stmt.executeUpdate("UPDATE PosBoxFrame.\"conf\" SET \"value\" ='"+value+"' WHERE \"name\"='"+name+"'");
        } catch (SQLException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (count==0) try {
            stmt.execute("INSERT INTO PosBoxFrame.\"conf\" (\"name\", \"value\") values ('"+name+"','"+value+"')");
        } catch (SQLException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public String getconf (String name) {
        ResultSet rs = null;
        String result="nothing";
        try {
            rs = stmt.executeQuery("SELECT \"value\" from PosBoxFrame.\"conf\" where \"name\"='"+name+"'");
        } catch (SQLException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (rs.next()) result= rs.getString("value");
        } catch (SQLException ex) {
            Logger.getLogger(PosBoxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        // VALORES POR DEFECTO
        if (result.equals("nothing")) {
            if (name=="PosBoxes") return "0";
            else if (name=="PortPrinter1") return "8069";
            else if (name=="PortPrinter2") return "8070";
        }
        // FIN VALORES POR DEFECTO
        return result;
    }
    
    public void SaveAll(){
        saveconf("PosBoxes",Integer.toString(PosBoxesComboBox.getSelectedIndex()));
        if (getconf("PosBoxes").toString().equals("0")){
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
        }
        else if (getconf("PosBoxes").toString().equals("1")){
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, false);
        }
        else if (getconf("PosBoxes").toString().equals("2")){
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
        }
        if (jCheckBoxStart.isSelected()) saveconf("auto", "on"); else saveconf("auto", "off");
        if (startminimized.isSelected()) saveconf("startminimized", "yes");
        else saveconf("startminimized", "no");
        saveconf("Printer1", ComboPrinter1.getSelectedItem().toString());
        saveconf("PortPrinter1", PortPrinter1.getText());
        saveconf("Printer2", ComboPrinter2.getSelectedItem().toString());
        saveconf("PortPrinter2", PortPrinter2.getText());
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ComboPrinter1;
    private javax.swing.JComboBox<String> ComboPrinter2;
    public static javax.swing.JTextField PortPrinter1;
    private javax.swing.JTextField PortPrinter2;
    private javax.swing.JComboBox<String> PosBoxesComboBox;
    private javax.swing.JButton SaveButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBoxStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox startminimized;
    // End of variables declaration//GEN-END:variables
}
