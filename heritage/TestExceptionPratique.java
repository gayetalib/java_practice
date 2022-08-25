public class TestExceptionPratique {
    static float division(float a, float b) throws ExceptionDivisionParZero {
        if (b == 0) {
            throw new ExceptionDivisionParZero("Impossible de diviser par zéro");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Division : ");

        try {
            System.out.println(division(5, 0));
        } catch (ExceptionDivisionParZero e) {
            System.out.println(e.getMessage());
        }
    }
}

class ExceptionDivisionParZero extends Exception {
    ExceptionDivisionParZero(String msg) {
        super(msg);
    }
}