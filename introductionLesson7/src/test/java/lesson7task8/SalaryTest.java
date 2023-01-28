package lesson7task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class SalaryTest {
    @Test
    public void shouldGetFullSalary() {
        //given
        BaseSalary baseSalary = Mockito.mock(BaseSalary.class);
        SaturdaySalary saturdaySalary = Mockito.mock(SaturdaySalary.class);
        Salary salary = new Salary(baseSalary, saturdaySalary);
        // when
        when(baseSalary.getBaseSalary()).thenReturn(5500.0);
        when(saturdaySalary.getAmountSaturday()).thenReturn(1100);
        double result = salary.getFullSalary(500.0, 4);
        // then
        Assertions.assertEquals(result, 10400);
    }
}