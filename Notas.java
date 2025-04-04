import java.util.Scanner;
public class Notas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("Informe uma nota de 0 a 10: ");
        int nota = sc.nextInt();
        
        if(nota < 0 || nota > 10){
            System.out.println("Nota inválida");
            continue;
        }else{
            System.out.println("Nota válida");
        }
        break;
        }
        sc.close();
    }
}
