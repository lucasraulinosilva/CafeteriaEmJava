/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Classes.GestaoFuncionarios;
import Classes.GestaoPedidos;
import Classes.GestaoProdutos;
import Menu.MenuFuncionariosNetbeans;
import Menu.MenuPedidosNetbeans;
import Menu.MenuPrincipalNetbeans;
import Menu.MenuProdutosNetbeans;

public class Principal {

    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        GestaoProdutos g = new GestaoProdutos();
        GestaoPedidos gpe = new GestaoPedidos();
        GestaoFuncionarios gf = new GestaoFuncionarios();
        MenuPrincipalNetbeans menu = new MenuPrincipalNetbeans(g, gpe, gf);
        
        g.inicializarProduto(1, "Cafe", 5.00);
        g.inicializarProduto(2, "Cafe com Leite", 7.00);
        g.inicializarProduto(3, "Cookie", 4.00);
        
        gf.inicializaFuncionario("Lucas", "Caixa", "Matutino", 2000.00);
        gf.inicializaFuncionario("Fernando", "Atendente", "Matutino", 1500.00);
        gf.inicializaFuncionario("Kevin", "Atendente", "Noturno", 1500.00);
        
        menu.setVisible(true);

    }

}
