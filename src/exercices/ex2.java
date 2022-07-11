package exercices;
import java.util.Scanner;

public class ex2 {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Saisir la 1er note");
	 double note1 = scanner.nextDouble();
	 while(note1>20 || note1<0) {
		 System.out.println("Saisir la 1er note");
		 note1 = scanner.nextDouble();
	 }
	 
	 System.out.println("Saisir la 2eme note");
	 double note2 = scanner.nextDouble();
	 while(note1>20 || note1<0) {
		 System.out.println("Saisir la 2eme note");
		 note2 = scanner.nextDouble();
	 }
	 
	 System.out.println("Saisir la 3eme note");
	 double note3 = scanner.nextDouble();
	 while(note1>20 || note1<0) {
		 System.out.println("Saisir la 3eme note");
		 note3= scanner.nextDouble();
	 }
	 
	 double moyenne = (note1+note2+note3)/3;
	 System.out.printf("La moyenne est %f", moyenne);
}
}
