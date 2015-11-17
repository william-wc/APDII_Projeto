package projeto.apdii;

import projeto.apdii.model.Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by williamhjcho on 11/17/15.
 */
public class Main {

    public static void main(String[] args) {
        List<PPP> list = new ArrayList<>();
        list.add(new PPP(20.5));
        list.add(new PPP(10.5));
        list.add(new PPP(30.5));
        double sum = list.stream().mapToDouble(PPP::getValor).sum();
        System.out.println(sum);
    }
}

class PPP {
    private double valor;
    public PPP(double valor) {
        this.valor = valor;
    }

    public double getValor() {return valor;}
}