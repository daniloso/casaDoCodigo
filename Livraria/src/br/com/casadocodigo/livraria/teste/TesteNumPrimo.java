package br.com.casadocodigo.livraria.teste;

import java.util.Random;
import java.util.Scanner;

public class TesteNumPrimo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random numAleatorio = new Random();

		int num;
		int numDeTentativas = 0;
		int validador = 40;
		String escolha = "N";

		System.out.println("Digite um numero:");
		while (numDeTentativas <= 3) {
			if (numDeTentativas == 3) {
				System.out.println("Voce perdeu trouxa");
				break;
			} else {
				num = entrada.nextInt();
				if (num == numAleatorio.nextInt(10)) {
					System.out.println("Voce acertou, quer jogar novamente? S/N");
					escolha = entrada.next().toString();
					while (!escolha.equals("S".toLowerCase()) || !escolha.equals("N".toLowerCase())) {
						if (escolha.equals("N".toLowerCase())) {
							entrada.close();
							System.out.println("Fim de jogo");
							System.exit(0);
						} else if (escolha.equals("S".toLowerCase())) {
							numDeTentativas = 0;
							System.out.println("Digite outro numero!");
							break;
						}
					}
				} else if (num < validador) {
					System.out.println("O numero " + num + " é menor que o numero secreto");
					numDeTentativas++;
				} else {
					System.out.println("O numero " + num + " é maior que o numero secreto");
					numDeTentativas++;
				}
			}
		}

	}
}
