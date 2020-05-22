import java.util.Arrays;
import java.util.Random;

public class Sort {
    /**
     * 冒泡排序
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     * 稳定
     * @param array
     */
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    //优化
    public static void bubbleSort2(int[] array){
        boolean flg = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false){
                return;
            }
        }
    }


    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len) {
            if (child + 1 < len && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }
    public static void createHeap(int[] array){
        for(int i = (array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }
    }
    /**
     * 堆排序
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(1)
     * 不稳定
     * @param array
     */
    public static void heapSort(int[] array){
        createHeap(array);
        int end = array.length-1;
        while (end>0){
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**
     * 选择排序
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     * 不稳定
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                int tmp = array[i];
                if(array[i]>array[j]){
                    array[j] = tmp;
                }
            }
        }
    }
    public static void shell(int[] array,int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-gap; j >= 0; j -= gap) {
                if(array[j] > tmp){
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    //希尔排序
    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }

    /**
     * 插入排序
     * 时间复杂度：
     * 最坏: O(n^2)  最好 (有序情况): O(1)
     * 越有序越快
     * 空间复杂度: O(1)
     * 稳定
     * @param array
     */
    public static void insertSort(int[] array){
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if(array[j] > tmp){
                    //改为>=就会变为不稳定
                    array[j+1] = array[j];
                }else{
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10_0000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_0000);
        }
        long start = System.currentTimeMillis();
        insertSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void main1(String[] args) {
        int[] array = {10,5,8,4,1,9};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
