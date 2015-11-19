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
    private List<ItemPedido> items;

    public Pedido() {
    }

    public Pedido(long identificador, Date date, StatusPedido status) {
        this.identificador = identificador;
        this.date = date;
        this.status = status;
    }

    public Pedido(long identificador, Date date, StatusPedido status, Remessa remessa, List<ItemPedido> items) {
        this.identificador = identificador;
        this.date = date;
        this.status = status;
        this.remessa = remessa;
        this.items = items;
    }

    /*---------------------
    -       Public
    ----------------------*/
    public double calcularTotal() {
        return items.stream()
                .mapToDouble(ItemPedido::calculatSubTotal)
                .sum();
    }

    public void criarItemPedido(int quantidade, Livro livro) {
        ItemPedido item = items.stream().filter(p -> p.getLivro().equals(livro)).findFirst().get();
        if (item == null) {
            items.add(new ItemPedido(quantidade, livro));
        } else {
            item.setQuantidade(item.getQuantidade() + quantidade);
        }
    }

    public boolean contemItemPedido(Livro livro) {
        return items.stream().filter(p -> p.getLivro().equals(livro))
                .findFirst().isPresent();
    }

    public ItemPedido getItemPedido(int index) {
        return items.get(index);
    }

    public boolean excluirPedido(int identificador) {
        return items.removeIf(p -> p.getLivro().getIdentificador() == identificador);
    }

    public void atualizarStatusPedido() {

    }

    public void finalizar() {
        status = StatusPedido.Aprovado;
    }

    public void cancelar() {
        status = StatusPedido.Cancelado;
    }

    /*---------------------
    -       Get / Set
    ----------------------*/
    public long getIdentificador() {
        return identificador;
    }

    public Date getDate() {
        return date;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public Remessa getRemessa() {
        return remessa;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void setRemessa(Remessa remessa) {
        this.remessa = remessa;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }
}
