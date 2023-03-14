package main;
public class Main {

    public static void main(String [] args){
        Cavalo cavalo = new Cavalo("Marimbondo", "Baio", "Ingles", 300);

        System.out.println("Nome: "+cavalo.getNome());
        System.out.println("Cor: "+cavalo.getCor());
        System.out.println("Raça: "+cavalo.getRaca());
        System.out.println("Peso: "+cavalo.getPeso()+"Kg");

        String custoRacao = cavalo.custoRacaoCavalo(3.12, "mes");
        System.out.println(custoRacao);
    }
    
}
 