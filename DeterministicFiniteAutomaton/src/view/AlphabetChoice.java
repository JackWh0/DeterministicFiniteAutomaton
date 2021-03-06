package view;

import java.util.Arrays;
import java.util.List;

public class AlphabetChoice extends javax.swing.JFrame {

    private FormScreen screen;
    private List<String> alphabet;

    public AlphabetChoice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        binaryBtn = new javax.swing.JButton();
        numbersBtn = new javax.swing.JButton();
        lettersBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deterministic Finite Automaton");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ChooseAlphabetLbl.png"))); // NOI18N

        binaryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BinaryBtn.png"))); // NOI18N
        binaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryBtnActionPerformed(evt);
            }
        });

        numbersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NumbersBtn.png"))); // NOI18N
        numbersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersBtnActionPerformed(evt);
            }
        });

        lettersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LettersBtn.png"))); // NOI18N
        lettersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lettersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(numbersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lettersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(binaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numbersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lettersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(binaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeScreen() {
        screen = new FormScreen();
        screen.setAlphabetChoice(alphabet);
        this.dispose();
        screen.setVisible(true);
    }

    private void numbersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbersBtnActionPerformed
        alphabet = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        changeScreen();
    }//GEN-LAST:event_numbersBtnActionPerformed

    private void lettersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lettersBtnActionPerformed
        alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z");
        changeScreen();
    }//GEN-LAST:event_lettersBtnActionPerformed

    private void binaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryBtnActionPerformed
        alphabet = Arrays.asList("0", "1");
        changeScreen();
    }//GEN-LAST:event_binaryBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AlphabetChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlphabetChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlphabetChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlphabetChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlphabetChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binaryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lettersBtn;
    private javax.swing.JButton numbersBtn;
    // End of variables declaration//GEN-END:variables
}
