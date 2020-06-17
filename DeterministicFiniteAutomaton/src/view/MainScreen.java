package view;

import javax.swing.JOptionPane;
import model.DFA;
import java.util.List;

public class MainScreen extends javax.swing.JFrame {

    private WelcomeScreen welcomeScreen;
    private DFA dfa;

    public MainScreen() {
        initComponents();
        dfa = new DFA();
        closeResultBtn.setVisible(false);
    }

    public void setDFA(DFA dfa) {
        this.dfa = dfa;
        showTransitions();
    }

    private void showTransitions() {
        transitionsTA.setText(dfa.getTransitions());
        
        initialStateLbl.setText(dfa.getInitialState() + "");
        finalStateLbl.setText(showFinalStates());
    }
    
    private String showFinalStates(){
        List <String> finalStates = dfa.getFinalStates();
        
        String finalSt = "";
        for(int i = 0; i < finalStates.size(); i++){
            finalSt += finalStates.get(i) + ", ";
        }
        return finalSt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textTF = new javax.swing.JTextField();
        checkBtn = new javax.swing.JButton();
        resultLbl = new javax.swing.JLabel();
        closeResultBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transitionsTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        finalStateLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        initialStateLbl = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deterministic Finite Automaton");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Type something here:");

        textTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        checkBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        resultLbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        closeResultBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeResultBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        closeResultBtn.setText("X");
        closeResultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeResultBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTF, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBtn)
                            .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeResultBtn)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBtn)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeResultBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 11, -1, 301));

        transitionsTA.setColumns(20);
        transitionsTA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        transitionsTA.setLineWrap(true);
        transitionsTA.setRows(5);
        transitionsTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(transitionsTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, 300));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Final State(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 30));

        finalStateLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(finalStateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 710, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Initial State:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 30));

        initialStateLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(initialStateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        String text = textTF.getText().trim().toUpperCase();
        if (!text.equals("")) {
            if (dfa.checkAlphabet(text)) {
                resultLbl.setText("Recognized!");
                closeResultBtn.setVisible(true);
            } else {
                resultLbl.setText("Not recognized!");
                closeResultBtn.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Empty field.", "ERROR", JOptionPane.ERROR_MESSAGE);
            textTF.setText("");
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    private void closeResultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeResultBtnActionPerformed
        resultLbl.setText("");
        closeResultBtn.setVisible(false);
    }//GEN-LAST:event_closeResultBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton closeResultBtn;
    private javax.swing.JLabel finalStateLbl;
    private javax.swing.JLabel initialStateLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JTextField textTF;
    private javax.swing.JTextArea transitionsTA;
    // End of variables declaration//GEN-END:variables
}
