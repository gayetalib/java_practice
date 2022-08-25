/**
 * Account
 */
public class Account {
    private double amount;

    public Account() {
    }

    public Account(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void debiter(double montant) {
        if (getAmount() < montant) {
            System.out.println("Solde insuffisant");
        } else {
            amount = getAmount() - montant;
            System.out.println("Débit effectué avec succès...!");
            System.out.println("Nouveau solde :" + getAmount());
        }
    }

}