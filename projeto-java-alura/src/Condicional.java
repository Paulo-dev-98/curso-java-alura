import javax.swing.*;
import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = Integer.parseInt(JOptionPane.showInputDialog("digite o ano"));
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8;
        String tipoDoplano = "normal";

        if (anoDeLancamento >= 2020){
            System.out.println("uma bosta");
        } else {
            System.out.println("aceitavel");
        }

        if (incluidoNoPlano == true || tipoDoplano.equals("plus")){
            System.out.println("pode ver");
        } else {
            System.out.println("paga a conta vagabundo");
        }

    }

}
