package introducao;
import java.util.Scanner;

public class atividade1 {
	
	public static void main(String[] args) {
			
		float salario;
		float abono;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o seu salario: ");
		salario = input.nextFloat();
		
		System.out.println("Insira o seu abono: ");
		abono = input.nextFloat();
		

		System.out.println("Seu novo salário é de: R$" + (salario + abono));

	}

}
