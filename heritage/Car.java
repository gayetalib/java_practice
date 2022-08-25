public class Car extends Vehicule {
    private String model = "308";

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.test();
        System.out.println(myCar.marque);
    }
}
