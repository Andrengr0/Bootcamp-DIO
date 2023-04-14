// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class DIO {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

    double IP_8, IP_18, IP_28;
    IP_8 = 8d / 100d;
    IP_18 = 18d / 100d;
    IP_28 = 28d / 100d;

    if(renda > 4500d){
        imposto = (1000d * IP_8) + (1500d * IP_18) + ((renda - 4500d) * IP_28);
        System.out.println(String.format("%.2f", imposto));
    } else if(renda > 3000d){
        imposto = (1000d * IP_8) + ((renda - 3000d) * IP_18);
        System.out.println(String.format("%.2f", imposto));
    } else if(renda > 2000d){
        imposto = (renda - 2000d) * IP_8;
        System.out.println(String.format("%.2f", imposto));
    } else{
        System.out.println("Isento");
    }


    leitor.close();
    }
	
}