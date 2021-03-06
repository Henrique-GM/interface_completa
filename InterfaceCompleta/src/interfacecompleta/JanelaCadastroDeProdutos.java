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
public class JanelaCadastroDeProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaCadastroDeProdutos
     */
    public JanelaCadastroDeProdutos() {
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
        NomeCadastroDeProdutos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CodigoCadastroDeProdutos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustoCadastroDeProdutos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BotaoSalvarCadastroProdutos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Nome");

        NomeCadastroDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCadastroDeProdutosActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Custo");

        CustoCadastroDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustoCadastroDeProdutosActionPerformed(evt);
            }
        });

        jLabel4.setText("CADASTRO DE PRODUTOS");

        BotaoSalvarCadastroProdutos.setText("Salvar");
        BotaoSalvarCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarCadastroProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(BotaoSalvarCadastroProdutos)
                    .addComponent(NomeCadastroDeProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(CodigoCadastroDeProdutos)
                    .addComponent(CustoCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodigoCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustoCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarCadastroProdutos)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeCadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCadastroDeProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCadastroDeProdutosActionPerformed

    private void CustoCadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustoCadastroDeProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustoCadastroDeProdutosActionPerformed

    private void BotaoSalvarCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarCadastroProdutosActionPerformed
        
        Cliente Cadprodutos = new Cliente();
        
        Cadprodutos.setNomeCadasProduto(NomeCadastroDeProdutos.getText());
        Cadprodutos.setCodigoCadasProdutos(CodigoCadastroDeProdutos.getText());
        Cadprodutos.setCustoCadasProdutos(CustoCadastroDeProdutos.getText());
        
        JOptionPane.showMessageDialog(null, Cadprodutos.salvarCadastroProdutos());
    }//GEN-LAST:event_BotaoSalvarCadastroProdutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarCadastroProdutos;
    private javax.swing.JTextField CodigoCadastroDeProdutos;
    private javax.swing.JTextField CustoCadastroDeProdutos;
    private javax.swing.JTextField NomeCadastroDeProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
