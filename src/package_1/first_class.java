package package_1;

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

    }
}
