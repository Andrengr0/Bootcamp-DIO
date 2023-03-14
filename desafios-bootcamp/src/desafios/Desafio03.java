package desafios;
import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
          double indice = i;
          h += 1 / indice;
      }

     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
     System.out.println(String.format("%.0f",h));
     sc.close();
   }
   
}