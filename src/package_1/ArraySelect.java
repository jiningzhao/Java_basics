package package_1;

import java.util.Arrays;

public class ArraySelect {
    /*
    数组常见功能：查找
     */
    public static void main(String[] args) {
        int[] arr = {23,15,35,24,13,2,5,14,66,45,35,22};
        int index = getIndex(arr,5);
        System.out.println("index="+index);
        int index_1 = getIndex_2(arr,24);
        System.out.println("24在数组中的位置为："+index_1);
        int index_2 = getIndex_3(arr,25);
        System.out.println("25插入数组的位置为："+index_2);
        int index_3 = Arrays.binarySearch(arr,6); // 如果存在返回具体角标位置，不存在返回的是 -插入点-1
        System.out.println(index_3);
    }
    /*
    正常查找
     */
    public static int getIndex(int[] arr,int key){
        for(int x = 0; x < arr.length; x++){
            if(arr[x] == key){
                return x;
            }
        }
        return -1;
    }
    /*
    二分法查找
     */
    public static int getIndex_2(int[] arr,int key){
        Arrays.sort(arr);
        ArraySort.printArray(arr);
        int mid = arr.length/2;
        int min = 0;
        int max = arr.length-1;
        while (min <= max){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                max = mid-1;
                mid = (max+min)/2;
            }
            else if(arr[mid]<key){
                min = mid+1;
                mid = (max+min)/2;
            }
        }
        return -1;
    }
    /*
    面试题：
    给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
    那么这个元素的存储的角标位如何获取。
     */
    public static int getIndex_3(int[] arr,int key){
        Arrays.sort(arr);
        ArraySort.printArray(arr);
        int mid = arr.length/2;
        int min = 0;
        int max = arr.length-1;
        while (min <= max){
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                max = mid-1;
                mid = (max+min)/2;
            }
            else if(arr[mid]<key){
                min = mid+1;
                mid = (max+min)/2;
            }
        }
        return min;
    }
}
