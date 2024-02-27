package lacosCondicionais;
import java.util.Scanner;
public class Lista1_ex_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A,B,C;
		
		System.out.println("Digite o valor A");
		A =  input.nextInt();
		
		System.out.println("Digite o valor B");
		B =  input.nextInt();
		
		System.out.println("Digite o valor C");
		C =  input.nextInt();
		
		if (A + B > C) {
			
		System.out.printf("A soma de %d + %d é maior que %d", A,B,C);
		}
		
		else if (A + B < C) {
			
			System.out.printf("A soma de %d + %d é menor que %d", A,B,C);
			}
			
			else {
				
				System.out.printf("A soma de %d + %d é igual a %d", A,B,C);
				};
		input.close();		
	}
}
