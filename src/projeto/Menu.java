package projeto;

import java.util.Scanner;

import projeto.controller.obraController;
public class Menu {

	public static void main(String[] args) {
		
		obraController livro = new obraController();

		Scanner input = new Scanner(System.in);
		
		String titulo;

		int op = 0;

		do {
			System.out.println("----------------------------------------------------------");
			System.out.println("\t\t LIVRARIA SONHO\n                                     ");
			System.out.println("\n 1- Adicionar um novo título                            ");
			System.out.println("\n 2- Listar todos os títulos                             ");
			System.out.println("\n 3- Procurar um título                                  ");
			System.out.println("\n 4- Apagar um título                                    ");
			System.out.println("\n 5- Sair                                                ");
			System.out.println("----------------------------------------------------------");
			op = input.nextInt();
			
			

			switch (op) {

			case 1:
				System.out.println("Adicione um título: ");
				titulo = input.next();

				keypress();
				break;

			case 2:
				System.out.println("Liste todos os títulos");
				livro.listarTitulos();
				keypress();

				break;

			case 3:
				System.out.println("Procurar o título");
				titulo= input.next();
				
				livro.procurarPorTitulo(titulo);
				
				keypress();
				break;

			case 4:
				System.out.println("Apagar um título ");
				titulo= input.next();
				
					livro.deletarTitulo(titulo);
					keypress();
				break;

			case 5:
				System.out.println("Aqui você começa a sonhar e não para mais, volte sempre");
				
				keypress();

				break;

			}

		} while (op != 5);
	}

	private static void keypress() {
		// TODO Auto-generated method stub
		
	}

}
