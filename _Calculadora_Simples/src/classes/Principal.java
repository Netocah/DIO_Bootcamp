package com.sintaxe;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primeiro número: ");
		int n1 = teclado.nextInt();
		System.out.println("Segundo número: ");
		int n2 = teclado.nextInt();
		int soma = somar(n1, n2);
		int subtracao = subtrair(n1, n2);
		int multiplicacao = multiplicar(n1, n2);
		float divisao = dividir(n1, n2);
		teclado.close();
		System.out.println("Calculando, temos os seguintes resultados:");
		System.out.println("Soma: "+ soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: "+ multiplicacao);
		System.out.printf("Divisão: "+ "%.2f", divisao);
	}

	public static int somar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static float dividir(int a, int b) {
		float res = (float) a / b;
		return res;
	}
}
