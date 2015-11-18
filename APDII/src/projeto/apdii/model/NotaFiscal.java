package projeto.apdii.model;

import projeto.apdii.constant.StatusPagamento;
import projeto.apdii.constant.TipoPagamento;

import java.util.Date;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class NotaFiscal {

    private Date data;
    private String numeroConta;
    private String tipoTransporte;
    private double valor;

    private TipoPagamento pagamento;
    private StatusPagamento status;
    private Remessa remessa;
    private Cliente cliente;

    public NotaFiscal() {
    }

    public NotaFiscal(Date data, String numeroConta, String tipoTransporte, double valor) {
        this.data = data;
        this.numeroConta = numeroConta;
        this.tipoTransporte = tipoTransporte;
        this.valor = valor;
    }

    public NotaFiscal(Date data, String numeroConta, String tipoTransporte, double valor, TipoPagamento pagamento, StatusPagamento status) {
        this.data = data;
        this.numeroConta = numeroConta;
        this.tipoTransporte = tipoTransporte;
        this.valor = valor;
        this.pagamento = pagamento;
        this.status = status;
    }

    public NotaFiscal(Date data, String numeroConta, String tipoTransporte, double valor, TipoPagamento pagamento, StatusPagamento status, Remessa remessa, Cliente cliente) {
        this.data = data;
        this.numeroConta = numeroConta;
        this.tipoTransporte = tipoTransporte;
        this.valor = valor;
        this.pagamento = pagamento;
        this.status = status;
        this.remessa = remessa;
        this.cliente = cliente;
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

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public double getValor() {
        return valor;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public Remessa getRemessa() {
        return remessa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }

    public void setRemessa(Remessa remessa) {
        this.remessa = remessa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
