package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rez add = " + rezAdd);

        int rezSub = Calculator.subtract(100, 45);
        System.out.println("rez subtract = " + rezSub);

        double rezDiv = Calculator.divide(100, 45);
        System.out.println("rez divide = " + rezDiv);

    }
}
