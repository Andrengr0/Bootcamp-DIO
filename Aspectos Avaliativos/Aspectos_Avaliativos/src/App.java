import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("De  0 a 10, informe a nota de avaliação para o seguinte item: O aluno descreve seu ponto de forma crítica, com riqueza de detalhes?");
        double nota1 = leitor.nextDouble();

        System.out.println("De  0 a 10, informe a nota de avaliação para o seguinte item: O aluno realiza pesquisa acerca do assunto?");
        double nota2 = leitor.nextDouble();

        System.out.println("De  0 a 10, informe a nota de avaliação para o seguinte item: O aluno age de maneira ética?");
        double nota3 = leitor.nextDouble();

        System.out.println("De  0 a 10, informe a nota de avaliação para o seguinte item: O aluno tenta fazer seu trabalho com boa estética?");
        double nota4 = leitor.nextDouble();

        System.out.println("De  0 a 10, informe a nota de avaliação para o seguinte item: O aluno demonstra curiosidade no assunto? faz perguntas?");
        double nota5 = leitor.nextDouble();


        Double media = (nota1 + nota2 + nota3+ nota4 + nota5) / 5;

        System.out.println("A nota média dos apectos avaliativos do aluno é: "+String.format("%.1f", media));

        leitor.close();
    }
}
