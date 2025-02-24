/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

/**
 *
 * @author fmur
 */
public class Principal {
    public static void main(String[] args) {
        // cria um objeto da classe Carro
        Carro corolla = new Carro(
                "toyota", "Corolla", "Fusacao", 1890
        );
        corolla.ligar();
    }
}
