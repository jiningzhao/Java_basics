package package_2;

public class Demo2 {
    int x = 3;
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.x = 9;
        show(d);
        System.out.println(d.x);
    }
    public static void show(Demo2 d){
        d.x = 4;
    }
}
