
package MdJahirRaihan_3_190;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MdJahirRaihan_3_190 extends javax.swing.JFrame {

    int genRanNum;
    int playerChance1 = 10;
    int playerChance2 = 10;
    int playerScore1 = 0, playerScore2 = 0;
    FileReader input = null;
    FileWriter output = null;
    StringBuilder sb;
    public MdJahirRaihan_3_190() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        genarateBtn = new javax.swing.JButton();
        showMessege = new javax.swing.JLabel();
        tryAgainButton = new javax.swing.JButton();
        EditPanel = new javax.swing.JTextField();
        playerID = new javax.swing.JTextField();
        playerSelectBtn1 = new javax.swing.JButton();
        playerSelectBtn2 = new javax.swing.JButton();
        leaderBoardBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        genarateBtn.setText("Genarate");
        genarateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genarateBtn(evt);
            }
        });

        showMessege.setBackground(new java.awt.Color(0, 204, 204));
        showMessege.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        showMessege.setForeground(new java.awt.Color(0, 51, 255));
        showMessege.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showMessege.setText("Enter Your ID !!");
        showMessege.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        showMessege.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                showMessegeComponentHidden(evt);
            }
        });

        tryAgainButton.setText("Try Again");
        tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainButtonActionPerformed(evt);
            }
        });

        EditPanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EditPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EditPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPanelActionPerformed(evt);
            }
        });

        playerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerIDActionPerformed(evt);
            }
        });

        playerSelectBtn1.setText("PLAYER 1");
        playerSelectBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerSelectBtn1ActionPerformed(evt);
            }
        });

        playerSelectBtn2.setText("PLAYER 2");
        playerSelectBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerSelectBtn2ActionPerformed(evt);
            }
        });

        leaderBoardBtn.setText("Leader Board");
        leaderBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderBoardBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID :");
        jLabel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Your Guess: ");
        jLabel2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showMessege, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(genarateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(playerSelectBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerSelectBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tryAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playerID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addComponent(leaderBoardBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showMessege, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genarateBtn)
                    .addComponent(tryAgainButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerSelectBtn1)
                    .addComponent(playerSelectBtn2)
                    .addComponent(leaderBoardBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genarateBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genarateBtn
        
        tryAgainButton.setEnabled(false);
        // --------------for genarating number
        
        
        
        showMessege.setText("Guess 0 to "+playerID.getText());
        Random ranNum = new Random();
        int x;
        x = Integer.parseInt(playerID.getText());
        genRanNum = ranNum.nextInt(x);
        playerSelectBtn1.setEnabled(true);
        playerSelectBtn2.setEnabled(true);
        
        
    }//GEN-LAST:event_genarateBtn

    private void showMessegeComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_showMessegeComponentHidden
        
         
    }//GEN-LAST:event_showMessegeComponentHidden

    private void tryAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainButtonActionPerformed
        
        playerSelectBtn1.setEnabled(true);
        playerSelectBtn2.setEnabled(true);
    }//GEN-LAST:event_tryAgainButtonActionPerformed

    private void EditPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPanelActionPerformed

    private void playerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerIDActionPerformed
        
    }//GEN-LAST:event_playerIDActionPerformed

     //------------- for player 1
    private void playerSelectBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerSelectBtn1ActionPerformed
        
            playerSelectBtn1.setEnabled(false);
            
            String num ;
            num = Integer.toString(genRanNum);
        
            if(EditPanel.getText().equals(num)){
                showMessege.setText("Player 1 guess is matched !");
                playerScore1++;
                playerSelectBtn2.setEnabled(false);
                tryAgainButton.setEnabled(true);
            }
            else{
                playerSelectBtn2.setEnabled(true);
                showMessege.setText("Number is not matched !");
                playerChance1--;
                if(playerChance2==0 && playerChance1==0){
                   playerSelectBtn1.setEnabled(false);
                   tryAgainButton.setEnabled(true);
                   String s ;
                   s = Integer.toString(genRanNum);//------------show ran num
                   showMessege.setText("The Number is: "+s);
                }
            }
            
        
       
        
    }//GEN-LAST:event_playerSelectBtn1ActionPerformed

    //------------- for player 2
    private void playerSelectBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerSelectBtn2ActionPerformed
        
        playerSelectBtn1.setEnabled(false);
        
            
            
            playerSelectBtn2.setEnabled(false);
            
            String num ;
            num = Integer.toString(genRanNum);
       
            if(EditPanel.getText().equals(num)){
                showMessege.setText("Player 2 guess is matched !");
                playerScore2 ++;
                
                
                playerSelectBtn1.setEnabled(false);
                tryAgainButton.setEnabled(true);
            }
            else{
                playerSelectBtn1.setEnabled(true);
                showMessege.setText("Number is not matched !");
                playerChance2--;
                if(playerChance2==0 && playerChance1==0){
                    playerSelectBtn1.setEnabled(false);
                    tryAgainButton.setEnabled(true);
                    String s ;
                    s = Integer.toString(genRanNum);//------------show ran num
                    showMessege.setText("The Number is: "+s);
                }
            }
        
    }//GEN-LAST:event_playerSelectBtn2ActionPerformed

    private void leaderBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderBoardBtnActionPerformed
        

       if(playerScore1 > playerScore2){
       //------------writing on txt file
          try {
              output =new FileWriter("file.txt");
              output.write("High score: Player 1 [ "+playerScore1+" ]");
              output.close();
          } catch (IOException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          int c;
          try {
              input = new FileReader("file.txt");
              sb = new StringBuilder();
              while ((c = input.read()) != -1) {
                sb.append((char) c);
              }
              showMessege.setText("");
              showMessege.setText(sb.toString());
              input.close();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          }
       }
       else if(playerScore2 > playerScore1){
       
           try {
              output =new FileWriter("file.txt");
              output.write("High score: Player 2 [ "+playerScore2+" ]");
              output.close();
          } catch (IOException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          }
           
           int c;
          try {
              input = new FileReader("file.txt");
              sb = new StringBuilder();
              while ((c = input.read()) != -1) {
                sb.append((char) c);
              }
              showMessege.setText("");
              showMessege.setText(sb.toString());
              input.close();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          }
       }
       else {
           int c;
           try {
              input = new FileReader("file.txt");
              sb = new StringBuilder();
              while ((c = input.read()) != -1) {
              sb.append((char) c);
              }
              showMessege.setText("");
              showMessege.setText(sb.toString());
              input.close();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(Level.SEVERE, null, ex);
          }
       }
           
       
       
       
           
    }//GEN-LAST:event_leaderBoardBtnActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced input Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdJahirRaihan_3_190.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MdJahirRaihan_3_190().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EditPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton genarateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton leaderBoardBtn;
    private javax.swing.JTextField playerID;
    private javax.swing.JButton playerSelectBtn1;
    private javax.swing.JButton playerSelectBtn2;
    private javax.swing.JLabel showMessege;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
