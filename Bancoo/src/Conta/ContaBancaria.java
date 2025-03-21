package Conta;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
//        this.setTitular(titular);
//        this.setSaldo(saldo);
        
        if (titular != null && titular.length() >= 3) {
            this.titular = titular;
        } else {
            throw new IllegalArgumentException("O titular deve ter pelo menos três caracteres.");
        }

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular != null && titular.length() >= 3) {
            this.titular = titular;
        } else {
            throw new IllegalArgumentException("O titular deve ter pelo menos três caracteres.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
}
