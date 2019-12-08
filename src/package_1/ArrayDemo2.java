package package_1;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
//        System.out.println(arr[4]);//ArrayIndexOutOfBoundsException
//        当访问到数组中不存在的角标时，就会发生该异常。
//
//        arr = null;
//        System.out.println(arr[0]);//NullPointerException
//        当引用行变量没有任何实体指向时，还在用其操作实体，就会发生该异常。

        System.out.println(arr);//[I@56cbfb61 [I ：数组int类型  56cbfb61：哈希值


    }
}
