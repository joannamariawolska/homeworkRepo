package lesson4task6;

public class BillCalculator {

    public double calculate(double billValue, float paymentForService){
        return billValue + paymentForService;
    }

    public double calculate(double billValue, float paymentForService, double discount){
        return billValue * discount + paymentForService;
    }

    public double calculate(double billValue, float paymentForService, short takeawayPackage){
        return billValue + paymentForService + takeawayPackage;
    }
}