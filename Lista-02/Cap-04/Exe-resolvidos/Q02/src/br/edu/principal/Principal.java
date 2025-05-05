package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		double nota1, nota2, nota3, media, nota_exame;

		System.out.println("Digite a primeira nota: ");
		nota1 = dado.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = dado.nextDouble();

		System.out.println("Digite a terceira nota: ");
		nota3 = dado.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Média aritmética: " + media);
		dado.close();

		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
		}
		else if (media >= 3 && media < 7) {
			System.out.println("Exame");
			nota_exame = 12 - media;
			System.out.println("Deve tirar nota: " + nota_exame + " para ser aprovado");
		}
		else if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");
		}
	}
}
