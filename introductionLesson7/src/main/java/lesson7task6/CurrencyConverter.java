package lesson7task6;

public class CurrencyConverter {
    private final ExchangeRate exchangeRate;

    public CurrencyConverter(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertBuy(double amount, Currency currencyName){
        double exchangeValueRate = exchangeRate.getBuyRate(currencyName);
        return amount * exchangeValueRate;
    }

    public double convertSell(double amount, Currency currencyName){
        double exchangeValueRate = exchangeRate.getSellRate(currencyName);
        return amount * exchangeValueRate;
    }


}