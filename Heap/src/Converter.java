// converter min Heap em max Heap
public class Converter {

	public static void MaxHeap(int vetor[], int i, int n){
		int esq = 2*i + 1;
		int dir = 2*i + 2;
		int maior = i;
		if (esq < n && vetor[esq] > vetor[i])// para não pegar um elemento para fora do vetor.
			maior = esq;
		if (dir < n && vetor[dir] > vetor[maior])// para não pegar um elemento para fora do vetor.
			maior = dir;
		if (maior != i)
		{
			// trocar vetor[i] and vetor[maior]
			//vou pegar o maior elemento e jogar pro fim.
			int temp = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = temp;
			//toda vez que eu faço uma troca eu vou aplicar o Heap de novo para não bagunçar o vetor.
			MaxHeap(vetor, maior, n);
		}
	}

	// criar o heap máximo
	static void converterMaxHeap(int vetor[], int n)
	{

		for (int i = (n-2)/2; i >= 0; --i)
			MaxHeap(vetor, i, n);
	}


	static void printvetor(int vetor[], int size)
	{
		for (int i = 0; i < size; ++i)
			System.out.print(vetor[i]+" ");
	}
	

	public static void main (String[] adirgs)
	{
		// vetor Heap
		int vetor[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
		int n = vetor.length;

		System.out.print("Min Heap vetor : ");
		printvetor(vetor, n);

		converterMaxHeap(vetor, n);

		System.out.print("\nMax Heap vetor : ");
		printvetor(vetor, n);
	}
}


