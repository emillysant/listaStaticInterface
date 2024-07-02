public class EurToThbConverter implements CurrencyConverter{
    private static final double EUR_TO_THB_RATE = 36.5; // Exemplo de taxa de conversão

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equalsIgnoreCase("EUR") && toCurrency.equalsIgnoreCase("THB")) {
            return amount * EUR_TO_THB_RATE;
        } else {
            throw new IllegalArgumentException("Conversão suportada apenas de EUR para THB");
        }
    }
}
