/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.abstracts;



/**
 *
 * @author Vitor
 */
public abstract class AbstractPessoa {
    protected String nome;
    protected String cnpj;
    protected String contato;
    protected String endereco;

    public AbstractPessoa() {
    }

    public AbstractPessoa(String nome, String cnpj, String contato, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
        this.endereco = endereco;
    }
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String toString(){
       String texto = "Nome: " + this.nome + "\n"
               + "CNPJ: " + this.cnpj + "\n"
               + "Contato: " + this.contato + "\n"
               + "Endereço: " + this.endereco + "\n";
       return texto;
    }
    
}
