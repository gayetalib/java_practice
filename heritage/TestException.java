public class TestException {

    public static float division(float a, float b) throws ExceptionDivisionParZero {
        if (b == 0) {
            throw new ExceptionDivisionParZero("Impossible de diviser par zéro");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(division(2, 2));
        } catch (ExceptionDivisionParZero e) {
            System.out.println("Attention : " + e.getMessage());
        } finally {
            System.out.println("Exception levée avec succès... !");
        }

    }
}

class ExceptionDivisionParZero extends Exception {
    ExceptionDivisionParZero(String msg) {
        super(msg);
    }
}