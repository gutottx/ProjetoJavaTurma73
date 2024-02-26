package atividadesComplementares;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valor = input.nextInt();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("\n" + valor);

        for (int cedula : cedulas) {
            int qtdNotas = valor / cedula; 
         
           // Atualiza o valor restante subtraindo o valor das notas usadas
           // usando o operador % (resto da divisão).
            valor %= cedula; 
            
            //Exibe a quantidade de notas 
            //necessárias para a cédula atual usando formatação de string (printf). 
            //%d é substituído pelo valor de qtdNotas e cedula na mensagem formatada.
            System.out.printf("%d nota(s) de R$ %d,00%n", qtdNotas, cedula);
        }
        input.close();
	}
}
