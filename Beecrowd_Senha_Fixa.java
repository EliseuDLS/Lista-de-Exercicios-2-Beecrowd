import java.util.Scanner; 

public class Beecrowd_Senha_Fixa { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int senha = 0;
        imprimirSenha();
    }

    public static void imprimirSenha(){
        int senha = 0;

        do{
            senha = LER.nextInt();
            
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }

        } while (senha != 2002);
            System.out.println("Acesso Permitido");
    } 
}