package laco_repeticao;
import java.util.Scanner;

public class LaçoWhile_ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade = 0;
		int menor21 = 0;
		int maior50 = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade");
			idade = input.nextInt();

			if (idade > 50) {
				maior50++;
			} else if (idade < 21) {
				menor21++;
			}

		}
		input.close();
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

	}

}
