package empresa;

// cria uma classe denominada funcionário
import javax.swing.JOptionPane;

public class Funcionario {

    // atributos da classe - características
    protected String nome;
    protected float salario;

    // método construtor
    public Funcionario(String nome, float salario) {
        // neste objeto, ele vai acessar o atributo nome
        this.nome = nome;
        this.salario = salario;
    }

    // método que retorna o valor  do salário
    public float calcularSalario() {
        return this.salario;
    }

    // método que exibe os dados do funcionário
    // noem: José | Salário: R$ 1528.00
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(
                // $s signigica q vai ser uma string
                // string.format: formate esse texto
                null, String.format(
                        "Nome: %s | Salário: R$ %.2f", this.nome, this.calcularSalario()
                )
        );
        
        // exemplo concatenado  
        // JOptionPane.showMessageDialog(
        //    null, "Nome: " + this.nome + " | Salário: R$ " + this.calcularSalario()
        // );

    }
}
