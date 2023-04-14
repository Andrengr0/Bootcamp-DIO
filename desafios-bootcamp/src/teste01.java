import java.io.IOException;
import java.util.Scanner;

public class teste01{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double soma;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.

        if((A+B) > C && (A+C) > B && (B+C) > A){
            soma = A + B + C;
			System.out.println("Perimetro = "+String.format("%.1f", soma));
        } else{
			double areaTrapezio = ((A+B) * C) / 2;
			System.out.println("Area = "+String.format("%.1f", areaTrapezio));
		}

        
		
		
	}
	
}