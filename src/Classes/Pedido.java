/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private String nomeProduto;
	private String nomeCliente;
	private String estadoPedido;
	private int qntItensPedido;
	private String historico = "";
	private ArrayList<Pedido> todosPedidos = new ArrayList<Pedido>();
	
	public Pedido(int id, String nomeProduto, String nomeCliente, String estadoPedido) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.nomeCliente = nomeCliente;
		this.estadoPedido = estadoPedido;
	}
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico += historico;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public int getQntItensPedido() {
		return qntItensPedido;
	}
	public void setQntItensPedido(int qntItensPedido) {
		this.qntItensPedido = qntItensPedido;
	}
	public ArrayList<Pedido> getTodosPedidos() {
		return todosPedidos;
	}
	public void setTodosPedidos(ArrayList<Pedido> todosPedidos) {
		this.todosPedidos = todosPedidos;
	}
	
	
	
}
