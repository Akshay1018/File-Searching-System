/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import com.sun.glass.events.KeyEvent;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hp
 */
public class NewJFrame extends javax.swing.JFrame {

    int count = 0;
    int c = 0, d = 0;
    String Filename;
    DefaultTableModel dt;
    String a;
    private Component open;
    String[] directories1;

    public NewJFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searching/bc1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clear");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 220, 40, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clear");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 90, 30, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clear");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 40, 34, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(.extension)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 60, 70, 30);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(570, 520, 80, 30);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 520, 90, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search Table");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 160, 90, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 190, 220, 30);

        jButton2.setText("Get File");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 10, 90, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 10, 110, 40);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(300, 10, 190, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 180, 350, 40);

        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(300, 120, 20, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mark To Search Also In Subfolder");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 210, 20);

        t1.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        t1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t1FocusLost(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(300, 60, 190, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Extension You Are Looking For   ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 240, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Folder To Search");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searching/j.jpg"))); // NOI18N
        jLabel6.setText("Clear");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 680, 240);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searching/j.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 510, 680, 50);

        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "FileName", "Path"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(70);
            table.getColumnModel().getColumn(0).setPreferredWidth(70);
            table.getColumnModel().getColumn(0).setMaxWidth(70);
            table.getColumnModel().getColumn(1).setPreferredWidth(77);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 240, 680, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed
    int rowcount = 0;
    int counter = 0;

    public void RecursivePrint(File[] arr, int index, int level, DefaultTableModel model, String getformatt) {
        try {
            if (index == arr.length) {
                return;

            }

            if (!arr[index].isDirectory()) {

                // System.out.println(arr[index].getPath());
                if (arr[index].getName().endsWith(getformatt)) {

                    rowcount++;
                    // System.out.println(arr[index].getName());
                    model.addRow(new Object[]{rowcount, arr[index].getName(), arr[index].getParent()});

                }

            } else {

                if (arr[index].getAbsolutePath().startsWith("D:\\$RECYCLE.BIN") || arr[index].getAbsolutePath().startsWith("D:\\System Volume Information") || arr[index].getAbsolutePath().startsWith("E:\\$RECYCLE.BIN") || arr[index].getAbsolutePath().startsWith("E:\\3223") || arr[index].getAbsolutePath().startsWith("E:\\3993") || arr[index].getAbsolutePath().startsWith("E:\\3993\\DisplayAudio") || arr[index].getAbsolutePath().startsWith("E:\\3993\\Graphics") || arr[index].getAbsolutePath().startsWith("E:\\3993") || arr[index].getAbsolutePath().startsWith("D:\\$RECYCLE.BIN") || arr[index].getAbsolutePath().startsWith("D:\\AAVBMTBSR") || arr[index].getAbsolutePath().startsWith(" D:\\chd")) {
                } else {
                    RecursivePrint(arr[index].listFiles(), 0, level + 1, model, getformatt);

                }
            }

            RecursivePrint(arr, ++index, level, model, getformatt);

            if (rowcount == 0) {
                //JOptionPane.showMessageDialog(null, "No Content Found ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
                rowcount++;

                if (c == 0 || c == 1) {

                    c = 1;

                }

            } else {

                if (counter != 0) {
                    // JOptionPane.showMessageDialog(null, "No Content Found ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    counter++;

                }
            }
        } catch (NullPointerException n) {

        }
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String e = t1.getText();

        String path = t2.getText();

        File file = new File(path);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String getformatt = t1.getText();
        if (file.length() == 0) {
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Select Folder To Search ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Empty ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (jCheckBox1.isSelected()) {

            if (file.exists() && file.isDirectory()) {
                if (rowcount == 0) {
                    // JOptionPane.showMessageDialog(null, "No Content Found ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    rowcount++;
                } else {
                    if (counter != 0) {

                    }
                    rowcount++;
                }

                File arr[] = file.listFiles();
                if (arr.length > 0) {
                    RecursivePrint(arr, 0, 0, model, getformatt);

                } else {
                    JOptionPane.showMessageDialog(null, "File Not Found ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        } else {
            if (file.length() != 0) {
                if (path.equalsIgnoreCase("") || getformatt.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Enter The Extension !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    while (model.getRowCount() > 0) {
                        for (int i = 0; i < model.getRowCount(); i++) {
                            model.removeRow(i);

                        }
                    }
                    File[] files = file.listFiles(new FilenameFilter() {

                        @Override
                        public boolean accept(File dir, String name) {
                            if (name.toLowerCase().endsWith(getformatt)) {
                                return true;
                            } else {

                                return false;
                            }
                        }
                    });

                    System.out.println("***********");
                    String filepath = Filename;
                    File u = new File(path);
                    try {
                        a = u.getCanonicalPath();
                        System.out.println(a);
                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, path);
                    }

                    String absoluteFilepath = file.getAbsolutePath();
                    System.out.println("absolute file path" + absoluteFilepath);

                    System.out.println("Count Of Files " + files.length);

//                   
//                    if(t1.getText().equals("")) {
//                       JOptionPane.showMessageDialog(null, "Enter The Extension !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    }else {
//                         
//               System.out.println("the file is empty "+ t1.getText());
//                    
//                    
//                    }
//           
//     
//               }else{
                    if (files.length != 0) {

                        for (File f : files) {

                            // System.out.println(f.getName());
                            model.addRow(new Object[]{count, f.getName(), a});
                            count++;
                            continue;

                        }

                    } else {

                        model.setRowCount(0);
                        c++;

                        JOptionPane.showMessageDialog(null, "No File Found ! Mark The Checkbox !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                    }

                }
            }

//                int count= table.getModel().getRowCount(); 
//                if(file.length()!=0)
//                    if(table!=null&&table.getModel()!=null){
//                        JOptionPane.showMessageDialog(null, "No File Found ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    }
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

//          if(jCheckBox1.isSelected())
//        {
//            File f=new File(t2.getText());
//        s
//             directories1 = f.list(new FilenameFilter() {
//        @Override
//        public boolean accept(File current, String name) {
//        return new File(current, name).isDirectory();
//        }
//        });
//        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked


    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setPreferredSize(new Dimension(500, 500));
        fc.setCurrentDirectory(new java.io.File("C:\\Users\\hp\\Desktop"));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        fc.showOpenDialog(open);

        File f = fc.getSelectedFile();
        Filename = f.getAbsolutePath();
        t2.setText(Filename);
        // fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //if_(fc.showOpenDialog(open)==JFileChooser.APPROVE_OPTION){

        {
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int i = table.getSelectedRow();
        TableModel m = table.getModel();

        String value = m.getValueAt(i, 1).toString();
        // System.out.println(value);

        if (Filename != null) {

            try {
                Desktop d = Desktop.getDesktop();
                d.open(new File(Filename));

                File directory = new File(Filename);
                File[] fList = directory.listFiles();
                for (File file : fList) {

                    if (value.equals(file.getName())) {

                    }
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_tableMouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel table = (DefaultTableModel) this.table.getModel();
        String search = jTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        this.table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed

    }//GEN-LAST:event_tableMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clr();
    }//GEN-LAST:event_jButton3ActionPerformed

    void clr() {
        // r1.setSelected(false);
        // r2.setSelected(false);
        // r3.setSelected(false);
        jCheckBox1.setSelected(false);
        t1.setText("");
        t2.setText("");
        rowcount = 0;
        count = 0;
        c = 0;
        jCheckBox1.setText("");
        jTextField1.setText("");
        ((DefaultTableModel) table.getModel()).setNumRows(0);
    }
    private void t1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusGained
//        if (t1.getText().equals(".extension")) {
//            t1.setText("");
//        }
//        t1.setForeground(Color.black);
    }//GEN-LAST:event_t1FocusGained

    private void t1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusLost

    }//GEN-LAST:event_t1FocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String e = t1.getText();

            String path = t2.getText();

            File file = new File(path);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String getformatt = t1.getText();
            if (file.length() == 0) {
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Select Folder To Search ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, " ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (t2.getText().equals("")) {
                jButton1.setEnabled(false);
            } else {
                jButton1.setEnabled(true);
            }

            if (jCheckBox1.isSelected()) {

                if (file.exists() && file.isDirectory()) {

                    File arr[] = file.listFiles();
                    if (arr.length > 0) {
                        RecursivePrint(arr, 0, 0, model, getformatt);
                    } else {
                        JOptionPane.showMessageDialog(null, "File Not Found ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                    }

                }

            } else {
                if (file.length() != 0) {
                    if (path.equalsIgnoreCase("") || getformatt.equalsIgnoreCase("")) {
                        JOptionPane.showMessageDialog(null, "Enter The Extension !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        while (model.getRowCount() > 0) {
                            for (int i = 0; i < model.getRowCount(); i++) {
                                model.removeRow(i);
                            }
                        }
                        File[] files = file.listFiles(new FilenameFilter() {

                            @Override
                            public boolean accept(File dir, String name) {
                                if (name.toLowerCase().endsWith(getformatt)) {
                                    return true;
                                } else {

                                    return false;
                                }
                            }
                        });

                        System.out.println("***********");
                        String filepath = Filename;
                        File u = new File(path);
                        try {
                            a = u.getCanonicalPath();
                            //System.out.println(a);
                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, path);
                        }

                        String absoluteFilepath = file.getAbsolutePath();
                        //System.out.println("absolute file path" + absoluteFilepath);

                        // System.out.println("Count Of Files " + files.length);
//                   
//                    if(t1.getText().equals("")) {
//                       JOptionPane.showMessageDialog(null, "Enter The Extension !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    }else {
//                         
//               System.out.println("the file is empty "+ t1.getText());
//                    
//                    
//                    }
//           
//     
//               }else{
                        if (files.length != 0) {

                            for (File f : files) {
                                count++;
                                // System.out.println(f.getName());
                                model.addRow(new Object[]{count, f.getName(), a});

                            }

                        } else {
                            model.setRowCount(0);
                            c++;
                            JOptionPane.showMessageDialog(null, "No File Found ! Mark The Checkbox !", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

                        }

                    }
                }

//                int count= table.getModel().getRowCount(); 
//                if(file.length()!=0)
//                    if(table!=null&&table.getModel()!=null){
//                        JOptionPane.showMessageDialog(null, "No File Found ! ", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//                    }
            }

        }
    }//GEN-LAST:event_t1KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        t2.setText("");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        t1.setText("");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void groupButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
