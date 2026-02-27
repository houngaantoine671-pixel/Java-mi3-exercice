import java.util.Scanner;

public class Factoriel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        
        int factoriel = 1;

        for(int i = 1; i <= nombre; i++) {
            factoriel = factoriel * i;
        }

        System.out.println("La factorielle de " + nombre + " est : " + factoriel);
        
        scanner.close();
    }
}
