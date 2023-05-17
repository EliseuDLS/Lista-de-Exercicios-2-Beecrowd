import java.util.Scanner; 

public class Beecrowd_Tabuada { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int N = 0;
        N = lerN(N);

        imprimirTabuada();
    }

    public static int lerN(int N){

        do{
            N = LER.nextInt();
        } while (N < 2 && N > 1000); //pede para o usuario digitar novamente se ele digitar 0, pois o valor precisa ser maior que 0

        return N;
    }

    public static void imprimirTabuada(){

        for(int j=1; j<=10; j++){
            for(int i=0; i<=10; i++){
                int r = j * i;
                System.out.println(j + "x" + i + "=" + r);
            }
            System.out.println();
        }   
    }
}