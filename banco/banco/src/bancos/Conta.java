package bancos;

public abstract class Conta {
	
	protected int numeroConta;
	private double saldo;
	protected String cpf;
	
	
	//*SOBRECARGA	
	public Conta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}
	
	public Conta(int numeroConta, String cpf)
	{
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	
	
	//ENCAPSULAMENTO
	public int getNumeroConta() {
		return numeroConta;
	}

	
	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	//METODOS
	public void debito(double valorDebito) 
	{
		if(testarSaldo(valorDebito) == true) {
			this.saldo = this.saldo - valorDebito;
		}else {
			System.out.println("Saldo Indisponivel");
		}
				
	}	
	
	public void credito (double valorCredito) 
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	
	public void pixDebito(double valorDebitoPix )
	{
		this.saldo = this.saldo - valorDebitoPix;
	}
	
	public void pixCredito(double valorCreditoPix )
	{
		this.saldo = this.saldo - valorCreditoPix;
	}
	
	public void trocarNumero(int novoNumero) {
		this.numeroConta = novoNumero;
	}
	
	public boolean testarSaldo(double valor) {
		boolean teste;
		
		if(valor <= this.saldo) {
			teste = true;
		}else {
			teste = false;
		}
		
		return teste;
	}
	
}
