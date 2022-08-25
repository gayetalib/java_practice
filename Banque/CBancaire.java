import java.util.Scanner;

/**
 * CBancaire
 */
public class CBancaire {

    private double solde;

    // constructeur sans parametre
    public CBancaire() {
        solde = 0.0;
    }

    // constructeur avec
    public CBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // ----------- Methodes et Fonctions ------------------
    public double crediter(double x) {
        return solde + x;
    }

    public double debiter(double x) {
        return solde - x;
    }

    public void afficher() {
        System.out.println(getSolde() + " CFA");
    }

    public void virerVers(CBancaire cb, double montant) {
        cb.crediter(montant);
        debiter(montant);
    }

    public void traiterCompte(CBancaire cb) {

    }

    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);

    // System.out.println("Tapez vos montants successifs (0 pour finir) :");
    // double montant = input.nextDouble();

    // while (montant != 0) {
    // if (montant > 0) {
    // cb.crediter(montant);
    // }
    // }
    // System.out.println("Vous avez saisi : " + montant);
    // }
}