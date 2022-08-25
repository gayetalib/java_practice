package Thread;

public class Ecrire extends Thread {
    private String name;
    private String text;
    private int nb;
    private int attente;

    public Ecrire(String name, String text, int nb, int attente) {
        super(name);
        this.text = text;
        this.nb = nb;
        this.attente = attente;
    }

    public void run() {
        try {
            for (int i = 0; i < nb; i++) {
                System.out.println(text);
                sleep(attente);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Ecrire t1 = new Ecrire("t1", "Bonjour", 10, 5);
        Ecrire t2 = new Ecrire("t2", "Bonsoir", 12, 10);
        Ecrire t3 = new Ecrire("t3", "\n", 5, 15);

        t1.start();
        t2.start();
        t3.start();

    }

}
