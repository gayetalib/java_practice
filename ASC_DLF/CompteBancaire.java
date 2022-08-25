/**
 * CompteBancaire
 */
public class CompteBancaire {

    private Integer numero;
    private double solde;

    public CompteBancaire() {
    }

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void crediterCompte(double montant) {
        solde = solde + montant;
    }

    public void debiterCompte(double montant) {
        solde = solde - montant;
    }

    public void virement(CompteBancaire cb, double montant) {
        cb.crediterCompte(montant);
        debiterCompte(montant);
    }

    public void afficherSolde() {
        System.out.println(getSolde() + " CFA");
    }

}