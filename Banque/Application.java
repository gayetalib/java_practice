public class Application {

    public static void main(String[] args) {
        CBancaire compte1 = new CBancaire(200);
        CBancaire compte2 = new CBancaire(40);
        CBancaire compte3 = new CBancaire(20000);

        double solde1 = compte1.getSolde() * 0.1;
        compte1.setSolde(compte1.getSolde() + solde1);

        System.out.print("Compte1 : ");
        compte1.afficher();

        System.out.print("Compte2 : ");
        compte2.afficher();

        System.out.print("Compte3 : ");
        compte3.afficher();

    }
}
