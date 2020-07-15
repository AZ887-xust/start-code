import java.util.Scanner;
import java.util.Stack;

/*class Test
{
    private int data;
    int result = 0;
    public void m(){
        result += 2;
        data += 2;
        System.out.print(result+" "+data);
    }
}
class ThreadEx extends Thread{
    private Test mv;
    public ThreadEx(Test mv){
        this.mv = mv;
    }
    public void run(){
        synchronized (mv){
            mv.m();
        }
    }
}
class Test0601
{
    public static void main(String[] args) {
        Test mv = new Test();
        Thread t1 = new ThreadEx(mv);
        Thread t2 = new ThreadEx(mv);
        Thread t3 = new ThreadEx(mv);
        t1.start();
        t2.start();
        t3.start();

    }
}*/

public class Test01 {
    //A字符串中插入B字符串判断回文
    public static boolean func1(String s){
        int i=0;
        int j =s.length()-1;
        while(i<j){
            if(s.toCharArray()[i] != s.toCharArray()[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.next();
        int count = 0;
        for (int i = 0; i <= A.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder(A);
            stringBuilder.insert(i,B);
            if(func1(stringBuilder.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
    //快排找第K个大的数字
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }
    /**
     * 1.进行一次快排（将大的元素放在前半段，小的元素放在后半段）,假设得到的中轴为p
     * 2.判断 p - low + 1 == k ，如果成立，直接输出a[p]，（因为前半段有k - 1个大于a[p]的元素，故a[p]为第K大的元素）
     * 3.如果 p - low + 1 > k， 则第k大的元素在前半段，此时更新high = p - 1，继续进行步骤1
     * 4.如果 p - low + 1 < k， 则第k大的元素在后半段， 此时更新low = p + 1, 且 k = k - (p - low + 1)，继续步骤1.
     */
    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);
        if(k == part - low + 1)
            return a[part];
        else if(k > part - low + 1)
            return findKth(a, part + 1, high, k - part + low -1);
        else
            return findKth(a, low, part -1, k);
    }

    public int partation(int[] a, int low, int high) {
        int key = a[low];
        while(low < high) {
            while(low < high && a[high] <= key) high--;
            a[low] = a[high];
            while(low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}
