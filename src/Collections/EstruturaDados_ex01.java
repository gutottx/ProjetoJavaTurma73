package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDados_ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		int opcao = -1;

		System.out.println("*****************************");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("*****************************");

		while (opcao != 0) {
			System.out.println("Digite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome: ");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: ");
					System.out.println(fila);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Fila: ");
					System.out.println(fila.remove());
					System.out.println("O Cliente foi Chamado!");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Digite uma opção válida");
			}
		}
	}

}
