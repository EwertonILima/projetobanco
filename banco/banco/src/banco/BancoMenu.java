package banco;

import java.util.Random;
import java.util.Scanner;

public class BancoMenu {
	
	public static void main(String[] args) {
		String nome, numeroConta;
		
		
		String clientes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra",
							"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
							"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
							"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
							"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Enrique Cabral Silva",
							"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos",
							"Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa",
							"Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
							"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos",
							"Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães",
							"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
							"Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda","Gabriel"};
		char sexo[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F',
						'M','F','M','F','M','M','M','M','M','F','F','M','F','M','M','M'};
		int conta[] = new int[5];
		int tipoConta[] = new int[40];
		
		
		Scanner leia = new Scanner(System.in);
		
		linha(50);
		System.out.println("Bem vindo ao Banco G2");
		linha(50);
		System.out.println();
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite o numero da conta: ");
		numeroConta = leia.next();
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			conta[i] = i+1;
			//tipoConta[i] = sorteia.nextInt(3)+1;
		}
		
		menuContas();
		
	}
	
	//FIM DO MAIN
	
	
	public static void menuContas() {
		Scanner leia = new Scanner(System.in);
		int menu;
		do {
			System.out.println("Digite a opção de conta");
			System.out.println("1 - Conta Poupança ");
			System.out.println("2 - Conta Corrente ");
			System.out.println("3 - Conta Especial ");
			System.out.println("4 - Conta Empresarial ");
			System.out.println("5 - Conta Universitária ");
			System.out.println("6 - Extrato Consolidado ");
			System.out.println("0 - Sair ");
			menu = leia.nextInt();

			if (menu == 1) {
				contaPoupanca();
			} else if (menu == 2) {
				contaCorrente();
			} else if (menu == 3) {
				contaEspecial();
			} else if (menu == 4) {
				contaEmpresarial();
			} else if (menu == 5) {
				contaUniversitaria();
			} else if (menu == 6) {
				// função extrato
			} else if (menu == 0) {
				System.out.println("Encerrando acesso a conta");
				System.exit(0);
			}

		} while (menu != 0);
	}

	public static void contaPoupanca() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		int aniversario[] = new int[40];
		Random sorteia = new Random();
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Movimento ");
				System.out.println("2 - Saldo ");
				System.out.println("3 - Sair");
				System.out.println("0 - Aniversário ");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("[C] Crédito ou [D] Débito ?");
					escolheDebitoCredito = entrada.next().toUpperCase().charAt(0);
						if(escolheDebitoCredito == 'C') {
							System.out.println("Digite o valor a ser creditado");
							credito = entrada.nextDouble();
							saldo = saldo + credito;
							mostrarSaldo(saldo);
						}else if(escolheDebitoCredito == 'D') {
							if (saldo <= 0.0) {
								System.out.println("Não é possível realizar o saque!");
							} else if (saldo >= debito) {
								System.out.println("Digite o valor a ser debitado");
								debito = entrada.nextDouble();
								saldo -= debito;
								if(saldo < 0) {
									System.out.println("Não é possível realizar este débito. O saldo final não pode ser negativo");
									saldo = saldo + debito;
								}
								mostrarSaldo(saldo);
							}
						}					
				} else if (opcao == 2) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 3) {
					System.out.println("Encerrando acesso a conta");
					menuContas();
				}else if(opcao == 0) {
					for(int i = 0; i < 40; i++) {
						aniversario[i]=sorteia.nextInt(30)+1;
					}
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Poupança, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}
	
	

	public static void contaCorrente() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Movimento ");
				System.out.println("2 - Saldo ");
				System.out.println("3 - Sair");
				
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("[C] Crédito ou [D] Débito ?");
					escolheDebitoCredito = entrada.next().toUpperCase().charAt(0);
						if(escolheDebitoCredito == 'C') {
							System.out.println("Digite o valor a ser creditado");
							credito = entrada.nextDouble();
							saldo = saldo + credito;
							mostrarSaldo(saldo);
						}else if(escolheDebitoCredito == 'D') {
							if (saldo <= 0.0) {
								System.out.println("Não é possível realizar o saque!");
							} else if (saldo >= debito) {
								System.out.println("Digite o valor a ser debitado");
								debito = entrada.nextDouble();
								saldo -= debito;
								if(saldo < 0) {
									System.out.println("Não é possível realizar este débito. O saldo final não pode ser negativo");
									saldo = saldo + debito;
								}
								mostrarSaldo(saldo);
							}
						}					
				} else if (opcao == 2) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 3) {
					System.out.println("Encerrando acesso a conta");
					menuContas();
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Corrente, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaEspecial() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Movimento ");
				System.out.println("2 - Saldo ");
				System.out.println("3 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("[C] Crédito ou [D] Débito ?");
					escolheDebitoCredito = entrada.next().toUpperCase().charAt(0);
						if(escolheDebitoCredito == 'C') {
							System.out.println("Digite o valor a ser creditado");
							credito = entrada.nextDouble();
							saldo = saldo + credito;
							mostrarSaldo(saldo);
						}else if(escolheDebitoCredito == 'D') {
							if (saldo <= 0.0) {
								System.out.println("Não é possível realizar o saque!");
							} else if (saldo >= debito) {
								System.out.println("Digite o valor a ser debitado");
								debito = entrada.nextDouble();
								saldo -= debito;
								if(saldo < 0) {
									System.out.println("Não é possível realizar este débito. O saldo final não pode ser negativo");
									saldo = saldo + debito;
								}
								mostrarSaldo(saldo);
							}
						}					
				} else if (opcao == 2) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 3) {
					System.out.println("Encerrando acesso a conta");
					menuContas();
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Especial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaEmpresarial() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Movimento ");
				System.out.println("2 - Saldo ");
				System.out.println("3 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("[C] Crédito ou [D] Débito ?");
					escolheDebitoCredito = entrada.next().toUpperCase().charAt(0);
						if(escolheDebitoCredito == 'C') {
							System.out.println("Digite o valor a ser creditado");
							credito = entrada.nextDouble();
							saldo = saldo + credito;
							mostrarSaldo(saldo);
						}else if(escolheDebitoCredito == 'D') {
							if (saldo <= 0.0) {
								System.out.println("Não é possível realizar o saque!");
							} else if (saldo >= debito) {
								System.out.println("Digite o valor a ser debitado");
								debito = entrada.nextDouble();
								saldo -= debito;
								if(saldo < 0) {
									System.out.println("Não é possível realizar este débito. O saldo final não pode ser negativo");
									saldo = saldo + debito;
								}
								mostrarSaldo(saldo);
							}
						}					
				} else if (opcao == 2) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 3) {
					System.out.println("Encerrando acesso a conta");
					menuContas();
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Empresarial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaUniversitaria() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar, escolheDebitoCredito;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Movimento ");
				System.out.println("2 - Saldo ");
				System.out.println("3 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("[C] Crédito ou [D] Débito ?");
					escolheDebitoCredito = entrada.next().toUpperCase().charAt(0);
						if(escolheDebitoCredito == 'C') {
							System.out.println("Digite o valor a ser creditado");
							credito = entrada.nextDouble();
							saldo = saldo + credito;
							mostrarSaldo(saldo);
						}else if(escolheDebitoCredito == 'D') {
							if (saldo <= 0.0) {
								System.out.println("Não é possível realizar o saque!");
							} else if (saldo >= debito) {
								System.out.println("Digite o valor a ser debitado");
								debito = entrada.nextDouble();
								saldo -= debito;
								if(saldo < 0) {
									System.out.println("Não é possível realizar este débito. O saldo final não pode ser negativo");
									saldo = saldo + debito;
								}
								mostrarSaldo(saldo);
							}
						}					
				} else if (opcao == 2) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 3) {
					System.out.println("Encerrando acesso a conta");
					menuContas();
				}

			}
			System.out
					.println("Você realizou todas as possíveis transações em Conta Universitária, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');
	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void mostrarSaldo(Double saldo) {
		System.out.println("Saldo: R$ " + saldo);
	}
}