package classes;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primeiro número: ");
		int n1 = teclado.nextInt();
		System.out.println("Segundo número: ");
		int n2 = teclado.nextInt();
		int somar = soma(n1, n2);
		int subtrair = subtracao(n1, n2);
		int multiplicar = multi(n1, n2);
		float dividir = divisao(n1, n2);
		teclado.close();
		System.out.println("Calculando, temos os seguintes resultados:");
		System.out.println("Soma: "+ somar);
		System.out.println("Subtração: " + subtrair);
		System.out.println("Multiplicação: "+ multiplicar);
		System.out.printf("Divisão: "+ "%.2f", dividir);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static float divisao(int a, int b) {
		float res = (float) a / b;
		return res;
	}
}
