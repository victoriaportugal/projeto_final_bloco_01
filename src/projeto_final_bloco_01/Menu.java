package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		float valor, mls;
		String nome_bebida, caracteristica;
		int opcao = 0;
		
		Scanner leia = new Scanner(System.in);


		System.out.println("************************************");
		System.out.println("                                    ");
		System.out.println("        DRINK PRA MAIS DE BOM       ");
		System.out.println("                                    ");
		System.out.println("************************************");
		System.out.println("      1- Cadastrar bebida:          ");
		System.out.println("      2- Listar todas as bebidas    ");
		System.out.println("      3- Atualizar Dados da Conta   ");
		System.out.println("      4- Apagar Conta               ");
		System.out.println("      5- Sair                       ");
		System.out.println("                                    ");
		System.out.println("************************************");
		System.out.println("       Entre na opção desejada      ");
		System.out.println("                                    ");
		leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do vinho: ");
			nome_bebida = leia.next();
			System.out.println("informe o tanto de mls: ");
			mls = leia.nextFloat();
			System.out.println("Digite o valor: ");
			valor = leia.nextFloat();
			System.out.println("Digite a caracteristica (seco/suave/doce): ");
			caracteristica = leia.next();
			break;
			
		case 2:
			System.out.println("Lista: ");
			break;
		case 3:
			System.out.println("Atualizar dados :");
			
			break;
		case 4:
			System.out.println("Apagar conta");
					
			break;
		case 5:
			System.out.println("Obrigada! Volte sempre.");
			
		}
	}

}
