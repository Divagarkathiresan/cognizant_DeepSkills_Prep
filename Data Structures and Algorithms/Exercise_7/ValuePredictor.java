package Exercise_7;

public class ValuePredictor {
    public double predictValue(double value, int years, double rate) {
        if (years == 0) {
            return value;
        }
        return predictValue(value, years - 1, rate) * (1 + rate);
    }
}