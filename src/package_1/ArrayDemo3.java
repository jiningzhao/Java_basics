package package_1;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
        格式1：需要一个容器，但是不明确容器中的具体数据
         */
//        int[] arr1 = new int[3];
        /*
        格式2：需要一个容器，存储已知的具体数据
         */
        //元素类型[] 数组名 = new 元素类型[]{元素，元素，……}
        //常规初始化方式：
//        int[] arr2 = new int[]{89,34,270,17};
        //静态初始化方式：
        int[] arr3 = {89,34,270,17};

        /*
        对数组的操作最基本的动作就是存和取。
        核心思想：就是对角标的操作。
         */
        System.out.println(arr3[1]);
        for(int i=0;i<(arr3.length);i++){
            System.out.println("arr["+i+"]="+arr3[i]);
        }
    }
}
