package Salary;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class HourlyEmployee extends Employee {
    int hours;
    double hourlySalary;

    @Override
    public double getSalary(int birthMonth) {
        double more=0;
        if (hours >= 160) {
            more=(hours-160)*1.5*hourlySalary+160*hourlySalary;
        }else {
            more=hours*hourlySalary;
        }
        return super.getSalary(birthMonth)+more;
    }

    public HourlyEmployee(String name, int birthMonth, int hours, double hourlySalary) {

        super(name, birthMonth);
        if (hours >24*31) {
            System.out.println("工作时间有误");
            return;
        }
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }
}
