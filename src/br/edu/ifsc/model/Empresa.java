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
public class Empresa extends AbstractPessoa{
    private String url;

    public Empresa() {
    }

    public Empresa(String url) {
        this.url = url;
    }

    public Empresa(String url, String nome, String cnpj, String contato, String endereco) {
        super(nome, cnpj, contato, endereco);
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString() + "Url: " + this.url + "\n";
    }
    
    
    

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
}
