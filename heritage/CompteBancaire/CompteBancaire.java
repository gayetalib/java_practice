package CompteBancaire;

public class CompteBancaire {
    double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    void crediter(double montant) {
        solde += montant;
    }

    void debiter(double montant) {
        if (solde >= montant) {
            solde -= montant;
        }
    }

}
