package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.DFA;

public class FormScreen extends javax.swing.JFrame {

    private DFA dfa;
    private int statesRemaining;
    private List<String> states;
    private TransitionsScreen screen;

    public FormScreen() {
        initComponents();
        dfa = new DFA();
        states = new ArrayList<>();
        jP2.setVisible(false);
        jP3.setVisible(false);
        jP4.setVisible(false);
        doneBtn.setVisible(false);
        
    }

    public void setAlphabetChoice(List<String> alphabet) {
        dfa.setAlphabet(alphabet);
    }

    private void addOptionsToJComboBox(String value) {
        InitialStateCB.addItem(value.toUpperCase());
        finalStatesCb.addItem(value.toUpperCase());
    }

    private boolean checkRepeatedState(String value) {
        if (!states.isEmpty()) {
            for (int i = 0; i < states.size(); i++) {
                if (value.equalsIgnoreCase(states.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkRepeatedFinalState(String value) {
        if (!dfa.getFinalStates().isEmpty()) {
            for (int i = 0; i < dfa.getFinalStates().size(); i++) {
                if (value.equalsIgnoreCase(dfa.getFinalStates().get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jP1 = new javax.swing.JPanel();
        numberOfStatesTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        setNumberOfStatesBtn = new javax.swing.JButton();
        jP3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setInitialStateBtn = new javax.swing.JButton();
        InitialStateCB = new javax.swing.JComboBox<>();
        jP2 = new javax.swing.JPanel();
        StatesTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addStatesBtn = new javax.swing.JButton();
        numberOfStatesRemainingLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jP4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addFinalStatesBtn = new javax.swing.JButton();
        finalStatesCb = new javax.swing.JComboBox<>();
        doneBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deterministic Finite Automaton");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));

        numberOfStatesTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numberOfStatesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NumberOfStatesLbl.png"))); // NOI18N

        setNumberOfStatesBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        setNumberOfStatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OkBtn.png"))); // NOI18N
        setNumberOfStatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNumberOfStatesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jP1Layout.createSequentialGroup()
                        .addComponent(numberOfStatesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(setNumberOfStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberOfStatesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setNumberOfStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InitialStateLbl.png"))); // NOI18N

        setInitialStateBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        setInitialStateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OkBtn.png"))); // NOI18N
        setInitialStateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setInitialStateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addGroup(jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(InitialStateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(setInitialStateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setInitialStateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InitialStateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        StatesTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StatesTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatesTF.setToolTipText("Space bar ignored here");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StatesLbl.png"))); // NOI18N

        addStatesBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addStatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddBtn.png"))); // NOI18N
        addStatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStatesBtnActionPerformed(evt);
            }
        });

        numberOfStatesRemainingLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel3.setText("Only the first character will be taken");

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(210, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2Layout.createSequentialGroup()
                        .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberOfStatesRemainingLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jP2Layout.createSequentialGroup()
                                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jP2Layout.createSequentialGroup()
                                        .addComponent(StatesTF)
                                        .addGap(20, 20, 20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatesTF))
                    .addGroup(jP2Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(addStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberOfStatesRemainingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FinalStatesLbl.png"))); // NOI18N

        addFinalStatesBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addFinalStatesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddBtn.png"))); // NOI18N
        addFinalStatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFinalStatesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP4Layout = new javax.swing.GroupLayout(jP4);
        jP4.setLayout(jP4Layout);
        jP4Layout.setHorizontalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(finalStatesCb, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFinalStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jP4Layout.setVerticalGroup(
            jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFinalStatesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalStatesCb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        doneBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        doneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DoneBtn.png"))); // NOI18N
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setNumberOfStatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNumberOfStatesBtnActionPerformed
        try{
        int numberOfStates = Integer.parseInt(numberOfStatesTF.getText().trim());
        dfa.setNumberOfStates(numberOfStates);
        statesRemaining = dfa.getNumberOfStates();
        numberOfStatesRemainingLbl.setText(statesRemaining + " remaining");
        numberOfStatesTF.setEnabled(false);
        setNumberOfStatesBtn.setEnabled(false);
        jP2.setVisible(true);}
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Just numbers here.", "ERROR", JOptionPane.ERROR_MESSAGE);
            numberOfStatesTF.setText("");
        }
    }//GEN-LAST:event_setNumberOfStatesBtnActionPerformed

    private void addStatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStatesBtnActionPerformed
        try{
            String state = StatesTF.getText().trim().charAt(0) + "";
        if (!state.equals("") && !checkRepeatedState(state)) {
            states.add(state.toUpperCase());
            addOptionsToJComboBox(state);
            StatesTF.setText("");
            statesRemaining--;
            numberOfStatesRemainingLbl.setText(statesRemaining + " remaining");
            if (statesRemaining == 0) {
                StatesTF.setEnabled(false);
                addStatesBtn.setEnabled(false);
                jP3.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Repeated state", "ERROR", JOptionPane.ERROR_MESSAGE);
            StatesTF.setText("");
        }
        }catch(StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Empty field.", "ERROR", JOptionPane.ERROR_MESSAGE);
            StatesTF.setText("");
        }

    }//GEN-LAST:event_addStatesBtnActionPerformed

    private void setInitialStateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setInitialStateBtnActionPerformed
        dfa.setInitialState(InitialStateCB.getSelectedItem().toString().charAt(0));
        InitialStateCB.setEnabled(false);
        setInitialStateBtn.setEnabled(false);
        jP4.setVisible(true);
    }//GEN-LAST:event_setInitialStateBtnActionPerformed

    private void addFinalStatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFinalStatesBtnActionPerformed
        String finalStateSelected = finalStatesCb.getSelectedItem().toString();
        if(!checkRepeatedFinalState(finalStateSelected)){
            dfa.addFinalState(finalStateSelected);
            doneBtn.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Repeated final state.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addFinalStatesBtnActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        screen = new TransitionsScreen();
        screen.setDFA(dfa);
        screen.setOptionsToJComboBox(states);
        this.dispose();
        screen.setVisible(true);   
    }//GEN-LAST:event_doneBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> InitialStateCB;
    private javax.swing.JTextField StatesTF;
    private javax.swing.JButton addFinalStatesBtn;
    private javax.swing.JButton addStatesBtn;
    private javax.swing.JButton doneBtn;
    private javax.swing.JComboBox<String> finalStatesCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jP4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numberOfStatesRemainingLbl;
    private javax.swing.JTextField numberOfStatesTF;
    private javax.swing.JButton setInitialStateBtn;
    private javax.swing.JButton setNumberOfStatesBtn;
    // End of variables declaration//GEN-END:variables
}
