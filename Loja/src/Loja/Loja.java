package Loja;

import javax.swing.JOptionPane;

public class Loja {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do produto");
        float preco = Float.parseFloat(
            JOptionPane.showInputDialog("Preço")
        );

        Produto p1 = new Produto(nome, preco);

        p1.exibirInformacoes();
    }
}
