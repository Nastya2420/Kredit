public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


        System.out.println(service.calculate(1000000.0, 0.0999, 12.0));

        System.out.println(service.calculate(1000000.0, 0.0999, 24.0));

        System.out.println(service.calculate(1000000.0, 0.0999, 36.0));


    }
}