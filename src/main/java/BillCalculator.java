public class BillCalculator {

    public double calculate(double billValue, double service) {
        return billValue + service;

    }

    public double calculate(double billValue, double service, int percentageDiscount) {
        return (billValue + service) * (1 - percentageDiscount / 100);

    }

    public double calculate(double billValue, double service, double pack) {
        return billValue + service + pack;

    }

}
