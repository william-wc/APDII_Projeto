package projeto.apdii.model;

import projeto.apdii.constant.StatusRemessa;

import java.util.Date;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Remessa {

    private Date data;
    private long numeroTransporte;
    private String tipoTransporte;

    private StatusRemessa status;

    public Remessa() {

    }

    public Remessa(Date data, long numeroTransporte, String tipoTransporte) {
        this.data = data;
        this.numeroTransporte = numeroTransporte;
        this.tipoTransporte = tipoTransporte;
    }

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
