import java.time.LocalDate;
import java.time.LocalTime;

/**
 * DateJour
 */
public class DateJour {

    public static void main(String[] args) {
        LocalDate dateDuJour = LocalDate.now();
        LocalTime heure = LocalTime.now();
        System.out.println("Date : " + dateDuJour);
        System.out.println("Heure : " + heure);
    }
}