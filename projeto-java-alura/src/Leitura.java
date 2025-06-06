import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("digite o nome do filme");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("digite a data de lançamento");
        int dataDelancamento = leitura.nextInt();
        System.out.println(dataDelancamento);

        System.out.println("digite a avaliação");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);

    }

}
