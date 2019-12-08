package package_1;

public class ArrayDemo {
    public static void main(String[] args) {
        //元素类型[] 数组名 = new 元素类型[元素个数或数组长度]
        int[] arr = new int[3];
        {// 局部代码块。限定局部变量的生命周期。
            int age = 3;
            System.out.println(age);
        }
        arr[0] = 89;
        System.out.println(arr[0]);

    }
}
/*
内存的划分：
1、寄存器
2、本地方法区
3、方法区
4、栈内存
    存储的都是局部变量。
    而且变量所属的作用域一旦结束，该变量就自动释放。
    没有默认初始化变量
5、堆内存
    存储的是数组和对象（其实数组就是对象），凡是new建立的都在堆中。
    有默认初始化变量（每个类型的初始化变量不同）
    特点：
        1）每一个尸体都有首地址值。
        2）对内存中的每一个变量都有初始化值，根据类型的不同而不同。
            整数是0，小数是0.0或者0.0f，boolean false,char '\u0000'
        3）垃圾回收机制
 */