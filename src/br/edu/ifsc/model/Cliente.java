/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import br.edu.ifsc.abstracts.AbstractPessoa;

/**
 *
 * @author Vitor
 */
public class Cliente extends AbstractPessoa{

    public Cliente(String nome, String cnpj, String contato, String endereco) {
        super(nome, cnpj, contato, endereco);
    }

    public Cliente() {
    }
    
    
    
}
