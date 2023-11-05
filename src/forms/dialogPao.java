
package forms;

import abstratas.Listas;
import classes.ListaPao;
import classes.NodoMassa;
import classes.NodoPao;
import classes.Massa;
import classes.Pao;
import enums.Venda;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class dialogPao extends javax.swing.JDialog {

    private ListaPao lista = new ListaPao();
    
    private NodoPao retorno = null;
    
    private void loadComboMassa(){
        //Retirar os itens anteriores
       comboMassa.removeAllItems();
        
        for(NodoMassa nodo = Listas.getListaMassa().getPrimeiro(); nodo != null; nodo = nodo.getProximo()){
            comboMassa.addItem(nodo.getInformacao());
        } 
    }
    
    private void loadComboVenda(){
        
        DefaultComboBoxModel cbn = new DefaultComboBoxModel(Venda.values());
        comboVenda.setModel(cbn);
    }
    
    public dialogPao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboMassa = new javax.swing.JComboBox();
        comboVenda = new javax.swing.JComboBox<>();
        textValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buttonAdicionarPao = new javax.swing.JButton();
        buttonListar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pães");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 105), 2), "Cadastro de Pães", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Massa:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Venda por:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Valor:");

        comboMassa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMassaActionPerformed(evt);
            }
        });

        comboVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download (2).jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome)
                            .addComponent(comboMassa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area.setColumns(20);
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 105), 2));
        jScrollPane1.setViewportView(area);

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        buttonAdicionarPao.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonAdicionarPao.setText("Adicionar Pão");
        buttonAdicionarPao.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 153))));
        buttonAdicionarPao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAdicionarPaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAdicionarPaoMouseExited(evt);
            }
        });
        buttonAdicionarPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPaoActionPerformed(evt);
            }
        });

        buttonListar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonListar.setText("Listar Todos os Tipos de Pães");
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
        buttonModificar.setText("Modificar Algum Pão");
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a35b2654e094b58257c3039c741d3f37 (3).jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdicionarPao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAdicionarPao)
                            .addComponent(buttonListar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPesquisar)
                            .addComponent(buttonRemover))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.loadComboMassa();
        this.loadComboVenda();
    }//GEN-LAST:event_formWindowOpened

    private void buttonAdicionarPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPaoActionPerformed

        if (textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "\t O campo de Nome é Obrigatório");
            textNome.requestFocus();
            return;
        }
        
        double valor = 0;
        try {
            valor = Double.parseDouble(textValor.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O campo de valor é obrigatório");
            textValor.requestFocus();
            return;
        }        
        
        Pao pao = new Pao(textNome.getText(), (Massa)comboMassa.getSelectedItem(), (Venda)comboVenda.getSelectedItem(), valor);
        
        NodoPao novo = new NodoPao(pao);
        
        lista.incluirOrdenado(novo);
        
        textNome.setText("");
        comboMassa.setSelectedIndex(0);
        comboVenda.setSelectedIndex(0);
        textValor.setText("");
        
        textNome.requestFocus();
    }//GEN-LAST:event_buttonAdicionarPaoActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed

        if (lista.estaVazia()){
            area.setText("\t Não há massas para serem listadas");
            return;
        }

        area.setText("Nome \t\t Massa \t\t Venda \t\t Valor \n\n");

        NodoPao percorre = lista.getPrimeiro();

        while (percorre != null){
            area.append(percorre.getInformacao().getNome() + "\t\t" + 
                        percorre.getInformacao().getMassa() + "\t\t" +
                        percorre.getInformacao().getVenda() + "\t\t" + 
                        percorre.getInformacao().getValor() + "\n");
            percorre = percorre.getProximo();
        }
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        area.setText(lista.removerOrdenado(textNome.getText().toUpperCase()) ? "\t Pão Removido! \t" : "\t Pão não encontrado na lista! \n");
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed

        retorno = lista.procura(textNome.getText().toUpperCase());

        if (retorno == null){ //Quer dizer que não encontrou
            area.setText("\t Pão não encontrada na lista");
            return;
        }

        textNome.setText(retorno.getInformacao().getNome());
        comboMassa.setSelectedItem(retorno.getInformacao().getMassa());
        comboVenda.setSelectedItem(retorno.getInformacao().getVenda());
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed

        if (retorno == null){
            JOptionPane.showMessageDialog(null, "\t É necessário pesquisar por um Pão antes de modifica-lo!");
            return;
        }
        
        double valor = 0;
        try {
            valor = Double.parseDouble(textValor.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O campo de valor é obrigatório");
            textValor.requestFocus();
            return;
        } 
        
        NodoPao novo = new NodoPao(new Pao(textNome.getText(), (Massa)comboMassa.getSelectedItem(), (Venda)comboVenda.getSelectedItem(), valor));

        lista.removerOrdenado(retorno.getInformacao().getNome());

        lista.incluirOrdenado(novo);

        retorno = null;
        
        textNome.setText("");
        comboMassa.setSelectedIndex(0);
        comboVenda.setSelectedIndex(0);
        textValor.setText("");        
    }//GEN-LAST:event_buttonModificarActionPerformed

    
    
    private void buttonAdicionarPaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarPaoMouseEntered
        
        buttonAdicionarPao.setBackground(new Color(235, 235, 235));
        buttonAdicionarPao.setForeground(new Color(205,112,84));           
    }//GEN-LAST:event_buttonAdicionarPaoMouseEntered

    private void buttonAdicionarPaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarPaoMouseExited
        
        buttonAdicionarPao.setBackground(new Color(255, 250, 250));
        buttonAdicionarPao.setForeground(Color.BLACK);            
    }//GEN-LAST:event_buttonAdicionarPaoMouseExited

    
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

    private void comboMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMassaActionPerformed
      
    }//GEN-LAST:event_comboMassaActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogPao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogPao dialog = new dialogPao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAdicionarPao;
    private javax.swing.JButton buttonListar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JComboBox comboMassa;
    private javax.swing.JComboBox<String> comboVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
