
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author gowais
 */
public class OSprojectFrame extends javax.swing.JFrame {

    String sss = "ls  /";
    String sss1 = "ls  /";
       void permissions(){
        StringBuilder sb = new StringBuilder(sss);
       sb.deleteCharAt(0);  sb.deleteCharAt(0);

       
       try {
         
            Process p;
            p = Runtime.getRuntime().exec("ls -l -d "+sb+"/"+cb6.getSelectedItem());
       

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
String ss="";
                String s = null;
                while ((s = br.readLine()) != null) {
                  for (int i = 0;i<s.indexOf(" ");i++)
                  {    ss +=s.charAt(i);}
                    
                  
                } 
                
                String finall = "";
                if(ss.charAt(1)!='-') finall+="read";
                if(ss.charAt(2)!='-') finall+=",write";
                if(ss.charAt(3)!='-') finall+=",exe";
                    flfl.setText(finall);
                finall="";
                  if(ss.charAt(4)!='-') finall+="read";
                if(ss.charAt(5)!='-') finall+=",write";
                if(ss.charAt(6)!='-') finall+=",exe";
                    flfl2.setText(finall);
                finall="";
                  if(ss.charAt(7)!='-') finall+="read";
                if(ss.charAt(8)!='-') finall+=",write";
                if(ss.charAt(9)!='-') finall+=",exec";
                    flfl1.setText(finall);
             
                
            
                
                 } catch (IOException ex) {
            Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
        }}
void fillFilesCB6() throws IOException{
StringBuilder sb = new StringBuilder(sss);
sb.deleteCharAt(0);sb.deleteCharAt(0);
Process p = Runtime.getRuntime().exec("ls -l "+sb);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = null;
                ArrayList al = new ArrayList();
                String ss ;
                while ((s = br.readLine()) != null) {
                  if(s.contains("/")==false  && s.charAt(0)!='d' && s.charAt(0)!='t' )
                  {ss = "";
                  for (int i = s.lastIndexOf(" ") ; i <= s.length()-1; i++ )
                  {ss+=s.charAt(i);}
                   al.add(ss.trim());
                     }
                  DefaultComboBoxModel dcbm = new  DefaultComboBoxModel();
                  dcbm.addAll(al);
                  cb6.setModel(dcbm);
                          
                }

}
    void exeSssContent() {
        try {

            Process p = Runtime.getRuntime().exec(sss);

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;
            ArrayList al = new ArrayList();
            while ((s = br.readLine()) != null) {
                al.add(s);
            }

            DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
            dcbm.addAll(al);
            cb.setModel(dcbm);
        } catch (IOException ex) {
            Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void backAndDeletionRecoveryCB() {
        if (sss.equals("ls  /") == false) {
            try {
                StringBuilder sb = new StringBuilder(sss);
                for (int i = 0; i < sss.length() - sss.lastIndexOf("/"); i++) {
                    sb.deleteCharAt(sss.lastIndexOf("/"));
                }
                sss = sb.toString();

                Process p = Runtime.getRuntime().exec(sss);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = null;
                ArrayList al = new ArrayList();
                while ((s = br.readLine()) != null) {
                    al.add(s);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                dcbm.addAll(al);
                cb.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Denied Access!");
        }
    }

    ;
    void backAndDeletionRecoveryCB5() {
        if (sss1.equals("ls  /") == false) {
            try {
                StringBuilder sb = new StringBuilder(sss1);
                for (int i = 0; i < sss1.length() - sss1.lastIndexOf("/"); i++) {
                    sb.deleteCharAt(sss1.lastIndexOf("/"));
                }
                sss1 = sb.toString();

                Process p = Runtime.getRuntime().exec(sss1);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = null;
                ArrayList al = new ArrayList();
                while ((s = br.readLine()) != null) {
                    al.add(s);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                dcbm.addAll(al);
                cb5.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Denied Access!");
        }
    }

    ;
/**
     * Creates new form NewJFrame
     */
    public OSprojectFrame() {
        initComponents();

        try {
            Process p = Runtime.getRuntime().exec("ls /");

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;
            ArrayList al = new ArrayList();
            while ((s = br.readLine()) != null) {
                al.add(s);
            }

            DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
            dcbm.addAll(al);
            cb.setModel(dcbm);
            cb5.setModel(dcbm);
        } catch (IOException ex) {
            Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        f = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cb4 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        cb5 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb6 = new javax.swing.JComboBox<>();
        flfl = new javax.swing.JTextField();
        flfl1 = new javax.swing.JTextField();
        flfl2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        jButton2.setText("get in");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("create");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "file", "directory" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "read", "write", "execute" }));

        jButton5.setText("add permission");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("remove permission");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "owner", "group", "other users" }));

        jButton7.setText("create symbolic link ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        jButton8.setText("<--");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("get in");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setText("<-----");

        jLabel2.setText("----->");

        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        jLabel3.setText("owner can");

        jLabel4.setText("group can");

        jLabel5.setText("others can");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flfl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(flfl)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(flfl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb4, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(flfl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(flfl2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(flfl1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (cb.getSelectedItem() != null) {
            try {

                sss += "/" + ((String) cb.getSelectedItem());
                Process p = Runtime.getRuntime().exec(sss);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = null;
                ArrayList al = new ArrayList();
                while ((s = br.readLine()) != null) {
                  if(s.contains("/")==false)
                    al.add(s);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                dcbm.addAll(al);
                cb.setModel(dcbm);
            ////////////////////////////////
            fillFilesCB6();
                
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
            javax.swing.JOptionPane.showMessageDialog(null, "Please, choose a folder to get in");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        backAndDeletionRecoveryCB();
        try {
            fillFilesCB6();
        } catch (IOException ex) {
            Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (cb.getSelectedItem() != null) {
            try {

                sss += "/" + ((String) cb.getSelectedItem());
                StringBuilder sb = new StringBuilder(sss);
                sb.deleteCharAt(0);
                sb.deleteCharAt(0);

                Process p = Runtime.getRuntime().exec("rm -r  " + sb.toString());

                backAndDeletionRecoveryCB();
fillFilesCB6();
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please, choose a folder to delete");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (f.getText().equals("") == false) {
            try {
                StringBuilder sb = new StringBuilder(sss);
                sb.deleteCharAt(0);
                sb.deleteCharAt(0);
                String fd;
                if (cb2.getSelectedItem().equals("file")) {
                    fd = "touch  ";
                } else {
                    fd = "mkdir";
                }
                Process p = Runtime.getRuntime().exec(fd + sb.toString() + "/" + f.getText());
                exeSssContent();
fillFilesCB6();
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please, type a file/folder name");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String ugo;
        String per;
        if (cb6.getSelectedItem() != null) {
            if (cb3.getSelectedItem().equals("read")) {
                per = "r";
            } else if (cb3.getSelectedItem().equals("write")) {
                per = "w";
            } else {
                per = "x";
            }

           StringBuilder sb = new StringBuilder(sss);
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
            if (cb4.getSelectedItem().equals("owner")) {
                ugo = "u";
            } else if (cb4.getSelectedItem().equals("group")) {
                ugo = "g";
            } else {
                ugo = "o";
            }

            try {

                Process p = Runtime.getRuntime().exec("chmod " + ugo + "+" + per + "  " + sb+"/"+cb6.getSelectedItem());
                javax.swing.JOptionPane.showMessageDialog(null, "successfully added!");
           permissions();
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "please, select a file to set permission");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String ugo;
        String per;
        if (cb6.getSelectedItem() != null) {
            if (cb3.getSelectedItem().equals("read")) {
                per = "r";
            } else if (cb3.getSelectedItem().equals("write")) {
                per = "w";
            } else {
                per = "x";
            }

           StringBuilder sb = new StringBuilder(sss);
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
            if (cb4.getSelectedItem().equals("owner")) {
                ugo = "u";
            } else if (cb4.getSelectedItem().equals("group")) {
                ugo = "g";
            } else {
                ugo = "o";
            }

            try {
                Process p = Runtime.getRuntime().exec("chmod " + ugo + "-" + per + "  " + sb+"/"+cb6.getSelectedItem());
                javax.swing.JOptionPane.showMessageDialog(null, "successfully removed!");
               permissions();
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "please, select a file to remove permission");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (cb.getSelectedItem() != null) {
            StringBuilder sb = new StringBuilder(sss);
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
            StringBuilder sb1 = new StringBuilder(sss1);
            sb1.deleteCharAt(0);
            sb1.deleteCharAt(0);
            try {
                
                Process p = Runtime.getRuntime().exec("ln -s  " + sb + "/" + cb.getSelectedItem() + " " + sb1 + "/");

            } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "something went wrong");
             }
        } else
            javax.swing.JOptionPane.showMessageDialog(null, "choose file/folder to create symbolic link for");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        backAndDeletionRecoveryCB5();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        if (cb5.getSelectedItem() != null) {
            try {

                sss1 += "/" + ((String) cb5.getSelectedItem());
                Process p = Runtime.getRuntime().exec(sss1);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = null;
                ArrayList al = new ArrayList();
                while ((s = br.readLine()) != null) {
                    if(s.contains("/")==false)
                    al.add(s);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                dcbm.addAll(al);
                cb5.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(OSprojectFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Please, choose a folder to get in");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
permissions();    
         
        
    }//GEN-LAST:event_cb6ActionPerformed

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
            java.util.logging.Logger.getLogger(OSprojectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OSprojectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OSprojectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OSprojectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OSprojectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JTextField f;
    private javax.swing.JTextField flfl;
    private javax.swing.JTextField flfl1;
    private javax.swing.JTextField flfl2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
