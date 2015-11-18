package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import projeto.apdii.constant.StatusPedido;
import projeto.apdii.model.Cliente;
import projeto.apdii.model.ItemPedido;
import projeto.apdii.model.Livro;
import projeto.apdii.model.Pedido;

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
    }


}
