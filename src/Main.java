
public class Main {

	public static void main(String[] args) {
		Cliente Nelson = new Cliente();
		venilton.setNome("Nelson");
		
		Conta cc = new ContaCorrente(Nelson);
		Conta poupanca = new ContaPoupanca(Nelson);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
