package package_1;


public class ArraySort {
    /*
    排序算法
     */
    public static void main(String[] args) {
        //待排序数组
        int[] arr = {23,15,35,24,13,2,5,14,66,45,35,22};
        //选择排序
        int[] arr_1 =  SelectSort(arr);
        printArray(arr_1);

        //冒泡排序一
        int[] arr_2 = BubbleSort_1(arr);
        printArray(arr_2);

        //冒泡排序二
        int[] arr_3 = BubbleSort_2(arr);
        printArray(arr_3);

    }
    /*
    循环输出数组元素
     */
    public static void printArray(int[]arr){
        for(int value : arr)System.out.print(value+"、");
        System.out.println();
    }
    /*
    选择排序:外层循环表示迭代基础数字，内层循环表示被比较数字，被比较数字比基础数字大（或小），两个数字调换位置
    时间复杂度：
     */
    public static int[] SelectSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    /*
    冒泡排序一：大的数不断向后冒泡
    时间复杂度：
     */
    public static int[] BubbleSort_1(int[] arr){
        //循环次数
        for(int i = 0; i < arr.length-1; i++){
            //外循环增加一次，内循环参数与比较的元素个数递减
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    /*
    冒泡排序二
     */
    public static int[] BubbleSort_2(int[] arr){
        //待排序位数：一次内循环，减少一个待排序数
        for(int i = arr.length-1; i > 0; i--){

            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
