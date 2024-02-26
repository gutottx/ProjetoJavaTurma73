package introducao;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		float salario;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o seu salario: ");
		salario = input.nextFloat();
		
		System.out.println("Insira o seu adicional noturno: ");
		adicionalNoturno = input.nextFloat();
		
		System.out.println("Insira o seu adicional horas extras: ");
		horasExtras = input.nextFloat();
		
		System.out.println("Insira os seus descontos : ");
		descontos = input.nextFloat();
		
		float salarioLiquido = salario + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.println("Seu salário líquido é de: R$" + salarioLiquido );

	}

}
