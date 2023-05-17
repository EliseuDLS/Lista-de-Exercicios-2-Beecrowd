import java.util.Scanner; 

public class Beecrowd_Positivos_e_Media { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        float x = 0f;
        int qntdPos = 0;
        float media = 0f;
        int i = 0;

        do{
            x = lerX();

            if(verificarQntdPos(x)){
                qntdPos++;
            }

            i++; 
            
        } while (i < 6); 

        imprimir(qntdPos);
    }

    public static float lerX(){
        float x = 0f;

        do{
            x = LER.nextFloat();
        } while (x == 0); //pede para o usuario digitar novamente se ele digitar 0, pois o valor precisa ser maior que 0

        return x;
    }

    public static boolean verificarQntdPos(float x){
        if(x > 0){
            return true;
        } else {
            return false;
        }
    }

    public static 

    public static void imprimir(int qntdPos, float media){
        System.out.println(qntdPos + " valores positivos");
        System.out.println(media);
    }
}

import java.util.Scanner;

public class Beecrowd_Positivos_e_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = scanner.nextDouble();

            if (valor > 0) {
                contadorPositivos++;
                somaPositivos += valor;
            }
        }

        System.out.println(contadorPositivos + " valores positivos");

        if (contadorPositivos > 0) {
            double mediaPositivos = somaPositivos / contadorPositivos;
            System.out.printf("%.1f\n", mediaPositivos);
        } else {
            System.out.println("Não foram digitados valores positivos.");
        }
    }
}