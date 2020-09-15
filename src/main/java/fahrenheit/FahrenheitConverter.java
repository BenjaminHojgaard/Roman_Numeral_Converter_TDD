package fahrenheit;

public class FahrenheitConverter {
    public double convert(double fahrenheit) {
        if(fahrenheit == -40) {
            return -40;
        }
        else {
            return (fahrenheit - 32) / 1.8;
        }
    }
}
