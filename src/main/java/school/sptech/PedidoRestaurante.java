package school.sptech;

import java.util.ArrayList;
import java.util.List;


public class PedidoRestaurante extends Pedido {
    private Double gorjeta;
    private Boolean mesaEspecial;

    public PedidoRestaurante(String cliente, Status status, List<ItemPedido> itens, Double gorjeta, Boolean mesaEspecial) {
        super(cliente, status, itens);
        this.gorjeta = gorjeta;
        this.mesaEspecial = mesaEspecial;
    }

    public PedidoRestaurante(Double gorjeta, Boolean mesaEspecial) {
        this.gorjeta = gorjeta;
        this.mesaEspecial = mesaEspecial;
    }

    public PedidoRestaurante() {

    }

    @Override
    public Double calcularTotal(){
        Double total =0.0;

        for (ItemPedido pedido : itens) {
            total += pedido.getSabor().getPreco() * pedido.getQuantidade();
        }
        if (mesaEspecial){
            total +=20.00;
        }
        return  total + gorjeta;
    }

    public Double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(Double gorjeta) {
        this.gorjeta = gorjeta;
    }

    public Boolean getMesaEspecial() {
        return mesaEspecial;
    }

    public void setMesaEspecial(Boolean mesaEspecial) {
        this.mesaEspecial = mesaEspecial;
    }


    @Override
    public String toString() {
        return "PedidoRestaurante{" +
                "gorjeta=" + gorjeta +
                ", mesaEspecial=" + mesaEspecial +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                ", itemPedido=" + itens +
                "} " + super.toString();
    }
}
