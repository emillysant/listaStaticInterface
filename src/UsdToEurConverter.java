public class UsdToEurConverter implements CurrencyConverter{
    private static final double USD_TO_EUR_RATE = 0.85;
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equalsIgnoreCase("USD") && toCurrency.equalsIgnoreCase("EUR")) {
            return amount * USD_TO_EUR_RATE;
        } else {
            throw new IllegalArgumentException("Conversão suportada apenas de USD para EUR");
        }
    }
}
