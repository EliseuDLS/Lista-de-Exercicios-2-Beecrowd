import java.util.Scanner; 

public class Beecrowd_Numeros_Positivos { 
final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        float x = 0f;
        int qntdPos = 0;
        int i = 0;

        do{ //leia x e, se ele for positivo adicione um, mas isso enquanto i for menor que 6 e, após, imprima.
            x = lerX();

            if(verificarQntdPos(x) == true){
                qntdPos++; //adiciona o número positivo
            }

            i++; //pula para o próximo
            
        } while (i < 6); 

        imprimir(qntdPos);
    }

    public static float lerX(){
        float x = 0f;

        do{
            x = LER.nextFloat();
        } while (x == 0); //lê x, se ele for 0, pede para o usuario digitar novamente, pois o valor precisa ser maior que 0

        return x;
    }

    public static boolean verificarQntdPos(float x){ //se x for maior q 0 retorna true, senão false
        if(x > 0){
            return true;
        } else {
            return false;
        }
    }

    public static void imprimir(int qntdPos){ //imprime
        System.out.println(qntdPos + " valores positivos");
    }
}
