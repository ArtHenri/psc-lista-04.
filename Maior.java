import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero=0;
        int maior=0;
        
        for(int i= 1 ; i <=5; i++){
            System.out.println("Digite o "+i);
            numero=sc.nextInt();

            if(i == 1 || numero>maior){
                maior = numero;
            }
            System.out.println("O maior numero e "+maior);
        }
    }
    
}
