import java.io.IOException;
import java.util.Scanner;

public class teste01 {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x = 0;
     
     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (int i=1; i<=6; i++) {
        	double numero = leitor.Double();
            if(numero > 0){
                cont++;
                x += numero;
            }
        }

        media = x / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        leitor.close();
        } 
}
	
