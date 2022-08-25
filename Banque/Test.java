public class Test {
    public static void main(String[] args) {
        CBancaire cb = new CBancaire(200.0);
        System.out.print("Etat du compte: ");
        cb.afficher();
        UtilsCB.traiterCompte(cb);
    }
}
