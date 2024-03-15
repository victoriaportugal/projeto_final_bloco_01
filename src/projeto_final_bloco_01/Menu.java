package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.Controller.BebidaController;
import projeto_final_bloco_01.model.Bebida;
import projeto_final_bloco_01.model.MilkShake;

public class Menu {

	public static void main(String[] args) {

		float valor;
		String nome_bebida, sabor_massa, cobertura;
		int opcao, quantidade, id;
		String temConfete;

		BebidaController controller = new BebidaController();

		Scanner leia = new Scanner(System.in);

		while (true) {

			System.out.println("************************************");
			System.out.println("                                    ");
			System.out.println("        DRINK PRA MAIS DE BOM       ");
			System.out.println("                                    ");
			System.out.println("************************************");
			System.out.println("      1- Cadastrar bebida:          ");
			System.out.println("      2- Listar todas as bebidas    ");
			System.out.println("      3- Atualizar bebidas:   ");
			System.out.println("      4- Apagar Conta               ");
			System.out.println("      5- Sair                       ");
			System.out.println("                                    ");
			System.out.println("************************************");
			System.out.println("       Entre na opção desejada      ");
			System.out.println("                                    ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				
				System.out.println("Digite o nome da Milkshake: ");
				leia.skip("\\R?");
				nome_bebida = leia.nextLine();
				System.out.println("informe a quantidade: ");
				quantidade = leia.nextInt();
				System.out.println("Digite o valor: ");
				valor = leia.nextFloat();
				System.out.println("Digite o sabor da massa: ");
				leia.skip("\\R?");
				sabor_massa = leia.nextLine();
				System.out.println("Digite o sabor cobertura: ");
				cobertura = leia.nextLine();
				System.out.println("Voce deseja confete (S/N)? ");
				temConfete = leia.nextLine();
				
			

				System.out.println("Seu pedido esta sendo preparado, obrigada!");
				System.out.println("");

				controller.cadastrar(new MilkShake(controller.adicionar(),valor, quantidade, nome_bebida, sabor_massa, cobertura, temConfete));
				break;

			case 2:
				System.out.println("Listar todas as bebidas: ");
				controller.lista();
				break;
			case 3:
				System.out.println("Atualizar lista: ");
				System.out.println("Digite o nº da bebida que voce deseja atualizar: ");
				id = leia.nextInt();
				var buscarBebida = controller.buscarNaCollection(id);
				if(buscarBebida != null) {
					System.out.println("Digite o nome da Milkshake: ");
					leia.skip("\\R?");
					nome_bebida = leia.nextLine();
					System.out.println("informe a quantidade: ");
					quantidade = leia.nextInt();
					System.out.println("Digite o valor: ");
					valor = leia.nextFloat();
					System.out.println("Digite o sabor da massa: ");
					leia.skip("\\R?");
					sabor_massa = leia.nextLine();
					System.out.println("Digite o sabor cobertura: ");
					cobertura = leia.nextLine();
					System.out.println("Voce deseja confete (s/n)? ");
					temConfete = leia.nextLine();
					
					controller.atualizar(new MilkShake(id, valor, quantidade, nome_bebida, sabor_massa, cobertura, temConfete));
				}
				break;
			case 4:
				System.out.println("Apagar conta");
				System.out.println("Digite o nº da bebida que voce deseja apagar: ");
				id = leia.nextInt();
				controller.apagar(id);

				break;
			case 5:
                System.out.println("Obrigada! Volte sempre.");
                return; 
            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
		

			}
		}
	}
}
