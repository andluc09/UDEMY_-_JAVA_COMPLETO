package Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.OrderStatus;
	
public class OrderExercicio {
	
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date date;
	private OrderStatus status;
	
	private List<OrderItem> itens = new ArrayList<>(); 
	
	private Client client;
	
	public OrderExercicio() {
	}

	public OrderExercicio(Date date, OrderStatus status) {
		this.date = date;
		this.status = status;
	}
	
	public OrderExercicio(Date date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem i : itens) {
			total += i.subTotal(i.getPrice(), i.getQuantity());
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf1.format(date) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthdate()) + ")" + " - " + client.getEmail() + "\n");
		sb.append("\nOrder items: \n");
		
		for (OrderItem i : itens) {
			sb.append(i.getProduct().getName() 
					+ ", $" + String.format("%.2f", i.getPrice()) 
					+ ", Quantity: " + i.getQuantity() 
					+ ", Subtotal: $" + String.format("%.2f", i.subTotal(i.getPrice(), i.getQuantity())) 
					+ "\n");
		}
		
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
		
}
