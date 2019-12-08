package package_1;

public class ArrayDemo4 {
    public static void main(String[] args) {

        int[] arr = new int[]{23,45,14,26,35};
        int max = getMax(arr);
        System.out.println(max);
        int max_1 = getMax_2(arr);
        System.out.println(max_1);
        int[] arr_1 = copyArray(arr);
        for (int value : arr_1) System.out.println(value);
    }
    /*
      获取数组中的最大值：
      思路：
      1、需要进行比较，并定义变量记录住每次比较后较大的值。
      2、对数组中的元素进行遍历取出，和变量中记录的元素进行比较。
            如果遍历到元素大于变量中记录的元素，就用变量记录住该大的值。
      3、遍历结果，该变量记录的就是最大值

      定义一个功能来实现。
      明确一、结果
             是数组汇总的元素，int
      明确二、未知内容。
             数组。
     */
    public static int getMax(int[] arr){
        //定义变量记录较大值
        int max = 0;

        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }
    public static int getMax_2(int[] arr){
        int maxIndex = 0;
        for(int x = 0;x<arr.length;x++){
            if (arr[x]>arr[maxIndex]){
                maxIndex = x;
            }
        }
        return maxIndex;
    }
    public static int[] copyArray(int[] arr){
        int[] arr_1 = new int[arr.length];

        System.arraycopy(arr, 0, arr_1, 0, arr.length);
        return arr_1;
    }
}
