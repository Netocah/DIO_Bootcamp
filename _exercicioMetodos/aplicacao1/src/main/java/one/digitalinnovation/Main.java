package one.digitalinnovation;

import javax.swing.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        Metodos operacao = new Metodos();
        boolean verificador = true;
        do {
            try {
                int numA = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número."));
                int numB = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número."));
                if (numB == 0){
                    System.out.println(numA/numB);
                }
                System.out.println(operacao.dividir(numA, numB));
                verificador = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Insira um número inteiro!" + e.getMessage());
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "Erro. Não pode ter divisor '0' zero." + ex.getMessage());
            } finally {
                System.out.println("Chegou no finally.");
            }
        }while(verificador);
        System.out.println("Operação finalizada.");

    }
}
