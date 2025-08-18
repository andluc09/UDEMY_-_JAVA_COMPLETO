package Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.OrderStatus;
	
public class OrderExercicio {
	
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	// Não se coloca coleção (List) no construtor da classe
	// Não há setItems para a List, você cria um metódo específico addItems e removeItem
	// Não há getItems para a List, você cria um metódo específico addItems e removeItem
	
	private List<OrderItem> items = new ArrayList<OrderItem>(); // TEM VÁRIOS OU MUITOS ---> List
	
	private Client client;
	
	public OrderExercicio() {
	}

	public OrderExercicio(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public OrderExercicio(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem it : items) {
			total += it.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthdate()) + ")" + " - " + client.getEmail() + "\n");
		sb.append("\nOrder items: \n");
		
		for (OrderItem i : items) {
			sb.append(i.getProduct().getName() 
					+ ", $" + String.format("%.2f", i.getPrice()) 
					+ ", Quantity: " + i.getQuantity() 
					+ ", Subtotal: $" + String.format("%.2f", i.subTotal()) 
					+ "\n");
		}
		
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
		
}
