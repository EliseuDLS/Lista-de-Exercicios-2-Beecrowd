import java.util.Scanner; 

public class Tabuada { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int k = 0;
        k = lerK(k);

        imprimirTabuada();
    }

    public static int lerK(int k){
        System.out.println("Digite um número para a tabuada: ");
        k = LER.nextInt();

        return k;
    }

    public static void imprimirTabuada(){

        for(int k=1; k<=10; k++){
            for(int i=0; i<=10; i++){
                int r = k * i;
                System.out.println(k + "x" + i + "=" + r);
            }
            System.out.println();
        }   
    }
}