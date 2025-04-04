import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome de usuario: ");
            String nome = sc.nextLine();
            System.out.println("Digite a senha: ");
            String senha = sc.nextLine();

            if (senha.equals(nome)) {
                System.out.println("Senha invalida");
                continue;
            } else {
                System.out.println("Senha valida");
                break;
            }
        }
        sc.close();        
    } 
}
