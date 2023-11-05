
package forms;

import classes.ListaSonho;
import classes.NodoSonho;
import classes.Sonho;
import enums.Recheio;
import enums.Venda;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class dialogSonho extends javax.swing.JDialog {

    private ListaSonho lista = new ListaSonho();
    
    private NodoSonho retorno = null;
    
    private void loadComboRecheio(){
        
        DefaultComboBoxModel cbn = new DefaultComboBoxModel(Recheio.values());
        comboRecheio.setModel(cbn);
    }
    
    private void loadComboVenda(){
        
        DefaultComboBoxModel cbn = new DefaultComboBoxModel(Venda.values());
        comboVenda.setModel(cbn);
    }
    
    public dialogSonho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboRecheio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboVenda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buttonAdicionar = new javax.swing.JButton();
        buttonListar = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Sonhos");
        setBackground(new java.awt.Color(255, 204, 177));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 105), 2), "Cadastro de Sonhos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Recheio:");

        comboRecheio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Vendido por:");

        comboVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Valor:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4267648-cute-female-dog-chef-holding-a-cake-bakery-chef-concept-cartoon-character-e-mascote-logo-vetor (2).jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(comboRecheio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNome)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(comboRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84), 2), "Ações ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        buttonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonAdicionar.setText("Adicionar Sonho");
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

        buttonListar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonListar.setText("Listar Todos os Tipos de Sonho");
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

        buttonModificar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonModificar.setText("Modificar Algum Sonho");
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cute-Food-Drawing-Image (2).jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 112, 84)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(buttonPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap())))
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
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.loadComboRecheio();
        this.loadComboVenda();
    }//GEN-LAST:event_formWindowOpened

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

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

        Sonho sonho = new Sonho(textNome.getText(), (Recheio)comboRecheio.getSelectedItem(), (Venda)comboVenda.getSelectedItem(), valor);

        NodoSonho novo = new NodoSonho(sonho);

        lista.incluirOrdenado(novo);

        textNome.setText("");
        comboRecheio.setSelectedIndex(0);
        comboVenda.setSelectedIndex(0);
        textValor.setText("");

        textNome.requestFocus();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed

        if (lista.estaVazia()){
            area.setText("\t Não há sonhos para serem listadas");
            return;
        }

        area.setText("Nome \t\t Recheio \t\t Vendido por \t\t Valor \n\n");

        NodoSonho percorre = lista.getPrimeiro();

        while (percorre != null){
            area.append(percorre.getInformacao().getNome() + "\t\t" +
                        percorre.getInformacao().getRecheio() + "\t\t" +
                        percorre.getInformacao().getVenda() + "\t\t" +
                        percorre.getInformacao().getValor() + "\n\n");
            percorre = percorre.getProximo();
        }
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        area.setText(lista.removerOrdenado(textNome.getText().toUpperCase()) ? "\t Sonho Removido! \t" : "\t Sonho não encontrado na lista! \n");
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed

        retorno = lista.procura(textNome.getText().toUpperCase());

        if (retorno == null){ 
            area.setText("\t Sonho não encontrada na lista");
            return;
        }

        textNome.setText(retorno.getInformacao().getNome());
        comboRecheio.setSelectedItem(retorno.getInformacao().getRecheio());
        comboVenda.setSelectedItem(retorno.getInformacao().getVenda());
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed

        if (retorno == null){
            JOptionPane.showMessageDialog(null, "\t É necessário pesquisar por um Sonho antes de modifica-lo!");
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

        NodoSonho novo = new NodoSonho(new Sonho(textNome.getText(), (Recheio)comboRecheio.getSelectedItem(), (Venda)comboVenda.getSelectedItem(), valor));

        lista.removerOrdenado(retorno.getInformacao().getNome());

        lista.incluirOrdenado(novo);

        retorno = null;
        
        textNome.setText("");
        comboRecheio.setSelectedIndex(0);
        comboVenda.setSelectedIndex(0);
        textValor.setText("");
    }//GEN-LAST:event_buttonModificarActionPerformed

    
    private void buttonAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseEntered
        
        buttonAdicionar.setBackground(new Color(235, 235, 235));
        buttonAdicionar.setForeground(new Color(205,112,84));          
    }//GEN-LAST:event_buttonAdicionarMouseEntered

    private void buttonAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseExited
        
        buttonAdicionar.setBackground(new Color(255, 250, 250));
        buttonAdicionar.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonAdicionarMouseExited

    
    private void buttonPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseEntered
        
        buttonPesquisar.setBackground(new Color(235, 235, 235));
        buttonPesquisar.setForeground(new Color(205,112,84));             
    }//GEN-LAST:event_buttonPesquisarMouseEntered

    private void buttonPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseExited
        
        buttonPesquisar.setBackground(new Color(255, 250, 250));
        buttonPesquisar.setForeground(Color.BLACK);            
    }//GEN-LAST:event_buttonPesquisarMouseExited

    
    private void buttonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseEntered

        buttonModificar.setBackground(new Color(235, 235, 235));
        buttonModificar.setForeground(new Color(205,112,84));           
    }//GEN-LAST:event_buttonModificarMouseEntered

    private void buttonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModificarMouseExited

        buttonModificar.setBackground(new Color(255, 250, 250));
        buttonModificar.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonModificarMouseExited

    
    private void buttonListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseEntered

        buttonListar.setBackground(new Color(235, 235, 235));
        buttonListar.setForeground(new Color(205,112,84));          
    }//GEN-LAST:event_buttonListarMouseEntered

    private void buttonListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseExited

        buttonListar.setBackground(new Color(255, 250, 250));
        buttonListar.setForeground(Color.BLACK);             
    }//GEN-LAST:event_buttonListarMouseExited

    
    private void buttonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseEntered

        buttonRemover.setBackground(new Color(235, 235, 235));
        buttonRemover.setForeground(new Color(205,112,84));          
    }//GEN-LAST:event_buttonRemoverMouseEntered

    private void buttonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseExited

        buttonRemover.setBackground(new Color(255, 250, 250));
        buttonRemover.setForeground(Color.BLACK);                                                           
    }//GEN-LAST:event_buttonRemoverMouseExited

    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogSonho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogSonho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogSonho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogSonho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogSonho dialog = new dialogSonho(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboRecheio;
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
