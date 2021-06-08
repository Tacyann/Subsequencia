
class InsertionSort {
	
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {//------- 2 + 2n
			int key = arr[i];//-------n 
			int j = i - 1;//-------n 

			while (j >= 0 && arr[j] > key) {//------- 2 + 2n
				arr[j + 1] = arr[j];//-------n 
				j = j - 1;//-------n 
			}
			arr[j + 1] = key;//-------n 
		}
	}
	//2 + 2n + n + n + 2 + 2n + n + n = 4 + 8n

	/* Imprimi um vetor de tamanho n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}
} 
