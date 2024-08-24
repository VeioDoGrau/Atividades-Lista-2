import java.util.Scanner;
public class Questão3 {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite sua nota:");

        double nota1 = nota.nextDouble();
        double nota2 = nota.nextDouble();
        double nota3 = nota.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Excelencia");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        nota.close();
    }
}