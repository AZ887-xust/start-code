import java.util.*;

public class Test08 {
    /*public static void main1(String[] args) {
        double x =3.0;
        int y =5;
        x/=--y;
        System.out.println(x);//0.75
    }*/

    public static void main1(String [] args){
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            /*
              super()函数指的是调用父类的构造方法
              1.new B()执行B的构造函数
              第一行是super(5);
              此时执行的是A的构造函数，A的构造函数调用的是setValue()方法，由于B重写了A的这个方法，
              所以执行的是B的 setValue()方法。
              即传入的参数是2*5=10
              此时，因为super，所以调用的是父类的 setValue()方法，即value=10
             */
            setValue(getValue() - 3);
            /*
                B没有getValue()方法，故执行父类的此方法，
                try返回的是value=10+1=11，保存在临时栈中
                finally中调用this的方法，这个this指的是B的对象，又重写，
                故就是B的 setValue()方法 value=2*11=22，第一个打印到屏幕上的数字
                接下来参数 getValue()-3=11-3=8
                传入B的 setValue()方法
                此时value=2*8=16
                至此，new B()执行结束
             */
        }
        public void setValue(int value){
            super.setValue(2 * value);
            /*
            new B(). getValue()
            B没有 getValue()，故执行A的 getValue()
            try返回16+1=17，保存到临时栈中
            finally调用B的 setValue()方法
            value=17*2=34，第二个打印到屏幕上面的数字
            最后主函数打印返回值，也就是打印try保存到临时栈中的17
             */
        }
    }

    /*static int cnt = 6;
    static {
        cnt += 9;
    }
    public static void main(String[] args) {
        System.out.println("cnt="+cnt);//5
    }
    static {
        cnt /=3;
    }*/

    /*
    有一个数组a[N]顺存放0~N-1,要求每隔两个数删掉一个数，到
    末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
    以8个数(N=7)为例: {0，1, 2, 3, 4, 5, 6，7}
    0->1->2(删除)->3->4->5(删除)->6->7->0(删除)，如此循环直到最后一个数被删除。
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            int i = 0;
            for (i = 0; i < n; i++) {
                list.add(i);
            }
            while (list.size() > 1) {
                i = (i + 2) % list.size();//?
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }

    /*
    找出n个数里最小的k个
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            Integer[] arr2 = new Integer[arr.length-1];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = Integer.parseInt(arr[i]);
            }
            int k = Integer.parseInt(arr[arr.length-1]);
            Integer[] ret = topK(arr2,k);
            System.out.println(Arrays.toString(ret));
        }
    }
    public static Integer[] topK(Integer[] array,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
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
}
