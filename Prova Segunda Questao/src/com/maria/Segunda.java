

import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);//-----1
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i + 1) + "o numero do array: ");//-----1
			array[i] = ler.nextInt();
		}
		
		System.out.print("Digite o valor de X: ");//-----1
		int x = ler.nextInt();//-----1
		
		somaElemArray(array, x);//-----n1

	}

	public static void somaElemArray(int array[], int x) {
		System.out.println("Soma entre os elementos do vetor igual ao valor de X: ");//-----1

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == x) {
					System.out.println(array[i] + " + " + array[j] + " =  " + x);
				}
			}
		}
	}

}
//4 + 2 + 2n + 2 + n + 2 + 2 + 2n + 2 + 2n + n = 14 + 8n.