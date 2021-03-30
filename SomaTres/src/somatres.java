public class Somatres {

    public static void main(String[] args)  {
		int array[] = { 1, 2, 3, 4 }; //---------------------------- 1
		int soma = 0;//---------------------------- 1
		int somar = 0;//---------------------------- 1
		// 1+ 2 + 3 = 6
		// 2 + 3 + 4 = 9 - esse é o resultado
		//int resultado = somatoria(array,3);
		for ( int i = 0; i < ((array.length) - 1); i ++){//------------------------ 2 + 2n
			soma = soma + array[i];//---------------------------------------------n 
		}
		for ( int j = 1; j < array.length; j ++){//------------------------ 2 + 2n
			somar = somar + array[j];//---------------------------------------------n 
		}
		if( soma < somar){ //--------------------------------------------- n
		System.out.println("O Maior valor resultante da soma entre 3 números é :"+ "  " + somar);//-------1
		} else 
		System.out.println((soma));//-------1

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
//Funcao = 3 + 2 + 2n + 2 + 2n +3n + 2 = 9 + 9n