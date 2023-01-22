package lesson7task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import java.util.stream.Stream;

class CurrencyConverterTest {

    @ParameterizedTest
    @MethodSource("getCurrenciesToBuy")
    void shouldConvertCurrenciesToBuy(Currency currency, double rate, double expected) {
        //given
        double amount = 100;
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateMock);
        Mockito.when(exchangeRateMock.getBuyRate(currency)).thenReturn(rate);
        //when
        double actualValue = currencyConverter.convertBuy(amount, currency);
        //then
        Assertions.assertEquals(expected, actualValue);
    }

    public static Stream<Arguments> getCurrenciesToBuy() {
        return Stream.of(
                Arguments.of(Currency.EUR, 0.2, 20),
                Arguments.of(Currency.USD, 0.25, 25),
                Arguments.of(Currency.GBP, 0.15, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("getCurrenciesToSell")
    void shouldConvertCurrenciesToSell(Currency currency, double rate, double expected) {
        //given
        double amount = 100;
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateMock);
        Mockito.when(exchangeRateMock.getSellRate(currency)).thenReturn(rate);
        //when
        double actualValue = currencyConverter.convertSell(amount, currency);
        //then
        Assertions.assertEquals(expected, actualValue);
    }

    public static Stream<Arguments> getCurrenciesToSell() {
        return Stream.of(
                Arguments.of(Currency.EUR, 4.5, 450),
                Arguments.of(Currency.USD, 4.0, 400),
                Arguments.of(Currency.GBP, 5.13, 513)
        );
    }
}