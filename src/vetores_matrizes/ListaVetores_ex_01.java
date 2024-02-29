package vetores_matrizes;
import java.util.Scanner;

public class ListaVetores_ex_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, i, numero, posicao;
		boolean numeroEncontrado = false;
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = input.nextInt();

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				System.out.println("O numero " + numero + " está localizado no índice " + posicao);
				numeroEncontrado = true;
				break;
			}

			input.close();
		}
			if (!numeroEncontrado) {
			System.out.println("Não foi encontrado!");
		}

	}

}
