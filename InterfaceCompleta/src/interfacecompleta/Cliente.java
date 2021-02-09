/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecompleta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henrique Mendes
 */
public class Cliente {
    
    private String nomeInterno;
    private String ruaInterno;
    private String bairroInterno;
    
    private String nomeCadasFornecedor;
    private String CNPJCadasFornecedore;
    private String numeroCadasFornecedores;
    
    private String nomeCadasProduto;
    private String codigoCadasProdutos;
    private String custoCadasProdutos;
    
    private String nomeRelatoClientes;
    private String CPFRelatoCliente;
    private String EstadoCivRelatoCliente;
    
    private String nomeRelatoFornecedores;
    private String nomeEmpresaRelatoFornecedor;
    private String CNPJRelatoFornecedores;
    
    private String nomeRelatoProdutos;
    private String IDRelatoProdutos;
    private String dataValidadeRelatoProdutos;

    private String reportProblemaAjuda;
    private String enviaFeedConfiguracao;
    
    
    
    
    

    public String getReportProblemaAjuda() {
        return reportProblemaAjuda;
    }

    public void setReportProblemaAjuda(String reportProblemaAjuda) {
        this.reportProblemaAjuda = reportProblemaAjuda;
    }

    public String getEnviaFeedConfiguracao() {
        return enviaFeedConfiguracao;
    }

    public void setEnviaFeedConfiguracao(String enviaFeedConfiguracao) {
        this.enviaFeedConfiguracao = enviaFeedConfiguracao;
    }
    
    public String getNomeInterno() {
        return nomeInterno;
    }

    public void setNomeInterno(String nomeInterno) {
        this.nomeInterno = nomeInterno;
    }

    public String getRuaInterno() {
        return ruaInterno;
    }

    public void setRuaInterno(String ruaInterno) {
        this.ruaInterno = ruaInterno;
    }

    public String getBairroInterno() {
        return bairroInterno;
    }

    public void setBairroInterno(String bairroInterno) {
        this.bairroInterno = bairroInterno;
    }

    public String getNomeCadasFornecedor() {
        return nomeCadasFornecedor;
    }

    public void setNomeCadasFornecedor(String nomeCadasFornecedor) {
        this.nomeCadasFornecedor = nomeCadasFornecedor;
    }

    public String getCNPJCadasFornecedore() {
        return CNPJCadasFornecedore;
    }

    public void setCNPJCadasFornecedore(String CNPJCadasFornecedore) {
        this.CNPJCadasFornecedore = CNPJCadasFornecedore;
    }

    public String getNumeroCadasFornecedores() {
        return numeroCadasFornecedores;
    }

    public void setNumeroCadasFornecedores(String numeroCadasFornecedores) {
        this.numeroCadasFornecedores = numeroCadasFornecedores;
    }

    public String getNomeCadasProduto() {
        return nomeCadasProduto;
    }

    public void setNomeCadasProduto(String nomeCadasProduto) {
        this.nomeCadasProduto = nomeCadasProduto;
    }

    public String getCodigoCadasProdutos() {
        return codigoCadasProdutos;
    }

    public void setCodigoCadasProdutos(String codigoCadasProdutos) {
        this.codigoCadasProdutos = codigoCadasProdutos;
    }

    public String getCustoCadasProdutos() {
        return custoCadasProdutos;
    }

    public void setCustoCadasProdutos(String custoCadasProdutos) {
        this.custoCadasProdutos = custoCadasProdutos;
    }

    public String getNomeRelatoClientes() {
        return nomeRelatoClientes;
    }

    public void setNomeRelatoClientes(String nomeRelatoClientes) {
        this.nomeRelatoClientes = nomeRelatoClientes;
    }

    public String getCPFRelatoCliente() {
        return CPFRelatoCliente;
    }

    public void setCPFRelatoCliente(String CPFRelatoCliente) {
        this.CPFRelatoCliente = CPFRelatoCliente;
    }

    public String getEstadoCivRelatoCliente() {
        return EstadoCivRelatoCliente;
    }

    public void setEstadoCivRelatoCliente(String EstadoCivRelatoCliente) {
        this.EstadoCivRelatoCliente = EstadoCivRelatoCliente;
    }

    public String getNomeRelatoFornecedores() {
        return nomeRelatoFornecedores;
    }

    public void setNomeRelatoFornecedores(String nomeRelatoFornecedores) {
        this.nomeRelatoFornecedores = nomeRelatoFornecedores;
    }

    public String getNomeEmpresaRelatoFornecedor() {
        return nomeEmpresaRelatoFornecedor;
    }

    public void setNomeEmpresaRelatoFornecedor(String nomeEmpresaRelatoFornecedor) {
        this.nomeEmpresaRelatoFornecedor = nomeEmpresaRelatoFornecedor;
    }

    public String getCNPJRelatoFornecedores() {
        return CNPJRelatoFornecedores;
    }

    public void setCNPJRelatoFornecedores(String CNPJRelatoFornecedores) {
        this.CNPJRelatoFornecedores = CNPJRelatoFornecedores;
    }

    public String getNomeRelatoProdutos() {
        return nomeRelatoProdutos;
    }

    public void setNomeRelatoProdutos(String nomeRelatoProdutos) {
        this.nomeRelatoProdutos = nomeRelatoProdutos;
    }

