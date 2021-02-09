/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecompleta;

import javax.swing.JOptionPane;

/**
 *
 * @author Henrique Mendes
 */
public class JanelaCadastroDeFornecedores extends javax.swing.JInternalFrame {

    ListaClientes LISTA = new ListaClientes();
    
    /**
     * Creates new form JanelaCadastroDeFornecedores
     */
    public JanelaCadastroDeFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomeCadastroDeFornecedores = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CNPJCadastroDeFornecedores = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NumeroCadastroDeFornecedores = new javax.swing.JTextField();
        BotaoSalvarCadastroDeFornecedores = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("CADASTRO DE FORNECEDORES");

        jLabel2.setText("Nome");

        NomeCadastroDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCadastroDeFornecedoresActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ");

        jLabel4.setText("Número");

        BotaoSalvarCadastroDeFornecedores.setText("Salvar");
        BotaoSalvarCadastroDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarCadastroDeFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(NomeCadastroDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJCadastroDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NumeroCadastroDeFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoSalvarCadastroDeFornecedores, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCadastroDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CNPJCadastroDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroCadastroDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarCadastroDeFornecedores)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeCadastroDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCadastroDeFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCadastroDeFornecedoresActionPerformed

    private void BotaoSalvarCadastroDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarCadastroDeFornecedoresActionPerformed
           
        Cliente Cadfornecedores = new Cliente();
              
        Cadfornecedores.setNomeCadasFornecedor(NomeCadastroDeFornecedores.getText());
        Cadfornecedores.setCNPJCadasFornecedore(CNPJCadastroDeFornecedores.getText());
        Cadfornecedores.setNumeroCadasFornecedores(NumeroCadastroDeFornecedores.getText());
        
        JOptionPane.showMessageDialog(null,Cadfornecedores.salvarCadastroFornecedor());
        
    }//GEN-LAST:event_BotaoSalvarCadastroDeFornecedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarCadastroDeFornecedores;
    private javax.swing.JTextField CNPJCadastroDeFornecedores;
    private javax.swing.JTextField NomeCadastroDeFornecedores;
    private javax.swing.JTextField NumeroCadastroDeFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
