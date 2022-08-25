package CompteBancaire;

public class CompteEpargne extends CompteBancaire {
    double taux;

    public CompteEpargne(double solde, double taux) {
        super(solde);
        this.taux = taux;
    }

}
