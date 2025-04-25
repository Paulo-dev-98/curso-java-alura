import javax.swing.*;
import java.util.Scanner;

public class ConvertendoCelsiusParaFahrenheit {

    public static void main(String[] args) {

        int temperaturaCelsius = Integer.parseInt(JOptionPane.showInputDialog("digite a temperatura em celsius"));
        int fahrenheit = (int) (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura convertida para fahrenheit é: " + fahrenheit);

    }

}
