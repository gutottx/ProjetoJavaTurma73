package vetores_matrizes;

public class ListaMatrizes_ex01 {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int iLinha = 0; iLinha < 3; iLinha++) {

			for (int iColuna = 0; iColuna < 3; iColuna++) {
				//System.out.println("O valor na posição [" + iLinha + "][" + iColuna + "] é: " + matriz[iLinha][iColuna]);

			}
			
		}System.out.println("Elementos da Diagonal Principal");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");

		}
		System.out.println("\n\nElementos da Diagonal Secundária");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
		}
		int somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);

		int somaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	}
}