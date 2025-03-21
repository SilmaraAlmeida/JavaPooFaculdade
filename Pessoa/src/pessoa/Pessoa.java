package pessoa;

public class Pessoa {
    // Dois atributos privados - encapsulamento
    private String nome;
    private int idade;
    
    // Getter para nome
    public String getNome(){
        return this.nome;
    }
    
    // Setter para nome com validação
    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres.");
        }
    }
    
    // Getter para idade
    public int getIdade() {
        return this.idade;
    }
    
    // Setter para idade
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }
}
