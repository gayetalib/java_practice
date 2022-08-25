import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Account compte1 = new Account(300);
        System.out.println(compte1.getAmount());

        Scanner input = new Scanner(System.in);

        System.out.println("Entrer le montant à retirer");
        double montant = input.nextDouble();
        compte1.debiter(montant);
        input.close();
    }
}
