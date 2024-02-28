package laco_repeticao;
import java.util.Scanner;

public class LaçoDoWhile_ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero;
		int soma = 0;

		do {
			System.out.println("Digite um número inteiro: ");
			numero = input.nextInt();

			if (numero > 0) {
				soma += numero;

			}

		} while (numero != 0);
		input.close();
		System.out.println("O resultado soma dos inteiros: " + soma);
	}

}
