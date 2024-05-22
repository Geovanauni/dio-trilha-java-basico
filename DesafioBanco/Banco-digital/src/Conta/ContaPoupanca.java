public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	public void calcularJuros() {
	
		double juros = this.saldo * 0.005;
		this.saldo += juros;
		System.out.println(String.format("Juros calculados: %.2f", juros));
}