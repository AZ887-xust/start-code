import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2) {
        return o2-o1;
    }

}
public class topK {
    //求前K个最小的数字  建立大小为K的大堆
    //求前K个最大的数字  建立大小为K的小堆
    public static Integer[] topK(int[] array,int k){
        MyComparator myComparator = new MyComparator();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);

        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size()<k){
                maxHeap.offer(array[i]);
            }else {
                Integer val = maxHeap.peek();
                if(val != null && val > array[i]){
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
            int v = maxHeap.poll();
            ret[i] = v;
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {13,1,7,8,18,20,15};
        Integer[] ret = topK(array,4);
        System.out.println(Arrays.toString(ret));
    }
}
