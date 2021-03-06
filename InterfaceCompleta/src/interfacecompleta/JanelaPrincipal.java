/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecompleta;

/**
 *
 * @author Henrique Mendes
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
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

        PainelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastroDeClientes = new javax.swing.JMenuItem();
        CadastroDeFornecedores = new javax.swing.JMenuItem();
        CadastroDeProdutos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RelatorioDeClientes = new javax.swing.JMenuItem();
        RelatorioDeFornecedores = new javax.swing.JMenuItem();
        RelatorioDeProdutos = new javax.swing.JMenuItem();
        Configuracao = new javax.swing.JMenu();
        Configuracoes = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        CadastroDeClientes.setText("Cadastro de clientes");
        CadastroDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDeClientesActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroDeClientes);

        CadastroDeFornecedores.setText("Cadastro de fornecedores");
        CadastroDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDeFornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroDeFornecedores);

        CadastroDeProdutos.setText("Cadastro de produtos");
        CadastroDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDeProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroDeProdutos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        RelatorioDeClientes.setText("Relatório de cliente");
        RelatorioDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioDeClientesActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioDeClientes);

        RelatorioDeFornecedores.setText("Relatório de fornecedores");
        RelatorioDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioDeFornecedoresActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioDeFornecedores);

        RelatorioDeProdutos.setText("Relatório de produtos");
        RelatorioDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioDeProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioDeProdutos);

        jMenuBar1.add(jMenu2);

        Configuracao.setText("Opções");

        Configuracoes.setText("Configurações");
        Configuracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracoesActionPerformed(evt);
            }
        });
        Configuracao.add(Configuracoes);

        Ajuda.setText("Ajuda");
        Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaActionPerformed(evt);
            }
        });
        Configuracao.add(Ajuda);

        jMenuBar1.add(Configuracao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDeClientesActionPerformed
        
        JanelaInterna objTelaCadastroCliente = new JanelaInterna();
        PainelPrincipal.add(objTelaCadastroCliente);
        objTelaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_CadastroDeClientesActionPerformed

    private void CadastroDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDeFornecedoresActionPerformed
        
        JanelaCadastroDeFornecedores objCadastroDeFornecedores = new JanelaCadastroDeFornecedores();
        PainelPrincipal.add(objCadastroDeFornecedores);
        objCadastroDeFornecedores.setVisible(true);   
    }//GEN-LAST:event_CadastroDeFornecedoresActionPerformed

    private void RelatorioDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioDeProdutosActionPerformed
        
        JanelaRelatorioDeProdutos objRelatorioDeProdutos = new JanelaRelatorioDeProdutos();
        PainelPrincipal.add(objRelatorioDeProdutos);
        objRelatorioDeProdutos.setVisible(true);
    }//GEN-LAST:event_RelatorioDeProdutosActionPerformed

    private void CadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDeProdutosActionPerformed
        
        JanelaCadastroDeProdutos objCadastroDeProdutos = new JanelaCadastroDeProdutos();
        PainelPrincipal.add(objCadastroDeProdutos);
        objCadastroDeProdutos.setVisible(true);
    }//GEN-LAST:event_CadastroDeProdutosActionPerformed

    private void RelatorioDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioDeClientesActionPerformed
        
        JanelaRelatorioDeClientes objRelatorioDeClientes = new JanelaRelatorioDeClientes();
        PainelPrincipal.add(objRelatorioDeClientes);
        objRelatorioDeClientes.setVisible(true);
    }//GEN-LAST:event_RelatorioDeClientesActionPerformed

    private void RelatorioDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioDeFornecedoresActionPerformed
        
        JanelaRelatorioDeFornecedores objRelatorioDeFornecedores = new JanelaRelatorioDeFornecedores();
        PainelPrincipal.add(objRelatorioDeFornecedores);
        objRelatorioDeFornecedores.setVisible(true); 
    }//GEN-LAST:event_RelatorioDeFornecedoresActionPerformed

    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
        
        JanelaAjuda objAjuda = new JanelaAjuda();
        PainelPrincipal.add(objAjuda);
        objAjuda.setVisible(true); 
    }//GEN-LAST:event_AjudaActionPerformed

    private void ConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracoesActionPerformed
        
        JanelaConfiguracoes objConfiguracoes = new JanelaConfiguracoes();
        PainelPrincipal.add(objConfiguracoes);
        objConfiguracoes.setVisible(true);
    }//GEN-LAST:event_ConfiguracoesActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JMenuItem CadastroDeClientes;
    private javax.swing.JMenuItem CadastroDeFornecedores;
    private javax.swing.JMenuItem CadastroDeProdutos;
    private javax.swing.JMenu Configuracao;
    private javax.swing.JMenuItem Configuracoes;
    private javax.swing.JDesktopPane PainelPrincipal;
    private javax.swing.JMenuItem RelatorioDeClientes;
    private javax.swing.JMenuItem RelatorioDeFornecedores;
    private javax.swing.JMenuItem RelatorioDeProdutos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
