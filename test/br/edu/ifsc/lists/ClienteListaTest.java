/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.lists;

import br.edu.ifsc.model.ClienteLista;
import br.edu.ifsc.model.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class ClienteListaTest {

    private ClienteLista listaCliente;

    public ClienteListaTest() {
        this.listaCliente = new ClienteLista();
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("===== Início Testes ClienteLista =====");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("===== Fim Testes ClienteLista =====");
    }

    @Before
    public void setUp() {
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

    @After
    public void tearDown() {
        this.listaCliente = new ClienteLista();
    }

    /**
     * Test of add method, of class ClienteLista.
     */
    @Test
    public void testAdd() {
        System.out.println("* Teste Adicionar na Lista");
        Cliente cliente;
        cliente = new Cliente("Cliente 6", "67867", "567567", "Endereço 6");
        assertTrue(this.listaCliente.add(cliente));
    }

    /**
     * Test of remove method, of class ClienteLista.
     */
    @Test
    public void testRemove() {
        System.out.println("* Teste Remover na Lista");
        assertTrue(this.listaCliente.remove(this.listaCliente.get(0)));
    }
    
    @Test
    public void testRemoveClienteQueNaoPertenceALista() {
        System.out.println("* Teste Remover na Lista Clietne que não Pertence a lista");
        Cliente cliente = new Cliente();
        assertFalse(this.listaCliente.remove(cliente));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removerClienteNaoCadastrado() {
        System.out.println("* Teste Remover com Index inesistente");
        this.listaCliente.remove(this.listaCliente.get(100));
    }

    /**
     * Test of upadate method, of class ClienteLista.
     */
    @Test
    public void verificarAtualizacaoCliente() {
        System.out.println("* Teste Update");
        Cliente novoCliente = this.listaCliente.get(0);
        novoCliente.setNome("Nome Modigicado");
        this.listaCliente.update(novoCliente, 0);
        assertEquals("Nome Modigicado", this.listaCliente.get(0).getNome());
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void atualizarClienteNaoExistente() {
        System.out.println("* Teste Update com Index Inesistente");
        Cliente novoCliente = this.listaCliente.get(0);
        novoCliente.setNome("Nome Modificado");
        this.listaCliente.update(novoCliente, 100);
        assertEquals("Nome Modigicado", this.listaCliente.get(0).getNome());
    }

    /**
     * Test of get method, of class ClienteLista.
     */
    @Test
    public void obterCliente() {
        System.out.println("* Teste Get");
        Cliente cliente = new Cliente("Cliente 6", "345", "345", "Endereço 6");
        this.listaCliente.add(cliente);
        assertEquals(cliente, this.listaCliente.get(5));
    }
    
    @Test(expected = IndexOutOfBoundsException.class) 
    public void obterClienteNãoExistente() {
        System.out.println("* Teste Get com Index inesistente");
        this.listaCliente.get(100);
    }

}
