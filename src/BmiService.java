public class BmiService {
    public int calculate(double kg, double m) {
        int result = (int) (kg / (m * m));
        return result;
    }
}

