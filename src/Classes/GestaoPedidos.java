/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

public class GestaoPedidos extends Pedido {
	public void inserirPedido() {
		if (getTodosPedidos().size() == 0) {
			setId(1);
		} else {
			setId(getTodosPedidos().get(getTodosPedidos().size() - 1).getId() + 1);
		}
		setNomeCliente(JOptionPane.showInputDialog("Digite o nome do cliente"));
		setQntItensPedido(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de itens no pedido")));
		for (int i = 0; i < getQntItensPedido(); i++) {
			setNomeProduto(JOptionPane.showInputDialog("Digite o nome do Produto"));
			getTodosPedidos().add(new Pedido(getId(), getNomeProduto(), getNomeCliente(), "Pendente"));
		}
	}

	public void mostrarTodosPedidos() {
		String msg = "";
		for (int i = 0; i < getTodosPedidos().size(); i++) {
			msg += "Id Pedido: " + getTodosPedidos().get(i).getId() + ", Item: "
					+ getTodosPedidos().get(i).getNomeProduto() + ", " + "Nome cliente: "
					+ getTodosPedidos().get(i).getNomeCliente() + ", Estado pedido: "
					+ getTodosPedidos().get(i).getEstadoPedido() + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public void entregarPedido(GestaoProdutos p) {
		String msg = "";
		double total = 0;
		for (int i = 0; i < getTodosPedidos().size(); i++) {
			if (getTodosPedidos().get(i).getEstadoPedido().equals("Pendente")) {
				int idPedidoEntregue = getTodosPedidos().get(i).getId();
				for (int x = 0; x < getTodosPedidos().size(); x++) {
					if (getTodosPedidos().get(x).getId() == idPedidoEntregue) {
						getTodosPedidos().get(x).setEstadoPedido("Entregue");
						msg += "Id Pedido: " + getTodosPedidos().get(x).getId() + ", Item: "
								+ getTodosPedidos().get(x).getNomeProduto() + ", " + "Nome cliente: "
								+ getTodosPedidos().get(x).getNomeCliente() + ", Estado pedido: "
								+ getTodosPedidos().get(x).getEstadoPedido() + "\n";
						total += p.pegarValorProdutoPeloNome(getTodosPedidos().get(x).getNomeProduto());
					}
				}

				break;
			}
		}
		msg += "Total: R$" + total;
		setHistorico(msg + "\n\n");
		JOptionPane.showMessageDialog(null, msg);
	}

	public void historico() {
		JOptionPane.showMessageDialog(null, getHistorico());
	}
}

