import java.util.Scanner;

public class Exercice2i1 {
    public static void main(String[] args) {
        double TVA = (int) 1.196;
        int HT; //€
        int TTC; //€
        Scanner scanner=new Scanner(System.in);

        System.out.print("entrer le prix hors taxe :");
        HT=scanner.nextInt();
        System.out.println("Le prix HT est " + HT + "€");

        TTC = (int) (HT * (1 + (TVA / 100)));
        System.out.println("Le prix Toutes Taxes Comprises est de " + TTC + "€");

    }
}
