package package_2;

/*
人：
    属性：年龄
    行为：说话
 */
public class Person {
    /*
    private （私有）: 权限修饰符，用于修饰成员；
    私有的内容只在本类中有效。

    注意：私有仅仅是封装的一种体现而已。
     */
    private int age;//age私有

    public void setAge(int a){ // a 相当于是开关，仅需要传入a的值就可以运行
        if(a > 0 && a < 100){
            age = a;
            System.out.println("age = "+getAge());
        }
        else
            System.out.println("错误的数据！");
    }

    public int getAge(){
        return age;
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
    }
}