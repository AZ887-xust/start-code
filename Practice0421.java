import java.util.Arrays;

public class Practice0421 {

    public static void main(String[] args) {
        int[] array = {11,22,33,44,55,66};
        System.out.println(BinarySearch(array,55));
    }
    public static int BinarySearch(int[] array,int key){
        int left=0;
        int right=array.length-1;
        while(left <= right) {
            int mid = (left+right)>>1;
            if(key>array[mid]) {
                left = mid+1;
            }
            if(key<array[mid]) {
                right=mid-1;
            }
            if(key == array[mid]) {
                return mid;
            }
        }
        return -1;
    }
    public static void main1(String[] args) {
        int[] array1 = {1,2,3};
        /*int[] output = tranform(array1);
        printArray(output);*/
        /*System.out.println(Arrays.toString(Arrays.copyOf(array1,array1.length)));*/
        System.out.println(ArrayMax(array1));
    }
    public static int ArrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int[] tranform(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i <array.length; i++) {
            ret[i] = 2*array[i];
        }
        return ret;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
