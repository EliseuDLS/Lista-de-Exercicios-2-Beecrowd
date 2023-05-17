import java.util.Scanner; 

public class Beecrowd_Numeros_Pares { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        imprimirPares();
    }

    public static void imprimirPares(){
        for (int i = 2; i <= 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }            
        }
    }
}