/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

public class GestaoFuncionarios extends Funcionario {
	public void inicializaFuncionario(String nome, String cargo, String turno, double salario) {
		getTodosFuncionarios().add(new Funcionario(getTodosFuncionarios().size() + 1, nome, cargo, turno, salario));
	}

	public void inserirFuncionario() {
		setId(getTodosFuncionarios().size() + 1);
		setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
		setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário"));
		setTurno(JOptionPane.showInputDialog("Digite o turno do funcionário"));
		setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário")));
		getTodosFuncionarios().add(new Funcionario(getId(), getNome(), getCargo(), getTurno(), getSalario()));
	}

	public void procurarFuncionario() {
		int idProcurarFuncionario;
		idProcurarFuncionario = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário a ser procurado"));

		for (int i = 0; i < getTodosFuncionarios().size(); i++) {
			if (getTodosFuncionarios().get(i).getId() == idProcurarFuncionario) {
				String msg = "";
				msg += "Id funcionário: " + getTodosFuncionarios().get(i).getId() + ", Nome funcionário: "
						+ getTodosFuncionarios().get(i).getNome() + ", " + "Cargo funcionário: "
						+ getTodosFuncionarios().get(i).getCargo() + ", Turno funcionário: " + ""
						+ getTodosFuncionarios().get(i).getTurno() + ", Salário " + "funcionário: R$"
						+ getTodosFuncionarios().get(i).getSalario() + "\n";
				JOptionPane.showMessageDialog(null, msg);
			}
		}
	}

	public void listarFuncionarios() {
		String msg = "";
		for (int i = 0; i < getTodosFuncionarios().size(); i++) {
			msg += "Id funcionário: " + getTodosFuncionarios().get(i).getId() + ", Nome funcionário: "
					+ getTodosFuncionarios().get(i).getNome() + ", " + "Cargo funcionário: "
					+ getTodosFuncionarios().get(i).getCargo() + ", Turno funcionário: " + ""
					+ getTodosFuncionarios().get(i).getTurno() + ", Salário " + "funcionário: R$"
					+ getTodosFuncionarios().get(i).getSalario() + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public void removerFuncionario() {
		int idRemoverFuncionario;
		idRemoverFuncionario = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário a ser removido"));

		for (int i = 0; i < getTodosFuncionarios().size(); i++) {
			if (getTodosFuncionarios().get(i).getId() == idRemoverFuncionario) {
				getTodosFuncionarios().remove(i);
			}
		}
	}
}

