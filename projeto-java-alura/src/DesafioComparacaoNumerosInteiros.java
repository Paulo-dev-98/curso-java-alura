import java.util.Scanner;

public class DesafioComparacaoNumerosInteiros {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

    }

}
