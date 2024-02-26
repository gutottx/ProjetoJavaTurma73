package introducao;
import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		String nome;
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		System.out.println("Bom dia, " + nome);
		
		
	}

}
