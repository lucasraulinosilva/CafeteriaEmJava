/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

public class GestaoProdutos extends Produto {

	public void inicializarProduto(int id, String nome, double preco) {
		getTodosProdutos().add(new Produto(id, nome, preco));
	}

	public void inserirProdutosJOptionPane() {
		setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto")));
		getTodosProdutos().add(new Produto(getTodosProdutos().size() + 1, getNome(), getPreco()));
	}

	public void listarProdutosJOptionPane() {
		String msg = "";
		for (int i = 0; i < getTodosProdutos().size(); i++) {
			msg += "Id: " + getTodosProdutos().get(i).getId() + ", Nome: " + getTodosProdutos().get(i).getNome()
					+ ", Preço: " + getTodosProdutos().get(i).getPreco() + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public double pegarValorProdutoPeloNome(String nomeProduto) {
		for (int i = 0; i < getTodosProdutos().size(); i++) {
			if (getTodosProdutos().get(i).getNome().equals(nomeProduto)) {
				return getTodosProdutos().get(i).getPreco();
			}
		}
		return 0;
	}
}