    public String getIDRelatoProdutos() {
        return IDRelatoProdutos;
    }

    public void setIDRelatoProdutos(String IDRelatoProdutos) {
        this.IDRelatoProdutos = IDRelatoProdutos;
    }

    public String getDataValidadeRelatoProdutos() {
        return dataValidadeRelatoProdutos;
    }

    public void setDataValidadeRelatoProdutos(String dataValidadeRelatoProdutos) {
        this.dataValidadeRelatoProdutos = dataValidadeRelatoProdutos;
    } 

    
    
    
    public String salvarAjuda(){
        
        try { 
            FileWriter salvaAjuda = new FileWriter("Ajuda.txt");
            PrintWriter ajudaSalv = new PrintWriter(salvaAjuda);
            ajudaSalv.println("Problema reportado: "+ this.reportProblemaAjuda);
            ajudaSalv.flush();
            ajudaSalv.close();
            salvaAjuda.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    public String salvarFeed(){
        
        try { 
            FileWriter salvafeed = new FileWriter("Configuracao.txt");
            PrintWriter feedSalva = new PrintWriter(salvafeed);
            feedSalva.println("Ação Completa: "+ this.enviaFeedConfiguracao);
            feedSalva.flush();
            feedSalva.close();
            feedSalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvaInterno(){
        
        try { 
            FileWriter salvarInterno = new FileWriter("Interno.txt");
            PrintWriter InternoSalva = new PrintWriter(salvarInterno);
            InternoSalva.println("Nome: "+ this.nomeInterno);
            InternoSalva.println("Rua: "+ this.ruaInterno);
            InternoSalva.println("Bairro: "+ this.bairroInterno);
            InternoSalva.flush();
            InternoSalva.close();
            InternoSalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvarCadastroFornecedor(){
        
        try { 
            FileWriter salvaCadastroFornecedor = new FileWriter("Cadastro de Fornecedor.txt");
            PrintWriter fornecedorCadastroSalvar = new PrintWriter(salvaCadastroFornecedor);
            fornecedorCadastroSalvar.println("Nome: "+ this.nomeCadasFornecedor);
            fornecedorCadastroSalvar.println("CNPJ: "+ this.CNPJCadasFornecedore);
            fornecedorCadastroSalvar.println("Número: "+ this.numeroCadasFornecedores);
            fornecedorCadastroSalvar.flush();
            fornecedorCadastroSalvar.close();
            fornecedorCadastroSalvar.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvarCadastroProdutos(){
        
        try { 
            FileWriter salvaCadastroProdutos = new FileWriter("Cadastro de Produtos.txt");
            PrintWriter produtosCadastrosalva = new PrintWriter(salvaCadastroProdutos);
            produtosCadastrosalva.println("Nome: "+ this.nomeCadasProduto);
            produtosCadastrosalva.println("Código: "+ this.codigoCadasProdutos);
            produtosCadastrosalva.println("Custo: "+ this.custoCadasProdutos);
            produtosCadastrosalva.flush();
            produtosCadastrosalva.close();
            produtosCadastrosalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvarRelatorioClientes(){
        
        try { 
            FileWriter salvaRelatorioClientes = new FileWriter("Relatório clientes.txt");
            PrintWriter clientesRelatorioSalva = new PrintWriter(salvaRelatorioClientes);
            clientesRelatorioSalva.println("Nome: "+ this.nomeRelatoClientes);
            clientesRelatorioSalva.println("CPF: "+ this.CPFRelatoCliente);
            clientesRelatorioSalva.println("Estado civil: "+ this.EstadoCivRelatoCliente);
            clientesRelatorioSalva.flush();
            clientesRelatorioSalva.close();
            clientesRelatorioSalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvarRelatorioDeFornecedores(){
        
        try { 
            FileWriter salvaRelatorioDeFornecedores = new FileWriter("Relatório fornecedores.txt");
            PrintWriter fornecedoresRelatrioSalva = new PrintWriter(salvaRelatorioDeFornecedores);
            fornecedoresRelatrioSalva.println("Nome: "+ this.nomeRelatoFornecedores);
            fornecedoresRelatrioSalva.println("Nome empresa: "+ this.nomeEmpresaRelatoFornecedor);
            fornecedoresRelatrioSalva.println("CNPJ: "+ this.CNPJRelatoFornecedores);
            fornecedoresRelatrioSalva.flush();
            fornecedoresRelatrioSalva.close();
            fornecedoresRelatrioSalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
    
    
    
    public String salvarRelatorioDeProdutos(){
        
        try { 
            FileWriter salvaRelatorioDeProdutos = new FileWriter("Relatório produtos.txt");
            PrintWriter ProdutoDeRelatorioSalva = new PrintWriter(salvaRelatorioDeProdutos);
            ProdutoDeRelatorioSalva.println("Nome: "+ this.nomeRelatoProdutos);
            ProdutoDeRelatorioSalva.println("ID: "+ this.IDRelatoProdutos);
            ProdutoDeRelatorioSalva.println("Data validade: "+ this.dataValidadeRelatoProdutos);
            ProdutoDeRelatorioSalva.flush();
            ProdutoDeRelatorioSalva.close();
            ProdutoDeRelatorioSalva.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Ação Completa";
    }
    
}
