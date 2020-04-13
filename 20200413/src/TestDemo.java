import java.util.Arrays;

public class TestDemo {
    public static String myToStirng(int[] array) {
        //字符串形式打印数组
        String ret ="[";
        for(int i=0;i<array.length;i++) {
            ret += array[i];
            if(i != array.length-1) //最后一位后面不打印，
            ret+=",";
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        System.out.println((myToStirng(array)));
    }



    public static int[] func(int[] array) {
        int[] tmp = new int[array.length];
        for(int i=0;i<array.length;i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;//返回数组
    }
    public static void main5(String[] args) {
        int[] array={1,2,3,4,5};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
    public static void main4(String[] args) {
        int a=0;
        System.out.println(a);
        int[] array =null;
        System.out.println(array);
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        ////将数组以字符串形式输出
        System.out.println((Arrays.toString(array)));
    }

    //打印数组
    public static void printArray(int[] arr) {
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void swap(int[] array) {
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        //printArray(array);

        int[] array2 = {10,20};
        System.out.println(array2[0]+" "+array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+array2[1]);
    }
    public static void main1(String[] args) {
        //数组
        //new 实例化一个对象
        int[] array = {1,2,3,4,}; //array引用类型 存放地址
        //int[] array2 = new int[]{11,22,33,44};
        //int[] array3 = new int[4];//此时数组存放4个0，而非C中的随机值
        //拿不到栈的地址 堆的地址经过哈希函数处理
        int len=array.length; //长度
        //foreach  左边类型 右边数组名
        //打印数组
        for (int val:array) {
            System.out.print(val+" ");
        }


    }
}
