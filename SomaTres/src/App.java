public class App {

    public static void main(String[] args)  {
		int array[] = { 1, 2, 3, 4 }; 
		int soma = 0;
		int somar = 0;
		// 1+ 2 + 3 = 6
		// 2 + 3 + 4 = 9 - esse é o resultado
		//int resultado = somatoria(array,3);
		for ( int i = 0; i < ((array.length) - 1); i ++){
			soma = soma + array[i];
		}
		for ( int j = 1; j < array.length; j ++){
			somar = somar + array[j];
		}
		if( soma < somar){
		System.out.println("O Maior valor resultante da soma entre 3 números é :"+ "  " + somar);
		} else 
		System.out.println((soma));

		/*
		//int resultado = somatoria(array,3);
	private static int somatoria(int[] array, int i) {
		if(i < array.length){//Se for menor eu calculo a soma.
			return array[i] + somatoria(array, i + 1);
		}
		else return 0;
	}*/
	}
}