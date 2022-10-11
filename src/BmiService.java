public class BmiService {
    public double calculate(double money, double percent, double month) {
        double result;
        double y = percent / 12;
        double x = Math.pow((1 + y), month);
        result = money * (y * x) / (x - 1);
        return result;
    }
}
