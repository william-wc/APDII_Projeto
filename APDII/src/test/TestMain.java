package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import projeto.apdii.constant.StatusPedido;
import projeto.apdii.constant.StatusRemessa;
import projeto.apdii.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by williamhjcho on 11/18/15.
 */
public class TestMain {

    @Test
    public void testCliente() {
        Cliente cliente = new Cliente(
                12345,
                "cliente@email.com",
                "99999-8888",
                "Cidade",
                "Estado");
        assertEquals(cliente.getIdentificador() , 12345);
        assertEquals(cliente.getEmail()         , "cliente@email.com");
        assertEquals(cliente.getCelular()       , "99999-8888");
        assertEquals(cliente.getCidade()        , "Cidade");
        assertEquals(cliente.getEstado()        , "Estado");
    }

    @Test
    public void testPedido() {
        Pedido pedido = new Pedido(1111, new Date(123454321), StatusPedido.Aprovado);
        Livro livro;
        List<ItemPedido> items = new ArrayList<>();
        livro = new Livro(); livro.setPreco(15.75); items.add(new ItemPedido(5, livro));
        livro = new Livro(); livro.setPreco(50.00); items.add(new ItemPedido(4, livro));
        pedido.setItems(items);

        assertEquals(pedido.getIdentificador(), 1111);
        assertEquals(pedido.getDate(), new Date(123454321));
        assertEquals(pedido.getStatus(), StatusPedido.Aprovado);
        assertEquals(pedido.calcularTotal(), 15.75 * 5 + 50.00 * 4, 0.01);
    }

    @Test
    public void testLivro() {
        Livro livro = new Livro(
                1111,
                11,
                "descricao",
                "isbn-isbn-isbn",
                "portugues",
                "editora A",
                1.0,
                50.40,
                10.10,
                74.99,
                new Date(123123));
        assertEquals(livro.getIdentificador()   , 1111 );
        assertEquals(livro.getEdicao()          , 11);
        assertEquals(livro.getDescricao()       , "descricao");
        assertEquals(livro.getIsbn()            , "isbn-isbn-isbn");
        assertEquals(livro.getIdioma()          , "portugues");
        assertEquals(livro.getEditora()         , "editora A");
        assertEquals(livro.getPeso()            , 1.0, 0.0);
        assertEquals(livro.getLargura()         , 50.40, 0.0);
        assertEquals(livro.getProfundidade()    , 10.10, 0.0);
        assertEquals(livro.getPreco()           , 74.99, 0.0);
        assertEquals(livro.getDataAdicao()      , new Date(123123));
    }

    @Test
    public void testRemessa() {
        Remessa remessa = new Remessa(
                new Date(9876),
                "tipo transporte",
                19191,
                StatusRemessa.ACaminho);
        Pedido pedido = new Pedido();
        remessa.setPedido(pedido);

        assertEquals(remessa.getData()              , new Date(9876));
        assertEquals(remessa.getTipoTransporte()    , "tipo transporte"     );
        assertEquals(remessa.getNumeroTransporte()  , 19191                 );
        assertEquals(remessa.getStatus()            , StatusRemessa.ACaminho);
        assertEquals(remessa.getPedido()            , pedido                );
    }

}
