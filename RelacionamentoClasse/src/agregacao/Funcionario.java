package agregacao;

public class Funcionario {

    // atrigubo de classe - encapsulamento acessível para
    // alteração de valor apenas dentro da própria classe
    private String nome;
    
    // método construtor - inicializa o atributo
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    // retorna o atributo nome do funcionário
    public String getNome() {
        return this.nome;
    }
    
}
