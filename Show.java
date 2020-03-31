
public class Show extends javax.swing.JFrame {
         //Declare variables...
         //only can store the variables of int.
        int[] numbers = new int[4];
    public Show() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jtextanimalsguess = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblanimals = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblnumber = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblnumberofcorrectguess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Press");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Animals");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("Guess that animal games");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Please enter a number of animals in the textfield");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Number of guess:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("(1cat, 2lion, 3butterfly, 4dog, 5tiger, 6sheep, 7cattle, 8rabbit)");

        jlblnumber.setText("0");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Number of correct guess:");

        jlblnumberofcorrectguess.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtextanimalsguess, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(lblanimals))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblnumberofcorrectguess)
                                            .addComponent(jlblnumber)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtextanimalsguess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(lblanimals, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlblnumber))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlblnumberofcorrectguess))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Get number from textfield.
        numbers[1] = Integer.parseInt(jtextanimalsguess.getText());
        //Generate a random number between 1 and 8.
        numbers[2] = (int) Math.round(Math.random()*7+1);
        //Switch expression
        switch(numbers[2]){
            case 1:
                lblanimals.setText(String.valueOf("cat"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;
            case 2:
                lblanimals.setText(String.valueOf("lion"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                
                break;    
            case 3:
                lblanimals.setText(String.valueOf("butterfly"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;
            case 4:
                lblanimals.setText(String.valueOf("dog"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;
            case 5:
                lblanimals.setText(String.valueOf("tiger"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;
            case 6:
                lblanimals.setText(String.valueOf("sheep"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                break;
            case 7:
                lblanimals.setText(String.valueOf("cattle"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;    
            case 8:
                lblanimals.setText(String.valueOf("rabbit"));
                numbers[3] = numbers[3] + 1;
                jlblnumber.setText(String.valueOf(numbers[3]));
                if (numbers[1] == numbers[2]){
                    numbers[0] = numbers[0] + 1;
                    jlblnumberofcorrectguess.setText(String.valueOf(numbers[0]));
                }
                break;
            default:
                lblanimals.setText(String.valueOf("Don't make joke!"));
        }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlblnumber;
    private javax.swing.JLabel jlblnumberofcorrectguess;
    private javax.swing.JTextField jtextanimalsguess;
    private javax.swing.JLabel lblanimals;
    // End of variables declaration//GEN-END:variables
}
