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
public class JanelaRelatorioDeFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaRelatorioDeFornecedores
     */
    public JanelaRelatorioDeFornecedores() {
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
        NomeRelatorioDeFornecedores = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomeEmpresaRelatorioDeFornecedores = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CNPJRelatorioDeFornecedores = new javax.swing.JTextField();
        BotaoSalvarRelatorioDeFornecedores = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("RELATORIO DE FORNECEDORES");

        jLabel2.setText("Nome");

        jLabel3.setText("Nome empresa");

        jLabel4.setText("CNPJ");

        BotaoSalvarRelatorioDeFornecedores.setText("Salvar");
        BotaoSalvarRelatorioDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarRelatorioDeFornecedoresActionPerformed(evt);
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
                        .addComponent(NomeRelatorioDeFornecedores)
                        .addComponent(jLabel3)
                        .addComponent(NomeEmpresaRelatorioDeFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(CNPJRelatorioDeFornecedores))
                    .addComponent(BotaoSalvarRelatorioDeFornecedores))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeRelatorioDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEmpresaRelatorioDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CNPJRelatorioDeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarRelatorioDeFornecedores)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarRelatorioDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarRelatorioDeFornecedoresActionPerformed
        
        Cliente Relatfornecedores = new Cliente();
        
        Relatfornecedores.setNomeRelatoFornecedores(NomeRelatorioDeFornecedores.getText());
        Relatfornecedores.setNomeEmpresaRelatoFornecedor(NomeEmpresaRelatorioDeFornecedores.getText());
        Relatfornecedores.setCNPJRelatoFornecedores(CNPJRelatorioDeFornecedores.getText());
        
        JOptionPane.showMessageDialog(null, Relatfornecedores.salvarRelatorioDeFornecedores());
    }//GEN-LAST:event_BotaoSalvarRelatorioDeFornecedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarRelatorioDeFornecedores;
    private javax.swing.JTextField CNPJRelatorioDeFornecedores;
    private javax.swing.JTextField NomeEmpresaRelatorioDeFornecedores;
    private javax.swing.JTextField NomeRelatorioDeFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}