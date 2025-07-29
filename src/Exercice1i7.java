import java.util.Scanner;

public class Exercice1i7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int tampon;

        System.out.print("Entrez une valeur pour a\n");
        a = scanner.nextInt();
        System.out.print("Entrez une valeur pour b\n");
        b = scanner.nextInt();
        System.out.print("Entrez une valeur pour c\n");
        c = scanner.nextInt();

        System.out.println("Avant Transfert\n");
        System.out.println("C = " + c);
        System.out.println("B = " + b);
        System.out.println("A = " + a);
        tampon = c;
        c = c;
        b = a;
        a = tampon;

        System.out.println("Après transfert\n");
        System.out.println("C = " + c);
        System.out.println("B = " + b);
        System.out.println("A = " + a);
    }
}
