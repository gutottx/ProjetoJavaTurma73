package atividadesComplementares;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		float raio;
		float pi = 3.14159f;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número: ");
		raio = input.nextFloat();
		float area = pi * raio *2;
		System.out.printf("A área da circunferência é: %.4f" , area);
		input.close();
	}

}
