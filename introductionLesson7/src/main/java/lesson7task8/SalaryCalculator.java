package lesson7task8;

public class SalaryCalculator {

    private BaseSalaryService baseSalary;
    private SaturdaySalaryService saturdaySalary;

    public SalaryCalculator(BaseSalaryService baseSalary, SaturdaySalaryService saturdaySalary) {
        this.baseSalary = baseSalary;
        this.saturdaySalary = saturdaySalary;
    }

    public double getFullSalary(double bonusSalary, double numberOfSaturdays) {
        return baseSalary.getBaseSalary() + bonusSalary + saturdaySalary.getAmountSaturday() * numberOfSaturdays;
    }
}