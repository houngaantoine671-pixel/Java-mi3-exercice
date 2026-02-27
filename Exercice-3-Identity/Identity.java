import java.util.Scanner;

public class Identity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille (en mètres) : ");
        double taille = scanner.nextDouble();

        System.out.println();
        System.out.println("Je m'appelle " + nom + ".");
        System.out.println("J'ai " + age + " ans.");
        System.out.println("Je mesure " + taille + " m.");

        scanner.close();
    }
                            }
