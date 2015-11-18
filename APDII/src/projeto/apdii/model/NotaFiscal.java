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

    /*---------------------
    -       Public
    ----------------------*/


    /*---------------------
    -       Get / Set
    ----------------------*/

}
