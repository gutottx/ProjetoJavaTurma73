package introducao;
import java.util.Scanner;


public class atividade2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira a sua 1º nota: ");
		nota1 = input.nextFloat();
		System.out.println("Insira a sua 2º nota: ");
		nota2 = input.nextFloat();
		System.out.println("Insira a sua 3º nota: ");
		nota3 = input.nextFloat();
		System.out.println("Insira a sua 4º nota: ");
		nota4 = input.nextFloat();
		
		float mediafinal = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("Sua media final é " + mediafinal);

	}

}
