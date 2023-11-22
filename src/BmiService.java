public class BmiService {
    public int calculate(double kg, double meter) {
        int result = (int) (kg / (meter * meter));
        return result;
    }
}

