import java.util.Scanner;

public class Exercice2i2 {
    static String Name;
    static String Surname;


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("entrez votre prenom ");
        Surname = scanner.next();
        System.out.print("entrez votre nom ");
        Name = scanner.next();
        System.out.println(Surname);
        System.out.println(Name);
        System.out.println("Bonjour " + Surname);
        System.out.println("Votre nom est " + Name);

    }
}
