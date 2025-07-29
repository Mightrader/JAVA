import javax.swing.*;
import java.util.Scanner;

public class Exercice2i3  {
    public static void main(String[] args) {
        int a;
        int b;
        int result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrez le 1er nombre (a)");
        a = scanner.nextInt();
        System.out.println("entrez le 2er nombre (b)");
        b = scanner.nextInt();
        result = a * b;

        if (result > 0) {
            System.out.println("Le resultat est positif");
        }
        else {
            System.out.println("Le resultat est negatif");
        }
        System.out.println("Le résultat est :" + result);
    }
}
