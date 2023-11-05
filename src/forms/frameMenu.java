
package forms;

public class frameMenu extends javax.swing.JFrame {

    public frameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMassa = new javax.swing.JMenuItem();
        itemPao = new javax.swing.JMenuItem();
        itemSonho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(250, 235, 215));

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 207, 161), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 207, 161), 2));

        jMenu1.setText("Arquivos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        itemMassa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemMassa.setText("Cadastro de Massas");
        itemMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMassaActionPerformed(evt);
            }
        });
        jMenu1.add(itemMassa);

        itemPao.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemPao.setText("Pão");
        itemPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPaoActionPerformed(evt);
            }
        });
        jMenu1.add(itemPao);

        itemSonho.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemSonho.setText("Sonho");
        itemSonho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSonhoActionPerformed(evt);
            }
        });
        jMenu1.add(itemSonho);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMassaActionPerformed
       
        new dialogMassa(this, true).setVisible(true);
    }//GEN-LAST:event_itemMassaActionPerformed

    private void itemPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPaoActionPerformed
       
        new dialogPao(this, true).setVisible(true);
    }//GEN-LAST:event_itemPaoActionPerformed

    private void itemSonhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSonhoActionPerformed
       
       new dialogSonho(this, true).setVisible(true);
    }//GEN-LAST:event_itemSonhoActionPerformed


    
    
    
    
    
    
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMassa;
    private javax.swing.JMenuItem itemPao;
    private javax.swing.JMenuItem itemSonho;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
