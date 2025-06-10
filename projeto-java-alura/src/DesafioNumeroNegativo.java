import java.util.Scanner;

public class DesafioNumeroNegativo {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);
        int numero;
        System.out.println("digite um numero");
        numero = entrada.nextInt();

        if(numero > 0){
            System.out.println("O numero que você digitou é positivo");
        } else {
            System.out.println("O numero que você digitou é negativo");
        }


    }

}
