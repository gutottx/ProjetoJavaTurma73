package lacosCondicionais;
import java.util.Scanner;
public class operadorE2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.println("Difite a primeira nota");
		nota1 = input.nextFloat();
		
		System.out.println("Difite a primeira nota");
		nota2 = input.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Parabéns, aprovado(a).");
		}
		else if (media >=5) {
			System.out.println("Está de exame!");
			
	
			}else {
				System.out.println("Está reprovado(a)");
		} input.close();
		

	}

}
