import java.util.Scanner;
public class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        int[] vetornotas = new int[5];

        for(int i = 0;i <5; i++){
            System.out.println("Digite o numero "+(i+1)+": ");
            vetornotas[i]=sc.nextInt();
        }
        System.out.println("A soma dos numeros é: "+(vetornotas[0]+vetornotas[1]+vetornotas[2]+vetornotas[3]+vetornotas[4])); 
        
        System.out.println("A media do aluno é: "+(vetornotas[0]+vetornotas[1]+vetornotas[2]+vetornotas[3]+vetornotas[4])/5);
        
    }
}