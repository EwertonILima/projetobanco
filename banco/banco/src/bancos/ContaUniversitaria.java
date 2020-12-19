package bancos;

public class ContaUniversitaria extends ContaEspecial{
	
private double emprestimoUniversitario;

	
	//construtor
public ContaUniversitaria(int numeroConta, String cpf, double valorLimite) {
	super(numeroConta, cpf, valorLimite);
	// TODO Auto-generated constructor stub
}

	//encapsulamento - getters and setters
	
	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
}
