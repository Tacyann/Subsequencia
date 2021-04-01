public class MaiorValor {

	public static void main (String[] args) {

		//int array[] = { -2, 11, -4, 13, -5, 2 };
		int array[] = { 1, -3, 4, -2, -1, 6 }; //---------------------------- 1
		int primeiroIndice = 0;//-------------------------------------------  1
		int segundoIndice = 0;//--------------------------------------------  1

		int soma = 0, aux = 0; //-------------------------------------------- 2

		//Preencher o vetor.
		for (int i = 0; i < array.length; i++) {//------------------------ 2 + 2n
			if (array[i] > aux + array[i]) {//----------------------------------------|
				primeiroIndice = i; //----------------------------------------n       |----- n + 3
				aux = array[i];//---------------------------------------------n       |
			} else {// ---------------------------------------------------------------|
				aux = aux + array[i]; //--------------------------------------n
			}
			if (soma < aux) { //--------------------------------------------- n
				soma = aux; //----------------------------------------------- n
				segundoIndice = i; //---------------------------------------- n
			}
		} 

		System.out.print("A sequencia que possui o maior valor  a que corresponde do [" + primeiroIndice + "] ao ["
				+ segundoIndice + "] elemento, cuja soma " + "  " + soma);//-------1

	}

}

//Funcao = 5+ 2+ 2n + n + 3 +6n + 1 = 10 + 9n