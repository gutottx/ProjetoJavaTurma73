package lacosCondicionais;
import java.util.Scanner;
public class OperardorE {

	public static void main(String[] args) {
		int idade;
		boolean carteiraM;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		idade = input.nextInt();
		
		System.out.println("Tem carteira de habilitação?");
		carteiraM = input.nextBoolean();
		
		if (idade >= 18 && carteiraM == true) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir.");
		}
		
		input.close();
	} 

}
