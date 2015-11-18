package projeto.apdii.model;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class ItemPedido {

    private Livro livro;
    private int quantidade;

    public ItemPedido() {
    }

    public ItemPedido(Livro livro, int quantidade) {
        this.quantidade = quantidade;
        this.livro = livro;
    }

    /*---------------------
    -       Public
    ----------------------*/
    public double calculatSubTotal() {
        return quantidade * livro.getPreco();
    }

    /*---------------------
    -       Get / Set
    ----------------------*/
    public Livro getLivro() {
        return livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
