import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
               
    String vertebrado, invertebrado, ave, mamifero, inseto, anelideo, carnivoro, onivoro, herbivoro, hematofago;
    vertebrado = "vertebrado";
    invertebrado = "invertebrado";
    ave = "ave";
    mamifero = "mamifero";
    inseto = "inseto";
    anelideo = "anelideo";
    carnivoro = "carnivoro";
    onivoro = "onivoro";
    herbivoro = "herbivoro";
    hematofago = "hematofago";
               
    if(AN1.equals(vertebrado)){
      if(AN2.equals(ave)){
        if(AN3.equals(carnivoro)){
          System.out.println("aguia");
        }else{
            System.out.println("pombo");
        }
      }else{
        if(AN3.equals(onivoro)){
          System.out.println("homem");
        }else{
          System.out.println("vaca");
        }
      }
    }else{
      if(AN2.equals(inseto)){
        if(AN3.equals(hematofago)){
          System.out.println("pulga");
        }else{
            System.out.println("lagarta");
        }
      }else{
        if(AN3.equals(hematofago)){
          System.out.println("sanguessuga");
        }else{
          System.out.println("minhoca");
        }
      }
    }
    sc.close();
	}

}
