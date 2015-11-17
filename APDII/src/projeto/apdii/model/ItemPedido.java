package projeto.apdii.model;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class ItemPedido {

    private int quantidade;
    private Livro livro;

    public double calculatSubTotal() {
        return quantidade * livro.getPreco();
    }
}
