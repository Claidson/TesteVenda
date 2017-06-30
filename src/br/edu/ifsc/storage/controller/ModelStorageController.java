/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.storage.controller;

import br.edu.ifsc.model.Cliente;
import br.edu.ifsc.model.Empresa;
import br.edu.ifsc.storage.ClienteBD;
import br.edu.ifsc.storage.EmpresaBD;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ModelStorageController {
    private ClienteBD clienteBD;
    private EmpresaBD empresaBD;
 

    public ModelStorageController() {
        this.clienteBD = new ClienteBD();
        this.empresaBD = new EmpresaBD();
    
    }
    
    public List<Cliente> recoverClientes(){
        return this.clienteBD.recover();
    }
    
    public List<Empresa> recoverEmpresa(){
        return this.empresaBD.recover();
    }

 
    
    public boolean saveClientes(List<Cliente> listaCliente){
        return this.clienteBD.save(listaCliente);
    }
    
    public boolean saveEmpresas(List<Empresa> listafornecedores){
        return this.empresaBD.save(listafornecedores);
    }
    
   
  
    
    public boolean saveTodos(List<Cliente> listaClientes, List<Empresa> listaEmpresas){
        this.saveClientes(listaClientes);
        this.saveEmpresas(listaEmpresas);
        return true;
    }

    /**
     * @return the clienteStorage
     */
    public ClienteBD getClienteStorage() {
        return clienteBD;
    }

    /**
     * @param clienteStorage the clienteStorage to set
     */
    public void setClienteStorage(ClienteBD clienteStorage) {
        this.clienteBD = clienteStorage;
    }

    /**
     * @return the fornecedorStorage
     */
    public EmpresaBD getFornecedorStorage() {
        return empresaBD;
    }

    /**
     * @param fornecedorStorage the fornecedorStorage to set
     */
    public void setFornecedorStorage(EmpresaBD fornecedorStorage) {
        this.empresaBD = fornecedorStorage;
    }



    
    
}
