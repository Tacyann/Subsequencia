public class App {
    public static void calcularSubsequencia( int vet[]){
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
        int [] vet = new int [6]; 
        vet[0]=-2;
        vet[1]= 11;
        vet[2]= -4;
        vet[3]= 13;
        vet[4]= -5;
        vet[5]= 2;
        System.out.print("A soma do valor da maior Subsequencia é: ");
        calcularSubsequencia(vet) ;        
}
}
