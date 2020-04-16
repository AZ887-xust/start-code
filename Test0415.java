import java.util.Arrays;


public class Test0415 {
    /*
    * 拷贝数组
    * 1.for循环
    * 2.copyOf
    * 3.System.arraycopy 最快
    * 4.array.clone()
    * 以上4种都是浅拷贝
    * 浅拷贝； 数组中存放李引用类型（地址），array2修改元素值就是修改地址指向的变量，array1中地址指向的变量也随之修改。
    * 深拷贝；拷贝到数据的新数组array2修改自己的元素不会影响到原数组array1
    *
    * */
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(copyArray(array)));

        int[] ret =Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));

        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));

        int[] ret1=array.clone();
        System.out.println(Arrays.toString(ret1));

    }
    public static int[] copyArray(int[] array) {
        int[] ret=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            ret[i]=array[i];
        }
        return ret;
    }

    public static void main2(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(ArrayMax(array));
    }
    public static int ArrayMax(int[] array) {
        int max=array[0];
        for (int i = 1; i <array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    //二分查找：Arrays.binarySearch
    //array:序列    key:查找的数字
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = (left+right)>>>1;//无符号右移，相当于/2
            if(array[mid]<key) {
                left = mid+1;
            }
            else if(array[mid]>key) {
                right = mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] array={1,2,3,4,5,6};
        //System.out.println(binarySearch(array,4));
        System.out.println(Arrays.binarySearch(array,4));//二分查找
    }

    public static void main4(String[] args) {
        int arr[] = {1,2,3,10,5,6};
        System.out.println(isUp(arr));
    }
    //判断升序
    public static boolean isUp(int[] array) {
        int i=0;
        while(i < array.length-1) {
            if(array[i]>array[i+1])
            {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main5(String[] args) {
        int[] arr = {1,2,6,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) { //趟数
            boolean flg=false;//优化：如果发生交换就置为true，没有交换说明是升序
            for (int j = 0; j <arr.length-1-i; j++) {
                flg = false;//
                if(arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg=true;
                }
            }
            if(flg == false){
                break;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
// [0, bound) 构成了一个前闭后开区间, 表示已排序区间
// [bound, length) 构成了一个前闭后开区间, 表示待排序区间
// 每循环一次, 就找到一个合适大小的元素, 已排序区间就增大1.
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        }
    }

    public static void swap(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        //偶前奇后
        while (left < right) {
            // 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            } // 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            } // 交换两个位置的元素
            if (left < right) { //有可能是left和right相遇，需要再加判断
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }

        }
    }




}

