package programacao_orientada_java;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 // Criando uma instância do caixa eletrônico com valores iniciais
        CaixaEletronico caixa = new CaixaEletronico("123456", "senha123", 1000.0);
        
        // Simulando o login
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o número da conta:");
        String numeroConta = scanner.nextLine();
        System.out.println("Entre com a senha:");
        String senha = scanner.nextLine();
        
        if (caixa.fazerLogin(numeroConta, senha)) {
            System.out.println("Login bem-sucedido.");

            // Menu de operações
            int opcao;
            do {
                System.out.println("\nEscolha uma operação:");
                System.out.println("1. Ver Saldo");
                System.out.println("2. Sacar");
                System.out.println("3. Transferência");
                System.out.println("0. Sair");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo atual: R$" + caixa.verificarSaldo());
                        break;
                    case 2:
                        System.out.println("Entre com o valor para sacar:");
                        double valorSaque = scanner.nextDouble();
                        caixa.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.println("Entre com o número da conta de destino:");
                        scanner.nextLine(); // Limpar o buffer do teclado
                        String contaDestino = scanner.nextLine();
                        System.out.println("Entre com o valor para transferir:");
                        double valorTransferencia = scanner.nextDouble();
                        caixa.transferir(contaDestino, valorTransferencia);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 0);
        } else {
            System.out.println("Número da conta ou senha incorretos. Tente novamente.");
        }
        scanner.close();
	}

}
