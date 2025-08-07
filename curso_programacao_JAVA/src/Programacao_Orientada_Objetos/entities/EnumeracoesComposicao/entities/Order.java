package Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities;

import java.util.Date;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment; // Instante que o pedido foi efetuado
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {

		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
