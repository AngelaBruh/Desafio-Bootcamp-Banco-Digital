import java.util.Scanner;

public class Main {
// Regra:Só pode transferir para o mesmo banco



	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("Informe o nome do titular:");
		String titular = leitor.nextLine();
		cliente.setNome(titular);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		System.out.println("Informe um valor para saque:");
		double saque = leitor.nextDouble();
		cc.sacar(saque);

		System.out.println("Informe o valor para deposito: ");
		double deposito = leitor.nextDouble();
		cc.depositar(deposito);

		System.out.println("Informe o valor para transferência: ");
		double transfere = leitor.nextDouble();
		cc.transferir(transfere, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		leitor.close();
	}
}