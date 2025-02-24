/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoofaculdade.aula001;

import javax.swing.JOptionPane;

/**
 *
 * @author fmur
 */
public class Carro {

    // atributos da classe
    public String marca;
    public String modelo;
    public String cor;
    public int anoFabricacao;
    
    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }
    
    public void ligar() {
        JOptionPane.showMessageDialog(null, this.modelo + " Ligou");
    }
}
