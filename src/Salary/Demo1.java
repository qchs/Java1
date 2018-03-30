package Salary;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class Demo1 {
    public static void main(String[] args) {

  //      SalaiedEmployee s= new SalaiedEmployee("Wang",3,2300);
        HourlyEmployee h=new HourlyEmployee("Alex",5,2600,45);
        SalesEmployee ss=new SalesEmployee("Bob",13,67890,0.22);



        //s.show(3);
        h.show(2);
        ss.show(11);
    }
}
