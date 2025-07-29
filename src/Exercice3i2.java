import java.util.Scanner;

public class Exercice3i2 {
    public static void main(String[] args) {
        int saisie;
        long resultat;
        int indice;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ecrire un nombre à calculer ");
        saisie=scanner.nextInt();
        System.out.print(saisie);
        resultat = 1;
        for (indice = 1; indice <= saisie; indice++) {
            resultat = resultat * indice;
            indice = indice + 1;
        }
        System.out.print("\nLe resultat de la factorielle de " + saisie);
        System.out.print(" est " + resultat);





    }
}
