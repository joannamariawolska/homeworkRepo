package lesson7task8;

public class Salary {

    private BaseSalary baseSalary;
    private SaturdaySalary saturdaySalary;

    public Salary(BaseSalary baseSalary, SaturdaySalary saturdaySalary) {
        this.baseSalary = baseSalary;
        this.saturdaySalary = saturdaySalary;
    }

    public double getFullSalary(double bonusSalary, double numberSaturday) {
        return baseSalary.getBaseSalary() + bonusSalary + saturdaySalary.getAmountSaturday() * numberSaturday;
    }
}