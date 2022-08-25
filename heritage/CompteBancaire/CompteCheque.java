package CompteBancaire;

public class CompteCheque extends CompteBancaire {
    double decouvertautorise; // ajout de nouveau champ

    public CompteCheque(double solde, double decouvertautorise) {
        super(solde);
        this.decouvertautorise = decouvertautorise;
    }

    void debiter(double montant) {
        if ((solde + decouvertautorise) >= montant) {
            solde -= montant;
        }
    }

    public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire(300000);
        cb1.crediter(250000);
        System.out.println(cb1.getSolde());
    }
}
