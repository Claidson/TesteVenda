/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;


import br.edu.ifsc.model.Cliente;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class ClienteLista {

    public ClienteLista() {
    }
    

 
    public boolean add(Cliente item) {
        return this.add(item);
    }

    
    public boolean remove(Cliente item) {
        return this.remove(item);
    }

    
    public boolean update(Cliente novoItem, int index) {
       boolean resultado = false;

        if (get(index) != null) {
            this.add(index, novoItem);
            resultado = true;
        }

        return resultado;
    }
    

    public Cliente get(int index){
        return this.get(index);
    }

    private void add(int index, Cliente novoItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
