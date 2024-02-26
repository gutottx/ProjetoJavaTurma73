package atividadesComplementares;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		float a,b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o 1º número: ");
		a = input.nextFloat();
		
		System.out.println("Insira o 2º número: ");
		b = input.nextFloat();	
		
		float soma = a + b;
		float diferenca = a - b;
		float multiplicacao = a * b;
		float divisao = a/b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Soma: " + diferenca);
		System.out.println("Soma: " + multiplicacao);
		System.out.println("Soma: " + divisao);
		input.close();
	}

}
