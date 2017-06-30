/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Aluno
 */
public class LivrariaTest {
    private Livraria livraria;
    public LivrariaTest() {
        this.livraria = new Livraria();
        this.livraria.adicionarProdutoAoEstoque(new Livro("33", "33", "kill bill 1", "eu", 10, 10));
        this.livraria.adicionarProdutoAoEstoque(new Livro("33", "33", "kill bill 2", "tu", 200, 15));
        this.livraria.adicionarProdutoAoEstoque(new Livro("33", "33", "kill bill 3", "ele", 130, 45));
        this.livraria.adicionarProdutoAoEstoque(new Cd(15, "33", "Rock", "Timao", 15, 20));
        this.livraria.adicionarProdutoAoEstoque(new Cd(21, "33", "Rock nacional", "Pumba", 34, 5));
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adicionarProdutoAoEstoque method, of class Livraria.
     */
    @Test
    public void testAdicionarProdutoAoEstoque() {
        assertTrue(this.livraria.adicionarProdutoAoEstoque(new Livro("44", "44", "Didi e dede", "Zacarias", 10, 10)));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoNullAoEstoque() {
        assertTrue(this.livraria.adicionarProdutoAoEstoque(null));
    }
    
    @Test
    public void testAdicionarProdutoAListaDeVendas() {
        assertTrue(this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoAListaDeVendasComIndexNegativo() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoAListaDeVendasComIndexInexistente() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(100, 2);
    }
    @Test(expected = Error.class)
    public void testAdicionarProdutoIguais() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 2);
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 2);
    }
    
    @Test
    public void testAdicionarProdutoAListaDeVendasComDesconto() {
        assertTrue(this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 3, 10));
    }
    
     @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoAListaDeVendasComDescontoComIndexNegativo() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(-1, 2, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoAListaDeVendasComDescontoComIndexInexistente() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(100, 2, 10);
    }
    @Test(expected = Error.class)
    public void testAdicionarProdutoIguaisComDesconto() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 2, 10);
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 2, 10);
    }
    
    @Test
    public void testVerificarProdutosIguaisVerdadeiro() {
        ItemVenda item = new ItemVenda(new Livro("234", "3454353", "Livro1", "Autor1", 10, 10), 2);
        this.livraria.getItensDaVenda().add(item);
        assertTrue(this.livraria.verificarProdutosIguais(item.getProduto()));
        
    }
    
    @Test
    public void testVerificarProdutosIguaisFalso() {
        ItemVenda item = new ItemVenda(new Livro("234", "3454353", "Livro1", "Autor1", 10, 10), 2);
        this.livraria.getItensDaVenda().add(item);
        assertFalse(this.livraria.verificarProdutosIguais(new Livro()));
        
    }
    
    @Test
    public void testRealizarvenda() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 10);
        this.livraria.adicionarProdutoAListaDeItensDeVenda(1, 20);
        assertEquals(400.0, this.livraria.realizarVenda(), 0);
        
    }
    
    @Test
    public void testRealizarvendaDesconto() {
        this.livraria.adicionarProdutoAListaDeItensDeVenda(0, 10);
        this.livraria.adicionarProdutoAListaDeItensDeVenda(1, 20);
        assertEquals(360.0, this.livraria.realizarVenda(10), 0);
        
    }
    
    
    

   
    
}
