package banco;

import java.util.Scanner;

public class BancoMenu {
	
	public static void main(String[] args) {
		String nome, numeroConta;
		int menu;

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
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {

					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
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
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
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
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {

			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
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
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
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
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
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
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
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
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
					mostrarSaldo(saldo);
				} else if (opcao == 2) {
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
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out.println(
					"Você realizou todas as possíveis transações em Conta Empresarial, deseja continuar? (S/N)");
			continuar = entrada.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

	}

	public static void contaUniversitaria() {
		double saldo = 0.0, credito = 0.0, debito = 0.0;
		int opcao;
		char continuar;
		Scanner entrada = new Scanner(System.in);

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a opção de transação");
				System.out.println("1 - Crédito ");
				System.out.println("2 - Débito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					System.out.println("Digite o valor a ser creditado");
					credito = entrada.nextDouble();
					saldo = saldo + credito;
				} else if (opcao == 2) {
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
				} else if (opcao == 3) {
					System.out.println("Saldo: R$ " + saldo);
				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}

			}
			System.out.println(
					"Você realizou todas as possíveis transações em Conta Universitaria, deseja continuar? (S/N)");
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