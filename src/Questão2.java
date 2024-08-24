import java.util.Scanner;
public class Questão2 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        double numero1 = numero.nextDouble();

        if (numero1 >= 0) {
            System.out.println("O número fornecido é positivo ");
        } else {
            System.out.println("O número fornecido é negativo");
        }

        numero.close();
    }
}