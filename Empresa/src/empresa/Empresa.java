package empresa;

// classe empresa | Executável

import javax.swing.JOptionPane;

public class Empresa {
    // método principal
    public static void main(String[] args) {
        //  soolicita ao usuário os dados do funcionário
        String nome = JOptionPane.showInputDialog("Informe o nome");
        float salario = Float.parseFloat(
            JOptionPane.showInputDialog("Informe o salário")
        );
        
        // cria um objeto da classe funiconário
        Funcionario f1 = new Funcionario(nome, salario);
        
        // exibe as informações do funcionário
        f1.exibirInformacoes();
    }
}
