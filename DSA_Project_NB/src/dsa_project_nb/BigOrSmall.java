package dsa_project_nb;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ttrun
 */
public class BigOrSmall extends javax.swing.JFrame {

    private int playerMoney = 240;
     private int goal = 500;
    
    public BigOrSmall() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        resetGame();
    }
    
    private void returnToHomePage() {
    	this.setVisible(false);

        new HomePage().setVisible(true);
        }
    
    private void resetGame() {
        Random1.setText("-");
        Random2.setText("-");
        Random3.setText("-");
        tilte.setText("Can You Guess Big or Small?");
    }
    
    private void generateRandomNumbers() {
        Random random = new Random();
        int num1 = random.nextInt(6) + 1; // Random number between 1 and 6
        int num2 = random.nextInt(6) + 1;
        int num3 = random.nextInt(6) + 1;

        Random1.setText(String.valueOf(num1));
        Random2.setText(String.valueOf(num2));
        Random3.setText(String.valueOf(num3));

    }
    
    private void playGame(String guess) {
        if (playerMoney < 20) {
            tilte.setText("Not enough money to play!");
            return;
        }

        playerMoney -= 20; // Deduct cost of playing
        generateRandomNumbers();

        int sum = Integer.parseInt(Random1.getText()) +
                  Integer.parseInt(Random2.getText()) +
                  Integer.parseInt(Random3.getText());

        boolean isWin = (guess.equals("SMALL") && sum >= 3 && sum <= 10) ||
                        (guess.equals("BIG") && sum >= 11 && sum <= 18);

        if (isWin) {
            playerMoney += 40; // Win gives back the cost (20) + reward (20)
            tilte.setText("You Win! Sum: " + sum);
        } else {
            tilte.setText("You Lose! Sum: " + sum);
        }

        if (playerMoney >= goal) {
            handleWin();
        } else {
            updateMoneyDisplay(); // Update money display dynamically
        }
    }
    
    private void handleWin() {
        String message;
        String title;

        if (goal == 500) {
            message = "Congratulations! You reached 500 money!\nDo you want to quit or aim for 5000 money?";
            title = "Victory!";
        } else {
            message = "Amazing! You reached 5000 money!\nWould you like to quit or restart the game?";
            title = "Ultimate Victory!";
        }
        
        int option = JOptionPane.showOptionDialog(this, message, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"Quit", "Continue"}, "Quit");

        if (option == JOptionPane.YES_OPTION) {
            System.exit(0); // Quit the game
        } else {
            if (goal == 500) {
                goal = 5000; // Update goal to 5000
                tilte.setText("New Goal: Reach 5000 Money!");
            } else {
                playerMoney = 240; // Reset money and goal for a new game
                goal = 500;
                resetGame();
            }
        }
        updateMoneyDisplay();
    }
    
    private void updateMoneyDisplay() {
        Money.setText("Money: " + playerMoney + " / Goal: " + goal);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_Close_1 = new javax.swing.JLabel();
        tilte = new javax.swing.JTextField();
        Random1 = new javax.swing.JTextField();
        Random2 = new javax.swing.JTextField();
        Random3 = new javax.swing.JTextField();
        Small = new javax.swing.JButton();
        Big = new javax.swing.JButton();
        guide = new javax.swing.JButton();
        Money = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel_Close_1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_Close_1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Close_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close_1.setText("X");
        jLabel_Close_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Close_1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tilte.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tilte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tilte.setText("Can You Guess Big or Small ?");
        tilte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilteActionPerformed(evt);
            }
        });

        Random1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        Random1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Random1.setText("9");
        Random1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random1ActionPerformed(evt);
            }
        });

        Random2.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        Random2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Random2.setText("1");
        Random2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random2ActionPerformed(evt);
            }
        });

        Random3.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        Random3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Random3.setText("2");
        Random3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random3ActionPerformed(evt);
            }
        });

        Small.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Small.setText("SMALL(3-10)");
        Small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmallActionPerformed(evt);
            }
        });

        Big.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Big.setText("BIG(11-18)");
        Big.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigActionPerformed(evt);
            }
        });

        guide.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        guide.setText("Guide");
        guide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideActionPerformed(evt);
            }
        });

        Money.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Money.setText("Money");
        Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 0, 0));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Small, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tilte)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Random1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Random2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Random3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Big, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Money, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tilte, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guide)
                    .addComponent(Money))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Random1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(Random2)
                    .addComponent(Random3))
                .addGap(28, 28, 28)
                .addComponent(Small, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Big, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Random2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Random2ActionPerformed

    private void SmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmallActionPerformed
        // TODO add your handling code here:
        playGame("SMALL");
    }//GEN-LAST:event_SmallActionPerformed

    private void BigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigActionPerformed
        // TODO add your handling code here:
        playGame("BIG");
    }//GEN-LAST:event_BigActionPerformed

    private void tilteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tilteActionPerformed

    private void Random1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Random1ActionPerformed

    private void Random3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Random3ActionPerformed

    private void guideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideActionPerformed
        // TODO add your handling code here:
        String instructions = "Welcome to Big or Small!\n" +
                          "1. Click 'SMALL' if you think the sum of the numbers will be between 3 and 10.\n" +
                          "2. Click 'BIG' if you think the sum of the numbers will be between 11 and 18.\n" +
                          "3. You start with 240 money and must aim to reach 500 or 5000 money.\n" +
                          "4. Each round costs 20 money to play.";
    JOptionPane.showMessageDialog(this, instructions, "Game Instructions", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_guideActionPerformed

    private void MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyActionPerformed
        // TODO add your handling code here:
        
        String money = Money.getText(); 
    
    // Show a message with the current money
    JOptionPane.showMessageDialog(this, "Current money: " + playerMoney, "Current Money", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MoneyActionPerformed

    
    private void jLabel_Close_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Close_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Close_1MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here: 
        returnToHomePage();
    	
    }//GEN-LAST:event_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(BigOrSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BigOrSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BigOrSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BigOrSmall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BigOrSmall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Big;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton Money;
    private javax.swing.JTextField Random1;
    private javax.swing.JTextField Random2;
    private javax.swing.JTextField Random3;
    private javax.swing.JButton Small;
    private javax.swing.JButton guide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel_Close_1;
    private javax.swing.JTextField tilte;
    // End of variables declaration//GEN-END:variables
}
