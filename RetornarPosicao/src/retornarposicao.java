import java.util.Scanner;
public class retornarposicao {
    
   //Metodo de Busca para retornar a posicao.
            private static int busca(int x, int[] vet) {
                for ( int m = 0; m < vet.length; m++){
                    if (vet[m] == x)//Se o meu vetor na posicao i for igual a x.
                    return m;
                }
               return 0;

    }

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int vetores[] = new int[3];
    int i = 0;
        //Prencher o meu vetor
        while( i < 3){
        System.out.println("Digite o " + (i + 1) + "o numero: " );
        vetores[i] =  ler.nextInt();
        i++;
        }

        System.out.println("Digite o número que deseja buscar: ");
        int x = ler.nextInt();
        int aux = 0;
        if( busca(x, vetores) != 0){
            System.out.print("A Posição do valor procurado é: " + " " +busca(x, vetores));
        } else{
            System.out.print("O numero procurado: " +busca(x, vetores)+ " não pertence ao Vetor!");
        }
        //ordenando o Vetor
        for(int j = 0; j < vetores.length; j++){//pecorrer a linha
            for(int k = 0; k < vetores.length; k++){//pecorrer a coluna
                if(vetores[j]< vetores[k]){//vamos fazer uma troca
                    aux = vetores[j];
                    vetores[j] = vetores[k];
                    vetores[k] = aux;
                }

            }
    }
        
   
ler.close();
    }
}