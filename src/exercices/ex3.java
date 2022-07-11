package exercices;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.println("Saisir une note");
		 double somme = Double.parseDouble(scanner.nextLine());
		 String note = "";
		 int nombreNote = 1;
		 while(!note.equals("q")) {
			 System.out.println("Saisir une note");
			 note = scanner.nextLine();
			 if(!note.equals("q")) {
				 nombreNote++;
				 somme += Double.parseDouble(note);
			 }
		 }
		 
		 Double moyenne = somme/nombreNote;
		 System.out.printf("La moyenne est : %f", moyenne);
	}
}
