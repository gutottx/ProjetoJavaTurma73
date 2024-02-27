package lacosCondicionais;
import java.util.Scanner;
public class Lista2_ex_02 {

	public static void main(String[] args) {

		String nome;
		int codigo;
		float salario;
		float salarioReajustado;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número do seu cargo");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		codigo = input.nextInt();
		
		switch(codigo){
	    case 1:
	    	System.out.println("Digite seu nome.");
			nome = input.next();
	    	System.out.println("Cargo escolhido: Gerente");
	    	float reajuste = 10.0f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste * salario);
	    	System.out.println(nome +" seu novo salário de gerente é de: R$" + salarioReajustado);
	        break;
	        
	    case 2:
	    	float reajuste2 = 0.07f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste2 * salario);
	    	System.out.println("Seu novo salário é de: R$" + salarioReajustado);
	        break;
	        
	    case 3:
	    	float reajuste3 = 0.09f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste3 * salario);
	    	System.out.println("Seu novo salário é de: R$" + salarioReajustado);
	        break;
	        
	    case 4:
	    	float reajuste4 = 0.06f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste4 * salario);
	    	System.out.println("Seu novo salário é de: R$" + salarioReajustado);
	        break;
	    case 5:
	    	float reajuste5 = 0.05f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste5 * salario);
	    	System.out.println("Seu novo salário é de: R$" + salarioReajustado);
	    	break;
	    case 6:
	    	float reajuste6 = 0.08f;
	    	System.out.println("Digite seu salário");
	    	salario = input.nextFloat();
	    	salarioReajustado = salario + (reajuste6 * salario);
	    	System.out.println("Seu novo salário é de: R$" + salarioReajustado);
	    	break;
	    default:
	      System.out.println("Digite um cargo válido.");
		
		input.close();
		
	}
}}
