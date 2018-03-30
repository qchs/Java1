package Salary;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class Employee {
    private String name;
    private int birthMonth;


    double getSalary(int month) {

        return this.birthMonth == month ? 250 : 0.0;
    }

    public Employee(String name, int birthMonth) {
        this.name = name;
        if (birthMonth > 12 || birthMonth < 1) {
            System.out.println("月份不正确");
            return;
        }
        this.birthMonth = birthMonth;
    }



    public void show(int birthMonth) {
        System.out.println();

        int i = 1;
        System.out.println(name + " " + birthMonth + "月的工资是" + getSalary(birthMonth));
    }


}
