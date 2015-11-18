package projeto.apdii.model;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Cliente {

    private long identificador;
    private String email;
    private String celular;
    private String cidade;
    private String estado;

    public Cliente() {
    }

    public Cliente(String email, String celular, String cidade, String estado) {
        this.email = email;
        this.celular = celular;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Cliente(long identificador, String email, String celular, String cidade, String estado) {
        this.identificador = identificador;
        this.email = email;
        this.celular = celular;
        this.cidade = cidade;
        this.estado = estado;
    }

    /*---------------------
    -       Public
    ----------------------*/


    /*---------------------
    -       Get / Set
    ----------------------*/
    public long getIdentificador() {
        return identificador;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
