package Salary;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class SalaiedEmployee extends  Employee{
    double monthlySalary;

    @Override
    public double getSalary(int birthMonth) {
        return super.getSalary(birthMonth)+monthlySalary;
    }

    public SalaiedEmployee(String name, int birthMonth, double monthlySalary) {
        super(name, birthMonth);
        this.monthlySalary = monthlySalary;
    }
}
