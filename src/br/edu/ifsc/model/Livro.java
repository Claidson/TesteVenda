/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

/**
 *
 * @author Aluno
 */
public class Livro extends AbstractProduto{

    private String isbn;

    public Livro() {
    }

    public Livro(String isbn, String codigo, String descricao, String autor, int quantidadeEstoque, double preco) {
        super(codigo, descricao, autor, quantidadeEstoque, preco);
        this.isbn = isbn;
    }
    
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Livro: " + this.descricao + "\n"
                + "Código: " + this.codigo + "\n"
                + "Autor: " + this.autor + "\n"
                + "Qtd. em Estoque: " + this.quantidadeEstoque + "\n"
                + "ISBN: " + this.isbn + "\n"
                + "Preço: " + this.preco +"\n");
    }
}
