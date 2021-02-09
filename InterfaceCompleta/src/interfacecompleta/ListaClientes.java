/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecompleta;

import java.util.ArrayList;

/**
 * @author Henrique Mendes
 */
public class ListaClientes {
    
   ArrayList<Cliente> listaC = new ArrayList();
    
    public void cadastrarCliente(Cliente c){  
        listaC.add(c);
    }
    
    public int quantidadeClientes(){
        return listaC.size();
    }  
}
