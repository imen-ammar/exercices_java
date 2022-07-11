package exercices;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le nombre MIN");
		Integer min = scanner.nextInt();

		System.out.println("Saisir le nombre MAX");
		Integer max = scanner.nextInt();

		while (min >= max) {
			System.out.println("Ereur !");

			System.out.println("Saisir le nombre MIN ");
			min = scanner.nextInt();

			System.out.println("Saisir le nombre MAX ");
			max = scanner.nextInt();
		}
		int nombreMystere = (int) (Math.random() * (max - min) + min);

		System.out.println("Saisir le nombre");
		Integer nombre = scanner.nextInt();
		int nombreEssai = 1;
		while (nombre != nombreMystere) {
			nombreEssai++;

			if (nombre > nombreMystere) {
				System.out.println("Plus petit");
			} else {
				System.out.println("Plus grand");
			}

			System.out.println("saisir le nombre");
			nombre = scanner.nextInt();

		}
		System.out.printf("Félicitation, vous avez trouvé le nombre en %d tentatives\n", nombreEssai);
	}
}
