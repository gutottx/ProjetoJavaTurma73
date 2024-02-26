package atividadesComplementares;
import java.util.Scanner;
public class Atividade3 {

		
	public static void main(String[] args) {
		int segundos;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira os segundos: ");
		segundos = input.nextInt();
		input.close();
			
			
		 	int horas = segundos / 3600;
	        int minutos = (segundos % 3600) / 60;
	        int segundoss = segundos % 60;
	        
	        System.out.printf("Valor Formatado: %d:%02d:%02d%n", horas, minutos, segundoss);
	}

}
