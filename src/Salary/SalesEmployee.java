package Salary;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class SalesEmployee extends  Employee {
    double sales;
    double commission;

    @Override
    public double getSalary(int birthMonth) {

        return super.getSalary(birthMonth)+sales*commission;
    }

    public SalesEmployee(String name, int birthMonth, double sales, double commission) {
        super(name, birthMonth);
        this.sales = sales;
        this.commission = commission;
    }
}
