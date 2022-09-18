package Loja.entities;

import Loja.entities.Client;
import Loja.entities.OrderItem;
import Loja.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<OrderItem>();
    private Client client;

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        Double precoTotal = 0.0;
        for(OrderItem preco : items){
            precoTotal += preco.subTotal();
        }

        return precoTotal;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(this.moment) + "\n");
        sb.append("Order status: " + this.status + "\n");
        sb.append(client + "\n");
        sb.append("\nOrder Items: \n");

        for(OrderItem produto : items){
            sb.append(produto + "\n");
        }

        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }


}
