package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		int contador;
		String nome;
		Scanner leia = new Scanner(System.in);

		for (contador = 0; contador <= 2; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + (contador + 1) + "º nome é: " + nome);
			leia.close();
		} 

	}

}
