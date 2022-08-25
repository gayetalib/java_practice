class Coordonnees {
    private float x;
    private float y;
    private String chaine;

    public Coordonnees(String string) {
    }

    public void initaliser(String ch) {
        chaine = ch;
    }

}

public class TesterCoordonne {
    public static void main(String[] args) {
        String ch1 = new String("gaye");
        String ch2 = new String("gaye");

        System.out.println(ch1.equals(ch2)); // same value
        System.out.println(ch1 == ch2); // same value but different reference

    }
}
