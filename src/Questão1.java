import java.util.Scanner;
public class Questão1 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = numero.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = numero.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        numero.close();
    }
}