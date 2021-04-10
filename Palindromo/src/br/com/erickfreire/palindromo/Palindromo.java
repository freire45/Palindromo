package br.com.erickfreire.palindromo;

import java.util.Scanner;

/**
 * Crie um programa em Java que verifica se um n�mero � pal�ndromo
 * @author Erick Freire
 * @version 1 - Criado em 10-04-2021 as 18:12
 */

public class Palindromo {
	public static void main(String[] args) {
		int numero = 0;
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se um n�mero � pal�ndromo ");
		
		System.out.print("Informe um n�mero de 5 digitos");
		numero = entrada.nextInt();
		
		while(numero < 10000) {
			System.out.print("N�mero Pequeno Digite um n�mero de 5 digitos");
			numero = entrada.nextInt();
		}
		
		while(numero > 99999) {
			System.out.print("N�mero Grande Digite um n�mero de 5 digitos");
			numero = entrada.nextInt();
		}
		
		numero1 = numero / 10000;
		numero2 = (numero % 10000) / 1000;
		numero3 = (numero % 1000) / 100;
		numero4 = (numero % 100) / 10;
		numero5 = (numero % 10) / 1;
		
		if(numero1 == numero5) {
			if(numero2 == numero4)
				System.out.printf("O n�mero %d � Palindromo", numero);			
		} else {
			System.out.printf("O n�mero %d N�o � Palindromo", numero);	
		}
			
		
		
		
	}

}
