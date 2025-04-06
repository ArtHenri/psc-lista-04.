public class Populaçao {
    public static void main(String[] args) {
        
        double Ahabi=80.000,Bhabi=200.000;
        int anos=0;

        while(Ahabi<Bhabi){
           Ahabi += Ahabi*0.03;
           Bhabi += Bhabi*0.015;
           
           anos++;
        }
        System.out.println("Sao necessarios "+anos+" anos.");
        }       
    }