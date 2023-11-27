package projeto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float preco;

		int op = 6;

		do {
			System.out.println("----------------------------------------------------------");
			System.out.println("\t\t LIVRARIA SONHO\n                                     ");
			System.out.println("\n 1- Adicionar um novo título                            ");
			System.out.println("\n 2- Listar todos os títulos                             ");
			System.out.println("\n 3- Procurar um título                                  ");
			System.out.println("\n 4- Apagar um título                                    ");
			System.out.println("\n 6- Sair                                                ");
			System.out.println("----------------------------------------------------------");
			op = input.nextInt();

			switch (op) {

			case 1:
				input.nextLine();
				System.out.println("Adicione um título: ");
				String titulo = input.nextLine();
				if (!titulo.isEmpty()) {
					System.out.println("Título adicionada");
				} else {
					System.out.println("Erro ao adicionar título");
				}
				break;

			case 2:
				
				System.out.println("Liste todos os títulos");
				
				break;

			case 3:
				System.out.println("Procurar o título");
				
				break;
			}

		} while (op != 6);
	}

}
