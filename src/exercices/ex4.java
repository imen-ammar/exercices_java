package exercices;

import java.util.Scanner;

import javax.swing.text.Position;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un nombre");
		int nombre = scanner.nextInt();
		// V1
		if (nombre > 0) {
			System.out.printf("Le nombre %d est positif\n", nombre);
		} else if (nombre < 0) {
			System.out.printf("Le nombre %d est négatif\n", nombre);
		} else {
			System.out.printf("C'est un zéro\n");
		}
		if (nombre % 2 == 0) {
			System.out.printf("Le nombre %d est un nombre pair\n", nombre);
		} else {
			System.out.printf("Le nombre %d est un nombre impair\n", nombre);
		}

		// V2
		/*
		 * String signe= "négatif"; String pairImpaire= "impair"; if(nombre>0) { signe =
		 * "positif"; } if(nombre % 2 ==0) { pairImpaire = "pair"; } if(nombre ==0) {
		 * System.out.println("C'est un zéro => pair\n"); }else {
		 * System.out.printf("Le nombre %d est un nombre %s et %s",nombre,signe,
		 * pairImpaire); }
		 */

	}

}
