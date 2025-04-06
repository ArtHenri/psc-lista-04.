import java.util.Scanner;
public class PopulaçaoVarialvel {
    public static void main(String[] args) {

        double Ahabi=0.0,Bhabi=0.0;
        int anos=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Digite o numero de habitantes no pais A:");
        Ahabi=sc.nextDouble();

        System.out.println("Digite o numero de habitantes no pais B:");
        Bhabi=sc.nextDouble();

        System.out.println("Digite a taxa de crecimento de A");
        Double Ataxa=sc.nextDouble();

        System.out.println("Digite a taxa de crecimento de B");
        Double Btaxa=sc.nextDouble();
        
        while(Ahabi<Bhabi){
           Ahabi += Ahabi*(Ataxa/100);
           Bhabi += Bhabi*(Btaxa/100);
           
           anos++;
        }
        System.out.println("Sao necessarios "+anos+" anos.");
        }       
    }