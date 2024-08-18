/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

public class AutenticarSenha {
	public boolean autenticarSenha(String senha) {
		if (senha.equals("12345")) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Senha incorreta");
			return false;
		}
	}
}

