import java.util.Scanner;

public class IntervaloEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        if (maior - menor <= 1) {
            System.out.println("Não há números inteiros entre " + num1 + " e " + num2 + ".");
        } else {
            System.out.println("Números inteiros entre " + num1 + " e " + num2 + ":");
            for (int i = menor + 1; i < maior; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
