package lacosCondicionais;
import java.util.Scanner;
public class Lista1_ex_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número");
			num = input.nextInt();
			
			if(num % 2 == 0 && num >=0 ){
				System.out.println("O número é par e positivo.");
			} else if(num % 2 == 0 && num < 0){
				System.out.println("O número é par e negativo.");
			}else if(num % 3 == 1 && num >=0){
				System.out.println("O número é impar e positivo.");
			} else {
				System.out.println("O número é impar e negativo.");
			}
			
		
		
		
		
		
		
		
		input.close();
	}
}
