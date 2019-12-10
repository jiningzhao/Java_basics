package package_2;
//描述小汽车
/*
分析：
1、属性：轮胎数、颜色
2、行为：运行

定义类就是在定义类中的成员。
成员： 成员变量<-->属性，成员函数<-->行为。


 */
class Car{
    int num;
    String color;

    void run(){
        System.out.println(num+"..."+color);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        //在计算机中创建一个car实例。通过new关键字。
        Car c = new Car();// c就是一个类类型的引用变量，指向了该类的对象。
        c.num = 4;
        c.color = "red";

        c.run();// 要使用对象中的内容可以通过 对象.成员的形式来完成调用。
    }
}
