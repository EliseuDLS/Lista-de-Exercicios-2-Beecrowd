import java.util.Scanner; 

public class Beecrowd_Numeros_Impares { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;
        x = lerX(x);
        imprimirImpares(x);
    }

    public static int lerX(int x){
        x = LER.nextInt();

        return x;
    }

    public static void imprimirImpares(int x){
        for (int i = 1; i <= x; i++) {
            if (i%2!=0){
                System.out.println(i);
            }            
        }
    }
}