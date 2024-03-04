package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList_ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite as cores");
			String cor = input.nextLine();
			cores.add(cor);

		}

		System.out.println("Listar todas as cores: " + cores);

		Collections.sort(cores);
		System.out.println("Ordenar as cores: " + cores);
		
	}

}
