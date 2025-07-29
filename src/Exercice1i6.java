import java.util.Scanner;

public class Exercice1i6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        int tampon;

        System.out.print("Entrez une valeur pour a\n");
        a =  scanner.nextInt();
        System.out.print("Entrez une valeur pour b\n");
        b =  scanner.nextInt();

        System.out.println("Avant l'échange:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        tampon = a;
        a = b;
        b = tampon;

        System.out.println("Après l'échange");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
