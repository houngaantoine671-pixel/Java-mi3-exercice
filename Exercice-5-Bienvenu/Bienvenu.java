import java.util.Scanner;

public class Bienvenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.println("Bienvenue " + prenom + ", vous avez " + age + " ans.");

        scanner.close();
    }
}
