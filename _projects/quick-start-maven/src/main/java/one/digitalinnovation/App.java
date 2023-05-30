package one.digitalinnovation;

import javax.swing.*;

public class App
{
    public static void main( String[] args ) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        String genero = JOptionPane.showInputDialog("Genero: ");

        System.out.println(nome + " " + idade + " " + genero);

    }
}
