package conta;

import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
				
		//teste conta corrente
		
		ContaCorrente cc1 = new ContaCorrente (2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//teste conta poupança
		
		ContaPoupanca cp1 = new ContaPoupanca (3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		
		
		
		Scanner	ler = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			
			System.out.println(" __________________________________________________ ");
			System.out.println("|                                                  |");
			System.out.println("|               BANCO DO BRAZIL                    |");
			System.out.println("|                                                  |");
			System.out.println("|__________________________________________________|");
			System.out.println("|                                                  |");
			System.out.println("|              1 - Criar conta                     |");
			System.out.println("|              2 - Listar todas as contas          |");
			System.out.println("|              3 - Buscar conta por numero         |");
			System.out.println("|              4 - Atualizar dados da conta        |");
			System.out.println("|              5 - Apagar conta                    |");
			System.out.println("|              6 - Sacar                           |");
			System.out.println("|              7 - Depositar                       |");
			System.out.println("|              8 - Transferir valores entre contas |");
			System.out.println("|              9 - Sair                            |");
			System.out.println("|                                                  |");
			System.out.println("|__________________________________________________|");
			System.out.println("|            Entre com a opção desejada            |");
			System.out.println("|__________________________________________________|" + Cores.TEXT_RESET);
			
		try {
			opcao = ler.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores inteiros!");
			ler.nextLine();
			opcao = 0;
		}
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do brazil - o seu futuro começa aqui!!! ");
				ler.close();
				System.exit(0);
				
				switch (opcao) {
				case 1: 
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
					
					keypress();
					break;
				case 2 :
					System.err.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");
					
					keypress();
					break;
				case 3 :
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número\n\n");
					
					keypress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");
					
					keypress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a conta\n\n");
					
					keypress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
					
					keypress();
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
					
					keypress();
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");
					
					keypress();
					break;
				default :
					System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!\n");
					
					keypress();
					break;
					
				}
			}
		}
				
				
	}
			
			public static void keypress() {
				
				try {
					
					System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
					System.in.read();
					
				} catch (IOException e) {
					System.out.println("Você pressionou uma tecla diferente de enter!");
				}
			
		
			
		

	}

}
