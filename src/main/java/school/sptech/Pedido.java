package school.sptech;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected String cliente;
    protected Status status;
    protected List<ItemPedido> itens;

    public Pedido(String cliente, Status status, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.status = status;
        this.itens = new ArrayList<>();
    }

    public Pedido() {
    }
    public abstract Double calcularTotal();

    public void adicionarItem(Sabor sabor, Integer quantidade){
        ItemPedido item = new ItemPedido(sabor,quantidade);
        itens.add(item);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<ItemPedido> getItemPedido() {
        return itens;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itens = itemPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", status=" + status +
                ", itemPedido=" + itens +
                '}';
    }
}
