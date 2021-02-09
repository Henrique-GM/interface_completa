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
public class JanelaRelatorioDeProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaRelatorioDeProdutos
     */
    public JanelaRelatorioDeProdutos() {
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
        NomeRelatorioDeProdutos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IDRelatorioDeProdutos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DataValidadeRelatorioDeProdutos = new javax.swing.JTextField();
        BotaoSalvarRelatorioDeProdutos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("RELATORIO DE PRODUTOS");

        jLabel2.setText("Nome");

        jLabel3.setText("ID");

        jLabel4.setText("Data de validade");

        DataValidadeRelatorioDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataValidadeRelatorioDeProdutosActionPerformed(evt);
            }
        });

        BotaoSalvarRelatorioDeProdutos.setText("Salvar");
        BotaoSalvarRelatorioDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarRelatorioDeProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(NomeRelatorioDeProdutos)
                        .addComponent(jLabel3)
                        .addComponent(IDRelatorioDeProdutos)
                        .addComponent(jLabel4)
                        .addComponent(DataValidadeRelatorioDeProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addComponent(BotaoSalvarRelatorioDeProdutos))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeRelatorioDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDRelatorioDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataValidadeRelatorioDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarRelatorioDeProdutos)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataValidadeRelatorioDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataValidadeRelatorioDeProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataValidadeRelatorioDeProdutosActionPerformed

    private void BotaoSalvarRelatorioDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarRelatorioDeProdutosActionPerformed
        
        Cliente Relatprodutos = new Cliente();
        
        Relatprodutos.setNomeRelatoProdutos(NomeRelatorioDeProdutos.getText());
        Relatprodutos.setIDRelatoProdutos(IDRelatorioDeProdutos.getText());
        Relatprodutos.setDataValidadeRelatoProdutos(DataValidadeRelatorioDeProdutos.getText());
        
        JOptionPane.showMessageDialog(null, Relatprodutos.salvarRelatorioDeProdutos());
    }//GEN-LAST:event_BotaoSalvarRelatorioDeProdutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarRelatorioDeProdutos;
    private javax.swing.JTextField DataValidadeRelatorioDeProdutos;
    private javax.swing.JTextField IDRelatorioDeProdutos;
    private javax.swing.JTextField NomeRelatorioDeProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
