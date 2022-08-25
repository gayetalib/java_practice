import java.util.Scanner;
import java.util.Locale;

/**
 * UtilsCB
 */
public class UtilsCB {
    static void traiterCompte(CBancaire cb) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Votre montant");
        double montant = input.nextDouble();
        while (montant != 0.0) {
            if (montant > 0.0) {
                cb.crediter(montant);
            } else {
                cb.debiter(-montant);
            }
            System.out.println("Etat du compte: " + cb.getSolde() + " euros");
            if (cb.getSolde() < 0.0) {
                System.out.println("OUPS... cb en negatif-- veuillez alimenter");
            }
            System.out.print("Votre montant (0==fin)? ");
            montant = input.nextDouble();
        }
    }
}