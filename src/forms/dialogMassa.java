
package forms;

import abstratas.Listas;
import classes.ListaMassa;
import classes.Massa;
import classes.NodoMassa;
import java.awt.Color;
import javax.swing.JOptionPane;

public class dialogMassa extends javax.swing.JDialog {

    private ListaMassa lista = new ListaMassa(); //Tem que ter onde guardar
    
    private NodoMassa retorno = null;
    
    public dialogMassa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textMassa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buttonAdicionar = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        buttonListar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Massas");

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 105), 2), "Cadastro de Massas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Massa:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a35b2654e094b58257c3039c741d3f37 (2).jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textMassa, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area.setColumns(20);
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 105), 2));
        jScrollPane1.setViewportView(area);

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        buttonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonAdicionar.setText("Adicionar Massa");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAdicionarMouseExited(evt);
            }
        });
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPesquisarMouseExited(evt);
            }
        });
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        buttonModificar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonModificar.setText("Modificar Alguma Massa");
        buttonModificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonModificarMouseExited(evt);
            }
        });
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonRemover.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonRemover.setText("Remover");
        buttonRemover.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoverMouseExited(evt);
            }
        });
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        buttonListar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonListar.setText("Listar Todos os Tipos de Massa");
        buttonListar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListarMouseExited(evt);
            }
        });
        buttonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7eecca2c426d0eab242f41dbe9fdf240 (7).jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar)
                    .addComponent(buttonListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPesquisar)
                            .addComponent(buttonRemover))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonModificar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        if (textMassa.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "\t O campo de Massa é Obrigatório");
            textMassa.requestFocus();
            return;
        }

        Massa massa = new Massa(textMassa.getText());
        
        NodoMassa novo = new NodoMassa(massa);
        
        lista.incluirOrdenado(novo);
        Listas.getListaMassa().incluirOrdenado(novo);
        
        textMassa.setText("");
        
        textMassa.requestFocus();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed

        if (lista.estaVazia()){
            area.setText("\t Não há massas para serem listadas");
            return;
        }
        
        area.setText("Massa \n\n");
        
        NodoMassa percorre = lista.getPrimeiro();
        
        while (percorre != null){
            area.append(percorre.getInformacao().getMassa() + "\n");
            percorre = percorre.getProximo();
        }    
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed

        retorno = lista.procura(textMassa.getText().toUpperCase());
        
        if (retorno == null){ 
            area.setText("\t Massa não encontrada na lista");
            return;
        }
        
        textMassa.setText(retorno.getInformacao().getMassa());       
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        area.setText(lista.removerOrdenado(textMassa.getText().toUpperCase()) ? "\t Massa Removida! \t" : "\t Massa não encontrada na lista! \n");        
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed

        if (retorno == null){
            JOptionPane.showMessageDialog(null, "\t É necessário pesquisar por uma Massa antes de modifica-la!");
            return;
        }
        
        NodoMassa novo = new NodoMassa(new Massa(textMassa.getText()));
        
        
        lista.removerOrdenado(retorno.getInformacao().getMassa());
        
        lista.incluirOrdenado(novo);
        
        retorno = null;
        textMassa.setText("");    
    }//GEN-LAST:event_buttonModificarActionPerformed

    
    
    
    
    private void buttonAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseEntered
       
        buttonAdicionar.setBackground(new Color(235, 235, 235));
        buttonAdicionar.setForeground(new Color(205,112,84));                   
    }//GEN-LAST:event_buttonAdicionarMouseEntered

    private void buttonAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseExited
        
        buttonAdicionar.setBackground(new Color(255, 250, 250));
        buttonAdicionar.setForeground(Color.BLACK);                 
    }//GEN-LAST:event_buttonAdicionarMouseExited

    
    private void buttonListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseEntered
      
        buttonListar.setBackground(new Color(235, 235, 235));
        buttonListar.setForeground(new Color(205,112,84));           
    }//GEN-LAST:event_buttonListarMouseEntered

    private void buttonListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseExited
       
        buttonListar.setBackground(new Color(255, 250, 250));
        buttonListar.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonListarMouseExited

    
    private void buttonPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseEntered
        
        buttonPesquisar.setBackground(new Color(235, 235, 235));
        buttonPesquisar.setForeground(new Color(205,112,84));         
    }//GEN-LAST:event_buttonPesquisarMouseEntered

    private void buttonPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseExited
        
        buttonPesquisar.setBackground(new Color(255, 250, 250));
        buttonPesquisar.setForeground(Color.BLACK);          
    }//GEN-LAST:event_buttonPesquisarMouseExited

    
    private void buttonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseEntered
       
        buttonRemover.setBackground(new Color(235, 235, 235));
        buttonRemover.setForeground(new Color(205,112,84));             
    }//GEN-LAST:event_buttonRemoverMouseEntered

    private void buttonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseExited
       
        buttonRemover.setBackground(new Color(255, 250, 250));
        buttonRemover.setForeground(Color.BLACK);         
    }//GEN-LAST:event_buttonRemoverMouseExited

    
    private void buttonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseEntered
        
        buttonModificar.setBackground(new Color(235, 235, 235));
        buttonModificar.setForeground(new Color(205,112,84));          
    }//GEN-LAST:event_buttonModificarMouseEntered

    private void buttonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseExited
       
        buttonModificar.setBackground(new Color(255, 250, 250));
        buttonModificar.setForeground(Color.BLACK);              
    }//GEN-LAST:event_buttonModificarMouseExited

    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogMassa dialog = new dialogMassa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonListar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textMassa;
    // End of variables declaration//GEN-END:variables
}
