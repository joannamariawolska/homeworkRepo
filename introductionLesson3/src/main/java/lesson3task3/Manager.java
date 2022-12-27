package lesson3task3;

public class Manager extends BaseEmployee{
    private static final int BASE_SALARY = 5000;
    private final int salary;
    private int bonus;

    public Manager(String name, String surname, int employmentYear, int salary) {
        super(name, surname, employmentYear, salary);
        this.bonus = 500;
        this.salary = BASE_SALARY;
    }

    @Override
    public int calculateMonthlySalary(){
        return salary + bonus;
    }

    public int getSalary(){
        return this.salary;
    }
}
