package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {
    private String nome;
    private String telefone;
    private List<Pedido> pedidos;

    public Pizzaria(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pizzaria() {
    }

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public Integer qtdPedidos(Status status){
        Integer qtdPedidos =0;
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equals(status)){
                qtdPedidos++;
            }
        }
        return  qtdPedidos;
    }
    public Integer qtdPedidosDelivery(){
        Integer qtdPedidosDelivery= 0;

        for (Pedido pedido : pedidos) {
            if (pedido instanceof PedidoDelivery){
                qtdPedidosDelivery++;
            }
        }
        return  qtdPedidosDelivery;
    }
    public Integer qtdUnidadesVendidas(Sabor sabor){
        Integer qtdVendidaSabor= 0;
        List<ItemPedido> item= new ArrayList<>();

        for (Pedido pedido : pedidos) {
            for (ItemPedido iten : pedido.getItens()) {
                if (iten.getSabor().equals(sabor))
                qtdVendidaSabor+= iten.getQuantidade();
            }
        }
        return qtdVendidaSabor;
    }
    public Double calcularFaturamento(){
        Double total =0.0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
