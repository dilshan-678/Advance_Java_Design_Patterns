package References20240205.adapterpattern.EX01;

public class CelciusReporter {

    double temperatureInC;

    public CelciusReporter() {

    }

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}
