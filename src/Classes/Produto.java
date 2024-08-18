/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private ArrayList<Produto> TodosProdutos = new ArrayList<Produto>();
	
	public ArrayList<Produto> getTodosProdutos() {
		return TodosProdutos;
	}

	public void setTodosProdutos(ArrayList<Produto> todosProdutos) {
		TodosProdutos = todosProdutos;
	}

	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
