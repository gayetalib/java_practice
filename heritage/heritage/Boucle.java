package heritage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boucle {
    enum jour {
        Lundi, mardi, mercredi, Jeudi, Vendredi, Samedi, Dimanche
    };

    public static void main(String[] args) {

        int[] tab = { 2, 4, 6, 1 };
        int[] tab1 = new int[5];

        // String chaine = "Amadou is coding";
        // StringTokenizer st = new StringTokenizer(chaine);
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        // }

        // for (int i : tab) {
        // System.out.println(i);
        // }

        // for (int i = 0; i < tab.length; i++) {
        // System.out.println(tab[i]);
        // }

        for (jour j : jour.values()) {
            System.out.println(j);
        }
    }
}
