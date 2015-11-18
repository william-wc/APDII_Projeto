package projeto.apdii.model;

import projeto.apdii.constant.StatusRemessa;

import java.util.Date;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Remessa {

    private Date data;
    private String tipoTransporte;
    private long numeroTransporte;

    private StatusRemessa status;
    private Pedido pedido;

    public Remessa() {

    }

    public Remessa(Date data, String tipoTransporte, long numeroTransporte, StatusRemessa status) {
        this.data = data;
        this.tipoTransporte = tipoTransporte;
        this.numeroTransporte = numeroTransporte;
        this.status = status;
    }

    /*---------------------
    -       Public
    ----------------------*/


    /*---------------------
    -       Get / Set
    ----------------------*/
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public long getNumeroTransporte() {
        return numeroTransporte;
    }

    public void setNumeroTransporte(long numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
}
