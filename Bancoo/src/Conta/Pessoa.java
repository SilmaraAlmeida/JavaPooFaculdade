package Conta;

import javax.swing.JOptionPane;

public class Pessoa {
    public static void main(String[] args) {
    ContaBancaria conta = null;
    boolean continuar = true;
    
        while (continuar) {
            String[] opcoes = {"Cadastrar conta", "Depositar", "Sacar", "Consultar saldo", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Banco digital", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            switch (escolha) {
                case 0: // cadastrar conta
                    String titular = JOptionPane.showInputDialog("Digite o nome do titular");
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial"));
                    conta = new ContaBancaria(titular, saldoInicial);
                    break;
                case 1: // deposito
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Memhuma conta cadastrada");
                        break;
                    }
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                    conta.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Operação de depósito realizada");
                    break;
                case 2: // operação pra sacar
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta cadastrada");
                        break;
                    }
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                    if (conta.sacar(valorSaque)) {
                        JOptionPane.showMessageDialog(null, "Saque realizado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque");
                    }
                    break;
                case 3: // Consultar saldo
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta cadastrada");
                        break;
                    }
                    JOptionPane.showConfirmDialog(null, String.format("Saldo: R$ %.2f", conta.getSaldo()));
                    break;
                case 4: // sair do sistema
                    continuar = false;
                    break;
            }
        }
    } 
}
