
class MergeSort
{
	// Mesclar.
	// Definindo o 1 Vetor arr[l..m]
	// Definindo o 2 Vetor arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Juntar os dois subarrays que seram mescados.
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Criando arrays temporarios */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copiando os dados para matrizes temporárias*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Mesclando as Matrizes temporarias */

		// Definindo os indices
		int i = 0, j = 0;

		// Índice inicial da matriz de subarry mesclada
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copia os elementos restantes  L[] se houver */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copia os elementos restantes  R[] se houver */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Função principal que classifica arr [l..r] usando
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Encontrar o ponto médio
			int m =l+ (r-l)/2;

			// Classificando a primeira e segunda metades
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Mesclar as metades classificadas
			merge(arr, l, m, r);
		}
	}

	/* Imprimir um array de tamanho n * */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nArray Ordenada");
		printArray(arr);
	}
}

