import java.util.Scanner;
public class retornarposicao {
    
   //Metodo de Busca para retornar a posicao.


            private static int busca(int x, int[] vet) {
                for ( int m = 0; m < vet.length; m++){ //------------------------ 2 + 2n
                    if (vet[m] == x)//Se o meu vetor na posicao i for igual a x. //---------------------------- n
                    return m; //---------------------------- n
                }
               return 0; //---------------------------- 1

    }

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);//---------------------------- 1
    int vetores[] = new int[3]; //---------------------------- 1
    int i = 0;//---------------------------- 1
        //Prencher o meu vetor
        while( i < 3){ //------------------------n
        System.out.println("Digite o " + (i + 1) + "o numero: " ); //---------------------------- 1
        vetores[i] =  ler.nextInt(); //---------------------------- 1
        i++; //------------------------n
        }

        System.out.println("Digite o número que deseja buscar: "); //---------------------------- 1
        int x = ler.nextInt(); //---------------------------- 1
        int aux = 0; //---------------------------- 1
        if( busca(x, vetores) != 0){ //------------------------n
            System.out.print("A Posição do valor procurado é: " + " " +busca(x, vetores)); //---------------------------- 1
        } else{
            System.out.print("O numero procurado: " +busca(x, vetores)+ " não pertence ao Vetor!"); //---------------------------- 1
        }

        //ordenando o Vetor
        // passo 2 - executado n vezes
        for(int j = 0; j < vetores.length; j++){//pecorrer a linha //------------------------ 2 + 2n
            //Esse laço  é executado n vezes para cada execução do passo 2, portanto n² vezes
            for(int k = 0; k < vetores.length; k++){//pecorrer a coluna //------------------------ 2 + 2n
                // passo 1
                if(vetores[j]< vetores[k]){//vamos fazer uma troca //------------------------n // executado toda vez
                    aux = vetores[j]; //------------------------n
                    vetores[j] = vetores[k]; //------------------------n
                    vetores[k] = aux; //------------------------n
                }

            }
    }
          
ler.close(); //---------------------------- 1
    }
}
//Funcao =4n +1 + 5 + n + 5 + n +2n + 2 + 2n + 2 + 3n= 15 + 13n