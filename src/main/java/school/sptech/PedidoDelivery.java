package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class PedidoDelivery extends Pedido {
    private Double distanciaKm;

    public PedidoDelivery(String cliente, Status status, List<ItemPedido> itens, Double distanciaKm) {
        super(cliente, status, itens);
        this.distanciaKm = distanciaKm;
    }

    public PedidoDelivery(Double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public PedidoDelivery() {
    }

    @Override
    public Double calcularTotal() {
        Double total =0.0;
        for (ItemPedido iten : itens) {
            total += iten.getSabor().getPreco()* iten.getQuantidade();
        }

        return total + calcularFrete();
    }
    public Double calcularFrete(){
        Double valorFrete=0.0;
        if (distanciaKm <= 0);

        else if (distanciaKm < 5){
            valorFrete = 5.0;
        } else if (distanciaKm <10) {
            valorFrete = 7.00;
        }else {
            valorFrete = 10.00;
        }

        return valorFrete;
    }

    public Double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
}
