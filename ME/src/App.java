
public class App {
    public static void imprimirSubsequencia( int vet[]){
        int maxSoma = Integer.MIN_VALUE;
        int soma= 0;
    for(int i=0;i<vet.length;i++){
        soma = soma + vet[i];

        if( maxSoma < soma){
            maxSoma = soma;
        }   

    if(soma < 0){
        soma=0;
    }
}
    System.out.print(maxSoma);
}
  
    public static void main(String[] args) throws Exception {
        int [] vet = new int [9]; 
        vet[0]=-2;
        vet[1]= 1;
        vet[2]= -3;
        vet[3]= 4;
        vet[4]=-1;
        vet[5]= 2;
        vet[6]= 1;
        vet[7]= -5;
        vet[8]= 4;
        imprimirSubsequencia(vet);        
}
}
