package laco_repeticao;
import java.util.Scanner;

public class LaçoFor_ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		int numimp = 0;
		int numpares = 0;
		int i;

		for (i = 1; i <= 10; i++) {
			int numero = i;
			System.out.println("Digite o " + numero + "º numero");
			num = input.nextInt();
			input.close();
			
			if (num % 2 == 0) {
				numpares++;
				
			} else {
				numimp++;
			}
		}
		System.out.println("Total de números pares: " + numpares);
		System.out.println("Total de números ímpares: " + numimp);
	}
}
