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
