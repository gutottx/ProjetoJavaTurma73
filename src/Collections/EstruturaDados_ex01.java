package Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDados_ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		int opcao;

		System.out.println("*****************************");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("*****************************");

		do {
			System.out.println("Digite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.println("Digite o nome: ");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
			} else if (opcao == 2) {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: ");
					System.out.println(fila);
				}
			} else if (opcao == 3) {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Fila: ");
					System.out.println(fila.remove());
					System.out.println("O Cliente foi Chamado!");
				}
			} else {
				System.out.println("Programa Finalizado!");
			}
		} while (opcao != 0);

		scanner.close();
	}

}
