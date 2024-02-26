package introducao;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
			float n1;
			float n2;
			float n3;
			float n4;
			
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o 1º número: ");
		n1 = input.nextFloat();
		
		System.out.println("Insira o 2º número: ");
		n2 = input.nextFloat();
		
		System.out.println("Insira o 3º número: ");
		n3 = input.nextFloat();
		
		System.out.println("Insira o 4º número: ");
		n4 = input.nextFloat();
		
		float calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença é: " + calculo);
	}

}
