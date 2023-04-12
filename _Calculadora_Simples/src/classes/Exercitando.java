package classes;
import java.util.Scanner;
public class exercitando {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro nome: ");
        String primeiroNome = teclado.next();
        System.out.print("Digite o segundo nome: ");
        String segundoNome = teclado.next();
        String nomeCompleto = juntarNome(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String juntarNome(String nomeA, String nomeB) {
        return nomeA.concat(nomeB);
    }
}