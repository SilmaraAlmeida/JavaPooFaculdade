package pessoa;

import javax.swing.JOptionPane;

public class Cadastro {
    // método principal da classe
    public static void main(String[] args) {
        // cria um opbeto da classe pessoa
        Pessoa p1 =  new Pessoa();
        
        // determina o nome da pessoa
        String nome = JOptionPane.showInputDialog("Informe o nome");
        p1.setNome(nome);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        p1.setIdade(idade);
        
        JOptionPane.showConfirmDialog(null, String.format("Nome: %s | Idade %d"), p1.getNome(), p1.getIdade());
    }
}
