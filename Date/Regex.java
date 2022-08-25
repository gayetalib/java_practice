import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static boolean testEmailAcep(String email) {
        Pattern pattern = Pattern.compile("@acepsenegal.com", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Pattern pattern = Pattern.compile("@acepsenegal.com",
        // Pattern.CASE_INSENSITIVE);
        // Matcher matcher = pattern.matcher("gaye@acepsenegal.com");
        // boolean matcherFound = matcher.find();
        // if (matcherFound) {
        // System.out.println("Oui found");
        // } else {
        // System.out.println("Not found");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer votre mail ACEP : ");
        String email = sc.nextLine();
        sc.close();
        boolean test = testEmailAcep(email);
        if (test) {
            System.out.println("Bienvenue à ACEP Sénégal");
        } else {
            System.out.println("Attention : ce mail n'est pas ACEP");
        }
    }
}
