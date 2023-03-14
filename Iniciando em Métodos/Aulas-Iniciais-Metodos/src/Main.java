import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
        int custoFabrica = scanner.nextInt();
	    int porcentagemDistribuidor = scanner.nextInt();
	    int PercentualImpostos = scanner.nextInt();
        

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
            
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
      
 
        System.out.println(custoConsumidor);
        scanner.close();
	} 
    
} 
