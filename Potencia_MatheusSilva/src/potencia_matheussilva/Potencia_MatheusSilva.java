
package potencia_matheussilva;
import java.util.Scanner;
public class Potencia_MatheusSilva {

    
    public static void main(String[] args) 
    {
       Scanner entrada;
       double i, num;
       entrada = new Scanner(System.in);
       
       System.out.print("Digite um Numero:");
       num = entrada.nextDouble();
       for (i=0;i<=15;i++)
       {
          System.out.println(Math.pow(num,i));
          
         
       }
    }
    
}
