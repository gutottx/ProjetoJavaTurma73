package laco_repeticao;
import java.util.Scanner;

public class LaçoFor_ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = input.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println("O intervalo informado é inválido - Programa encerrado. ");
			System.exit(0);
		}

		System.out.println("São múltiplos de 3 e 5 no intervalo entre " + num1 + " e " + num2 + ":");
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}
