package package_1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class first_class {

    public static void print_String(){
        System.out.println("第一个函数！");
    }

    public static int print_add(int a,int b){
        System.out.println("计算两个参数相加：");
        return a+b;
    }

    public static int print_and(int a,int b){
        System.out.println("计算两个参数的与运算：");
        return a&b;
    }

    public static int print_or(int a,int b){
        System.out.println("计算两个参数的或运算：");
        return a|b;
    }

    public static void max_one(int a,int b,int c){
        /*
        int tamp = (a>b)?a:b;
        int max = tamp>c?tamp:c;
         */
        int tamp = Math.max(a,b);
        int max = Math.max(tamp,c);
        System.out.println(max);
    }

    public static void one(int a){
        /*
        移位运算符：左移几位相当于乘以2的几次幂
        可以用于2的次幂运算
         */
        System.out.println(a<<2);
    }

    public static void two(int a){
        /*
        有符号右移
        移位运算符：右移几位相当于除以几个2
        对于高位出现的空位：原来高位是什么，就用什么补这个空位
         */
        System.out.println(a>>2);
    }

    public static void three(int a){
        /*
        无符号右移
        移位运算符：右移几位相当于除以几个2
        对于高位出现的空位：无论原来的高位是什么，都用0补
         */
        System.out.println(a>>>2);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        print_String();
        int c,d,e,f;
        c = print_add(1,2);
        System.out.println(c);
        d = print_and(1,2);
        System.out.println(d);
        e = print_or(1,2);
        System.out.println(e);
        second_class.print_1(999);
        one(3);
        two(-12);
        three(-12);
        max_one(3,24,12);
        second_class.xingqi(4);
        second_class.jijie(11);
    }
}
