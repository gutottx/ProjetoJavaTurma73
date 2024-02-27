package lacosCondicionais;
import java.util.Scanner;
public class Interativo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Digite um valor para x");
		x = input.nextInt();
		
		System.out.println("Digite um valor para y");
		y = input.nextInt();
		
		if (x > y) {
			System.out.println("X maior que Y");}
			
			else if (x == y ) {
				System.out.println("Não tem maior");
				
			} else {
				System.out.println("y maior que x");}
			input.close();
		}
	}
		
			
		
	


