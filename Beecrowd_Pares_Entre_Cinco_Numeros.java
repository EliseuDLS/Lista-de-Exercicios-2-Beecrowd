import java.util.Scanner; 

public class Beecrowd_Pares_Entre_Cinco_Numeros { 
    
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
    
        float x = 0f;
        int qntdPares = 0;
        int i = 0;
    
        do{
            x = lerX();
    
            if(verificarQntdPares(x)){
                qntdPares++;
            }
    
            i++; 
                
        } while (i < 5); 
    
        imprimir(qntdPares);

        }
    
    public static float lerX(){
        float x = 0f;
    
        do{
            x = LER.nextFloat();
        } while (x == 0);
    
        return x;

        }
    
    public static boolean verificarQntdPares(float x){
        if(x%2==0){
            return true;
        } else {
            return false;
        }
    }
    
    public static void imprimir(int qntdPares){
        System.out.println(qntdPares + " valores pares");
    }
}