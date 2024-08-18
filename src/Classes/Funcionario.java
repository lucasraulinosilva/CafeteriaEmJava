/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	private String turno;
	private double salario;
	private ArrayList<Funcionario> todosFuncionarios = new ArrayList<Funcionario>();
	
	public Funcionario(int id, String nome, String cargo, String turno, double salario) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.turno = turno;
		this.salario = salario;
	}
	
	public Funcionario() {
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ArrayList<Funcionario> getTodosFuncionarios() {
		return todosFuncionarios;
	}
	public void setTodosFuncionarios(ArrayList<Funcionario> todosFuncionarios) {
		this.todosFuncionarios = todosFuncionarios;
	}
	
	
}

