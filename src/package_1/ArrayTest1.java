package package_1;
/*
获取一个整数的16禁止表现形式。
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        toHex_1(60);
        System.out.println();
        toHex_2(60);
        System.out.println("----------------");
        toHex(60);
        System.out.println();
        toBinary(60);
        System.out.println();
        toOctal(60);
        System.out.println();
    }
    /*
    什么时候使用数组呢？
    如果数据出现了对应关系，而且对应关系的一方是有序的数字编号。并作为角标使用。
    这是就必须要想到数组的使用。

    就可以将这些数据存储到数组中。
    根据运算的结果作为角标直接去查数组中对应的元素即可。

    这种方式称为：查表法。
     */
    public static void toBinary(int num){
        System.out.println("二进制转化：num= "+num);
        trans(num,1,1);
    }
    public static void toHex(int num){
        System.out.println("十六进制转化：num= "+num);
        trans(num,15,4);
    }
    public static void toOctal(int num){
        System.out.println("八进制转化：num= "+num);
        trans(num,7,3);
    }

    public static void trans(int num,int base,int offset){
        if(num == 0){
            System.out.println("0");
            return;
        }
        //定义一个对应关系表。
        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};
        /*
        一会查表会查到比较多的数据。
        数据一多，就先存储起来，在进行操作。
        所以定义一个数组。临时容器。
         */
        char[] arr = new char[8];
        int pos = arr.length;
        while(num != 0){
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }
        System.out.println("pos="+pos);
        for(int i = pos; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }
    public static void toHex_1(int num){

        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};

        for(int x = 0; x < 8; x++){
            int temp = num & 15;
            System.out.print(chs[temp]);
            num = num >>> 4;
        }
    }

    public static void toHex_2(int num){
        for(int x = 0; x < 8; x++){
            int temp = num & 15;
            if(temp > 9)
                System.out.print((char)(temp-10+'A'));
            else
                System.out.print(temp);
            num = num >>> 4;
        }
    }
}
