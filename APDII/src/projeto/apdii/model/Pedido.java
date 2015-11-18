package projeto.apdii.model;

import projeto.apdii.constant.StatusPedido;

import java.util.Date;
import java.util.List;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Pedido {

    private long identificador;
    private Date date;

    private StatusPedido status;
    private Remessa remessa;
    private List<ItemPedido> itens;

    public Pedido() {
    }

    /*---------------------
    -       Public
    ----------------------*/
    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemPedido::calculatSubTotal)
                .sum();
    }

    public void criarItemPedido(int quantidade) {

    }

    public boolean excluirPedido(int identificador) {
        return false;
    }

    public void atualizarStatusPedido() {

    }

    public void finalizarPedido() {

    }

    /*---------------------
    -       Get / Set
    ----------------------*/

}
