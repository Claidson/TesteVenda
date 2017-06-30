/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.bd;


import br.edu.ifsc.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ClienteBD  {
    private List<Cliente> listaCliente;

    public ClienteBD() {
        this.listaCliente = new ArrayList<>();
    }


    public boolean save(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
        return true;
    }


    public List<Cliente> recover() {
        return this.listaCliente;
    }

    @Deprecated
    public void preencherArray() {
        Cliente cliente;
        cliente = new Cliente("Cliente 1", "22342342", "23234234", "Endereço 1");
        this.listaCliente.add(cliente);
        cliente = new Cliente("Cliente 2", "567567", "9789789789", "Endereço 2");
        this.listaCliente.add(cliente);
        cliente = new Cliente("Cliente 3", "67867", "46456", "Endereço 3");
        this.listaCliente.add(cliente);
        cliente = new Cliente("Cliente 4", "867867867", "2323122", "Endereço 4");
        this.listaCliente.add(cliente);
        cliente = new Cliente("Cliente 5", "456456", "234234", "Endereço 4");
        this.listaCliente.add(cliente);
    }
    
}
