package vetores_matrizes;
import java.util.Arrays;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;

		String cachorros[] = new String[3];

		for (i = 0; i < 3; i++) {
			System.out.println("Digite um nome");
			cachorros[i] = input.nextLine();
		}
		
		System.out.println(Arrays.toString(cachorros));
	}

}


