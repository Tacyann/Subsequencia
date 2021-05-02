

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] array = new int[5];
		int numPos = 2;

		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i + 1) + "o numero: ");
			array[i] = ler.nextInt();
		}

		imprimirCombinacoes(array, "", 0, array.length, numPos);
	}

	public static void imprimirCombinacoes(int[] array, String combinacoes, int i, int tamanhoVetor, int numPos) {
		if (numPos > tamanhoVetor) {
			return;
		}

		if (numPos == 0) {
			System.out.println(combinacoes);
			return;
		}

		for (int j = i; j < tamanhoVetor; j++) {
			imprimirCombinacoes(array, combinacoes + " " + (array[j]), j + 1, tamanhoVetor, numPos - 1);
		}

	}

}
