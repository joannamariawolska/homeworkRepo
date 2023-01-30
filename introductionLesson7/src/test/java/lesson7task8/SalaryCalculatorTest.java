package lesson7task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class SalaryCalculatorTest {
    @Test
    public void shouldGetFullSalary() {

        //given
        BaseSalaryService baseSalary = Mockito.mock(BaseSalaryService.class);
        SaturdaySalaryService saturdaySalary = Mockito.mock(SaturdaySalaryService.class);
        SalaryCalculator salary = new SalaryCalculator(baseSalary, saturdaySalary);
        when(baseSalary.getBaseSalary()).thenReturn(5500.0);
        when(saturdaySalary.getAmountSaturday()).thenReturn(1100);

        // when
        double result = salary.getFullSalary(500.0, 4);

        // then
        Assertions.assertEquals(result, 10400);
    }
}