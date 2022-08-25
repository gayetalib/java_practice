public class Application {

    public static void main(String[] args) {
        CompteBancaire oumar_sy = new CompteBancaire(300000);
        CompteBancaire baye_dieye = new CompteBancaire(400000);
        CompteBancaire christian = new CompteBancaire(200000);
        CompteBancaire docko_sow = new CompteBancaire(800000);
        CompteBancaire dethie = new CompteBancaire(500000);
        CompteBancaire amadou = new CompteBancaire(100000);

        // Docko tranasfere 200k à amadou
        // Avant virement
        docko_sow.afficherSolde();
        amadou.afficherSolde();

        // Virement vers Amadou
        docko_sow.virement(amadou, 200000);

        // Apres virement
        docko_sow.afficherSolde();
        amadou.afficherSolde();

    }
}
