import java.util.Arrays;

public class Heap {

    public int[] elem;
    public int usedSize;

    public Heap() {
        this.elem = new int[10];
    }

    /**
     *
     * @param root 每棵子树的开始位置
     * @param len  结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        //传过来是usedSize-1的话child<=len
        while (child < len) {
            //0、判断是否有左右孩子  有的话 找到最大值 C下标表示最大值下标
            if(child+1 < len && this.elem[child]<this.elem[child+1]) {
                child++;
            }
            //代码指向到这里，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }
    //创建堆 O(n)
    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i：每棵子树的根节点下标
        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }
    //插入数据 O(log2 n)
    public void push(int val) {
        //0、堆是否是满的--》扩容
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        //1、放到数组的最后一个位置
        this.elem[usedSize] = val;
        this.usedSize++;

        //2、进行调整
        adjustUp(this.usedSize-1);
    }
    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if(this.elem[child] > this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else{
                break;
            }
        }
    }
    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }

    //删除 堆顶元素
    public void pop(){
        //0 是否是空的
        if(isEmpty()){
            return;
        }
        //最后一个元素和堆顶元素交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        //调整0号下标的树
        adjustDown(0,this.usedSize);
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }

    public int peek(){
        if(isFull()){
            return -1;
        }
        return this.elem[0];
    }

    //堆排序  大根堆
    // 时间复杂度：O(n*log2 n)+O(n) -->O(n*log2 n)
    // 空间复杂度：O(1)
    public void heapSort(){
        int end = this.usedSize-1;
        while(end > 0){
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;
        }
    }

    //top-k 找前K个最小的/最大的元素


    public void show(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }



}
