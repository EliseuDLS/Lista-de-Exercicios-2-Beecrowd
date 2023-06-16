import java.util.Scanner; 

public class Beecrowd_Numeros_Positivos { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        float x = 0f;
        int qntdPos = 0;
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

    public static void imprimir(int qntdPos){
        System.out.println(qntdPos + " valores positivos");
    }
}
