import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome inválido. Deve ter mais de 3 caracteres.");
            }
        } while (nome.length() <= 3
                 
        do {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Deve estar entre 0 e 150.");
            }
        } while (idade < 0 || idade > 150);
        
        do {
            System.out.print("Digite seu salário (maior que 0): ");
            salario = scanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário inválido. Deve ser maior que 0.");
            }
        } while (salario <= 0);

        scanner.nextLine();
        
        do {
            System.out.print("Digite seu sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo inválido. Digite 'f' ou 'm'.");
            }
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite seu estado civil ('s' - solteiro, 'c' - casado, 'v' - viúvo, 'd' - divorciado): ");
            estadoCivil = scanner.nextLine().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Estado civil inválido. Digite 's', 'c', 'v' ou 'd'.");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\nInformações validadas com sucesso:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
