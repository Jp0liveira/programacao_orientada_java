package programacao_orientada_java;


class CaixaEletronico {
    private String numeroConta;
    private String senha;
    private double saldo;

    // Construtor
    public CaixaEletronico(String numeroConta, String senha, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
    }

    // Método para realizar o login
    public boolean fazerLogin(String numeroConta, String senha) {
        return this.numeroConta.equals(numeroConta) && this.senha.equals(senha);
    }

    // Método para verificar o saldo
    public double verificarSaldo() {
        return saldo;
    }

    // Método para realizar saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para realizar transferência
    public void transferir(String numeroContaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " para conta " + numeroContaDestino + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}