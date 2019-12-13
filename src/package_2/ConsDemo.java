package package_2;
class Person_1{
    private String name;
    private int age;

    //定义一个Person_1类的构造函数:构建创造对象时调用的函数。
    Person_1(){ //构造函数，而且是空参数的。
        name = "赵吉宁";
        age = 1;
//        System.out.println("Person run!");
    }
    // 如果有的孩子一出生就有名字。
    Person_1(String n){
        name = n;
    }
    Person_1(String n,int a){
        name = n;
        age = a;
    }

    public void speak(){
        System.out.println(name+":"+age);
    }
}
/*
构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
创建对象都必须要通过构造函数初始化。

一个类中如果没有定过构造函数，那么该类中会有一个默认的空参数构造函数。
如果在类中定义了指定的构造函数，那么类中的默认构造函数就没有了。

一般函数和构造函数什么区别呢？

构造函数：对象创建时，需要调用与之对应的构造函数，对对象进行初始化。
一般函数：对象创建后，需要函数功能时才调用。

构造函数：对象创建时，会调用只调用一次。
一般函数：对象创建后，可以被调用多次。

什么时候定义构造函数呢？
在描述事物时，该事物已存在就具备一些内容，这些内容都定义在构造函数中。
 */

public class ConsDemo {
    public static void main(String[] args) {

        Person_1 p = new Person_1();// 构造函数:构建创造对象时调用的函数。作用：可以给对象进行初始化。
        p.speak();
        Person_1 p1 = new Person_1("旺财");
        p1.speak();
        Person_1 p2 = new Person_1("旺财",10);
        p2.speak();
    }
}

