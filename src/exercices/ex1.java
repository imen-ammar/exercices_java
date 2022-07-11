package exercices;
import java.util.Scanner;

public class ex1 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Saisir le nom");
	 String nom = scanner.nextLine();
	 
	 System.out.println("Saisir le prénom");
	 String prenom = scanner.nextLine();
	 
	 System.out.println("Saisir l'age");
	 int age = scanner.nextInt();
	 
	 System.out.printf("Monsieur ou madame %s %s a %d ans",nom, prenom, age);
	
}
}
