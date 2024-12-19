/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dsa_project_nb;

import java.awt.Color;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author ttrun
 */
public class Guess_Word_Game extends javax.swing.JFrame {

    
    
    String[] words = {"data","structure","algorithms","array","linked list","queue","hash table","stack"};
    
    int index = -1;
    int score = 0;
    
    Border panel_border = BorderFactory.createMatteBorder( 2, 2, 2, 2, Color.black);
    
    
    public Guess_Word_Game() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        jPanel1.setBorder(panel_border);
        
        displayWord();
        
        jButton1_Next.setEnabled(false);
        
        sortWords();
    }
    
    private void returnToHomePage() {
    	this.setVisible(false);

        new HomePage().setVisible(true);
        }
    
    public void sortWords() {
    	for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
    }
    
    private String scrambleWord(String word) {
        char[] letters = word.toCharArray();
        Random random = new Random();

        for (int i = letters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap letters[i] and letters[j]
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
    
    public void displayWord(){
        if (index == -1) {
            jLabel2_Word.setText("Word");
            jTextField1_Guess.setText("--Guess--");
        }
        else {
        	String scrambledWord = scrambleWord(words[index]);
            jLabel2_Word.setText(scrambledWord);
        }
        
    }
    public void checkWord() {
        if (jTextField1_Guess.getText().equals(words[index])) {
            jLabel3_Result.setText("Correct");
            jLabel3_Result.setBackground(Color.green);
            score++; // Increment score for a correct answer
        } else {
            jLabel3_Result.setText("Incorrect");
            jLabel3_Result.setBackground(Color.red);
        }
        if (index == words.length - 1) {
            jButton1_Next.setEnabled(false);
            jButton2_Start.setEnabled(true);
            // Display final score
            jLabel3_Result.setText("Final Score: " + score + "/" + words.length);
        }
        jTextField1_Guess.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Close_ = new javax.swing.JLabel();
        jLabel2_Word = new javax.swing.JLabel();
        jTextField1_Guess = new javax.swing.JTextField();
        jButton1_Next = new javax.swing.JButton();
        jButton2_Start = new javax.swing.JButton();
        jLabel3_Result = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jLabel_Close_.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_Close_.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Close_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close_.setText("X");
        jLabel_Close_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Close_MouseClicked(evt);
            }
        });

        jLabel2_Word.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2_Word.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2_Word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_Word.setText("WORD");
        jLabel2_Word.setOpaque(true);

        jTextField1_Guess.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTextField1_Guess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_Guess.setText("Guess");

        jButton1_Next.setBackground(new java.awt.Color(255, 102, 0));
        jButton1_Next.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton1_Next.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_Next.setText("Next");
        jButton1_Next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_NextActionPerformed(evt);
            }
        });

        jButton2_Start.setBackground(new java.awt.Color(0, 204, 204));
        jButton2_Start.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton2_Start.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_Start.setText("Start");
        jButton2_Start.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_StartActionPerformed(evt);
            }
        });

        jLabel3_Result.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3_Result.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3_Result.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_Result.setText("Result");
        jLabel3_Result.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1_Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Close_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Close_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1_Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Close_MouseClicked
    	
    	returnToHomePage();
    	
    }//GEN-LAST:event_jLabel_Close_MouseClicked

    private void jButton2_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_StartActionPerformed

        jTextField1_Guess.setText("");
        index = 0;
        jButton1_Next.setEnabled(true);
        jButton2_Start.setEnabled(false);
        jLabel3_Result.setText("Result");
        jLabel3_Result.setBackground(Color.darkGray);
        
        displayWord();
        
        
    }//GEN-LAST:event_jButton2_StartActionPerformed

    private void jButton1_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_NextActionPerformed

        checkWord();
        if (index < words.length - 1){
             index++;
            displayWord();
        }     
        
    }//GEN-LAST:event_jButton1_NextActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guess_Word_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Next;
    private javax.swing.JButton jButton2_Start;
    private javax.swing.JLabel jLabel2_Word;
    private javax.swing.JLabel jLabel3_Result;
    private javax.swing.JLabel jLabel_Close_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1_Guess;
    // End of variables declaration//GEN-END:variables
}
