package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int n1,n2,n3,n4, soma;

		System.out.println("Digite um numero: ");
		n1 = dado.nextInt();

		System.out.println("Digite mais um numero: ");
		n2 = dado.nextInt();

		System.out.println("Digite mais um numero: ");
		n3 = dado.nextInt();

		System.out.println("Digite mais um numero: ");
		n4 = dado.nextInt();

		soma = n1+n2+n3+n4;

		System.out.println("O resultado da soma é:  " + soma);

		dado.close();
		
	}

}