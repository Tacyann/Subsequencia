 
public class App {
    public static void main(String[] args) {

        int vetor[] = new int[10]; //---------------------------- 1

        for ( int i = 0 ; i < vetor.length; i ++){   //Preencher o vetor com elementos aleatorios.
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for ( int j  = 0 ; j <vetor.length; j ++){ 
            System.out.print(vetor[j] + " ");
    }

    //Heap
    int n = vetor.length;
    for ( int i  = n/2 - 1 ; i<=0; i ++){ 
        Heap(vetor, n, i);
    }

    System.out.println("\n\nQuase Ordenado");
    for ( int j  = 0 ; j <vetor.length; j ++){ 
        System.out.print(vetor[j] + " ");
    }

    //vou pegar o maior elemento e jogar pro fim.
    for ( int i  = n - 1 ; i > 0; i --){ 
        int aux = vetor[0];
        vetor[0] =  vetor[i];
        vetor[i] = aux;
        //toda vez que eu faço uma troca eu vou aplicar o Heap de novo para não bagunçar o vetor.
        Heap(vetor, i, 0);
    }


    System.out.println("\n\nOrdenado");
    for ( int j  = 0 ; j <vetor.length; j ++){ 
        System.out.print(vetor[j] + " ");
    }
}
private static void Heap(int[] vetor, int n, int i){
 int raiz = i;
 int esq = 2*i + 1;
 int dir = 2*i + 2;

 if(esq < n && vetor[esq] > vetor[raiz]) { // para não pegar um elemento para fora do vetor.
    raiz = esq;
}
if(dir < n && vetor[dir] > vetor[raiz]) { // para não pegar um elemento para fora do vetor.
    raiz = dir;
}

if(raiz != i) { 
    int aux = vetor[i];
    vetor[i] = vetor[raiz];
    vetor[raiz] = aux;

    Heap(vetor, n, raiz);
}

}
}
