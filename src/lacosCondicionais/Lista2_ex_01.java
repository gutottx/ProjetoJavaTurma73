package lacosCondicionais;
import java.util.Scanner;
public class Lista2_ex_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int option;
		int quantidadeItem;

		System.out.println("Menu");
		System.out.println("Digite o código do produto.");
		System.out.println("1 - Cachorro Quente R$10,00.");
		System.out.println("2 - X-Salada R$15,00.");
		System.out.println("3 - X-Bacon R$18,00.");
		System.out.println("4 - Bauru R$12,00.");
		System.out.println("5 - Refrigerante R$8,00.");
		System.out.println("6 - Suco de laranja R$13,00.");
		option = input.nextInt(); 
		
		System.out.println("Digite a quantidade do produto.");
		quantidadeItem = input.nextInt();
		
		float cachorroquente = quantidadeItem *10.00F;
		float xSalada = quantidadeItem * 15.00F;
		float xBacon = quantidadeItem * 18.00F;
		float bauru = quantidadeItem * 12.00F;
		float refrigerante = quantidadeItem * 8.00F;
		float sucoLaranja = quantidadeItem * 13.00F;
		
		switch (option) {
		case 1:
			System.out.println(quantidadeItem + " unidades de [Cachorro Quente], Valor Total: " + cachorroquente);
			break;
			
		case 2:
			System.out.println(quantidadeItem + " unidades de [x-Salada], Valor Total: " + xSalada);
			break;
			
		case 3:
			System.out.println(quantidadeItem + " unidades de [x-Bacon], Valor Total: " + xBacon);
			break;
			
		case 4:
			System.out.println(quantidadeItem +" unidades de [Bauru], Valor Total: " + bauru);
			break;
			
		case 5:
			System.out.println(quantidadeItem + " unidades de [Refrigerante], Valor Total: " + refrigerante);
			break;
			
		case 6:
			System.out.println(quantidadeItem +" unidades de [Suco de Laranja], Valor Total: " + sucoLaranja);
			break;
			
			default:
			System.out.println("Opção digitada não existe!");
			
		}input.close();
	}
}



