package package_1;

public class second_class {

    public static void print_1(int a){
        System.out.println(a);
    }

    public static void xingqi(int a){
        if(a==1) {
            System.out.println("星期一");
        }
        else if(a==2) {
            System.out.println("星期二");
        }
        else if (a==3){
            System.out.println("星期三");
        }
        else if (a==4){
            System.out.println("星期四");
        }
        else if (a==5){
            System.out.println("星期五");
        }
        else if (a==6){
            System.out.println("星期五");
        }
        else if (a==7){
            System.out.println("星期五");
        }
        else{
            System.out.println("错误的信息！请输入1-7的数字！");
        }
    }

    public static void jijie(int a){
        if(a>=3&a<=5){
            System.out.println("春季");
        }
        else if(a>=6&a<=8){
            System.out.println("夏季");
        }
        else if(a>=9&a<=11){
            System.out.println("秋季");
        }
        else if(a==12|a>=1&a<=2){
            System.out.println("冬季");
        }
    }
}
