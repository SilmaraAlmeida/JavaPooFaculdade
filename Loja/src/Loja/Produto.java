package Loja;

import javax.swing.JOptionPane;

public class Produto {
    protected String nome;
    protected float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public float calcularPrecoFinal() {
        return this.preco;
    }
    
    public void exibirInformacoes(){
        JOptionPane.showMessageDialog(
            null, String.format(
                "Produto %s | Preço final %.2f", this.nome, this.calcularPrecoFinal()
            )
        );
    }
}
