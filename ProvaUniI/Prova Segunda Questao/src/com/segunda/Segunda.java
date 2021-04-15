
import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i + 1) + "o numero do array: ");
			array[i] = ler.nextInt();
		}
		
		System.out.print("Digite o valor de X: ");
		int x = ler.nextInt();
		
		somaElemArray(array, x);

	}

	public static void somaElemArray(int array[], int x) {
		System.out.println("Soma entre os elementos do vetor igual ao valor de X: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == x) {
					System.out.println(array[i] + " + " + array[j] + " =  " + x);
				}
			}
		}
	}

}
