package projeto;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int op = 6;

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

				break;

			case 2:
				System.out.println("Liste todos os títulos");

				break;

			case 3:
				System.out.println("Procurar o título");

				break;

			case 4:
				System.out.println("Apagar um título ");

				break;

			case 5:
				System.out.println("Obrigada por comprar conosco, até a próxima!");

			}

		} while (op != 6);
	}

}
