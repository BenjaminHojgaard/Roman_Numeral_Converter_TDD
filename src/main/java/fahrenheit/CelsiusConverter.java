package fahrenheit;

public class CelsiusConverter {
    public double convert(double celsius) {
        if(celsius == -40) {
            return -40;
        }
        else {
            return (celsius * 1.8) + 32;
        }
    }
}
