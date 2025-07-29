import java.util.Scanner;

@SuppressWarnings("ALL")
public class Exercice3i1 {
    public static void main(String[] args) {
        int saisie;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programme Plus Petit Ou Plus Grand ");

        System.out.print("Entrez un nombre ");
        saisie = scanner.nextInt();
        System.out.println(saisie);

        do {
            if (saisie < 10) {
                System.out.println("Plus grand");
                System.out.println("Retente ta chance");
                saisie = scanner.nextInt();
            } else if (saisie > 20) {
                System.out.println("Plus petit");
                System.out.println("Retente ta chance");
                saisie = scanner.nextInt();
            }
        } while (saisie < 10 || saisie > 20);
            System.out.print(saisie);
            System.out.println(" Gagné");
            scanner.close();
    }
}
