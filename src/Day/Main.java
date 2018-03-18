package Day;
//shift+f6+fn 替换变量名
//ctrl+d 复制当前行到下一行
//ctrl+alt+l 格式调整
//alt+enter 提示建议
//sout +tab System.out.println()
//psvm+tab main方法
//fori +tab for方法体


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year = 2018;
        int month = 1;
        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入年和月份：");
//        year = sc.nextInt();
//        month = sc.nextInt();
        printCanlender(year, month);

    }//mathod main end here

    public static void printCanlender(int year, int month) {
        //判断闰年，大月、小月，得出每个月的天数
        //每行打7个，
        // 从哪一天起定为周一，公元1年1月1日为周一，且每隔7天循环一次
        // 从周一开始打起，判断这个月的第一天是周几，要有统计到上个月止，过了多少天
        // 这个月的第一天是星期几就从第几个打起，之前的为上个月的填充

      //  isR(year);
        // 当年当月是多少天
        int days = getDays(year,month);
        int sum = getSumDays(year,month);
        int m=sum%7;
        //先打m个空格
        System.out.println("一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六"+"\t"+"日"+"\t");
        for (int i = 0; i < m; i++) {
            System.out.print("\t");
        }
        for (int x =1;x<=days;x++){
            System.out.print(x+"\t");
            if ((m+x)%7==0){
                System.out.println();
            }
        }

//
//        switch (m){
//            case 1:                System.out.println("上月结尾为周1");break;
//            case 2:                System.out.println("上月结尾为周2");break;
//            case 3:                System.out.println("上月结尾为周3");break;
//            case 4:                System.out.println("上月结尾为周4");break;
//            case 5:                System.out.println("上月结尾为周5");break;
//            case 6:                System.out.println("上月结尾为周6");break;
//            case 0:                System.out.println("上月结尾为周7");break;
//
//        }

    }//mathod  printCanlender end

    public static boolean isR(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }//mathod isR end

    public static int getDays(int year,int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isR(year)){
                    return 29;
                }else {
                    return 28;
                }
        }
        return 0;
    }// mathod getDays end

    public  static int getSumDays(int year,int month){
        //1年1月1日为周一，2017年3月为要打印的月份，则到2017年2月为止，一共过了多少天？
        if (month == 1) {
            month = 12;
            year =year-1;
        }else {
            month =month-1;
        }
        int sum = 0;
        //到上一整年为止的所有天数
        for (int i = 1; i < year; i++) {
            if (isR(i)){
                sum+=366;
            }else {
                sum+=365;
            }
        }
        //加上到当年、当月的天数
        switch (month){
            case 12:
                sum+=31;
            case 11:
                sum+=30;
            case 10:
                sum+=31;
            case 9:
                sum+=30;
            case 8:
                sum+=31;
            case 7:
                sum+=31;
            case 6:
                sum+=30;
            case 5:
                sum+=31;
            case 4:
                sum+=30;
            case 3:
                sum+=31;
            case 2:
                if (isR(year)){
                    sum+=29;
                }else {
                    sum+= 28;
                }
            case 1:
                sum+=31;

        }

        System.out.println("到"+year+"年"+month+"月"+"过了"+sum+"天");

        return  sum;
    }//mathod getSumDays end
}//class main end here



