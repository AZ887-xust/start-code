import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;//有效数据个数
    public static final int intCapacity =10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize=0;
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    private boolean isFull() {
        /*if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //1.判断pos位置是否合法  负数且>usedSize就不合法
        //2.挪数据 i=usedSize-1 [i+1]=[i]  当i<pos,就挪完
        //3.this.elem[pos] = data;
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);//扩容
        }
        if(pos < 0 || pos >this.usedSize){
            return;
        }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize; i++) {
            if(this.elem[i] == toFind)
                return true;
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <this.usedSize; i++) {
            if(this.elem[i] == toFind)
                return i;
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //1.判断顺序表是否为空
        //2.pos合法性
        //3.return pos位置的元素
        if(isEmpty()) {
            //return -1;
            throw new RuntimeException("顺序表为空");//手动抛出异常
        }
        //也可以写一个checkPos()方法判断Pos的位置是否合法
        if(pos < 0 || pos >= this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }


    //删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
        //1.找toRemove在哪，并获取下标
        //2.循环 让后面的值赋给前面的值  [i]=[i+1]  i < useSize-1
        //3.usedSize--
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有要删除的数字");
            return;
        }
        for (int i = index ; i <this.usedSize-1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        if(this.usedSize == 0) {
            return 0;
        }
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }
}
