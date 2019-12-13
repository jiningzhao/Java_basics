package package_2;

import java.util.Arrays;

public class Array2Demo {
    public static void main(String[] args) {

        int[][] arr = new int[3][2];//创建一个二维数组，该数组中有3个一维数组，每一个一维数组中有两个元素。

        System.out.println(Arrays.asList(arr).toString()); // 直接打印二维数组。
        System.out.println(arr[0]);// 直接打印二维数组中角标为0的一维数组。
        System.out.println(arr[0][0]);// 直接打印二维数组中角标为0的一维数组中角标为0的元素。
        System.out.println(arr.length);// 打印二维数组的长度，其实就是一维数组的个数。
        System.out.println(arr[1].length);// 打印二维数组中角标为1的一维数组的长度。

        for(int i=0; i<3;i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr_1 = {{3,1,7},{5,8,2,9},{4,1}};
        /*
        争强型for循环:可翻译为如下代码
        for(int i=0; i<arr_1.length; i++){
            for(int j=0; j<arr_1[i].length; j++){
               System.out.print(anInt + ",");
            }
           System.out.println();
        }
         */
        for (int[] ints : arr_1) {
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println();
        }

        /*
        甲：30,59,28,17
        乙：37,60,22,19
         */
        int sum = 0;
        int[][] arr_2 = {{30,59,28,17},{37,60,22,19}};
        for(int[] x : arr_2){
            for(int y : x){
                sum += y;
                System.out.print(y+",");
            }
            System.out.println("sum"+sum);
        }
    }
}
