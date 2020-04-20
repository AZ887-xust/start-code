//单链表:随用随取
class Node {
    //自定义节点属性
    public int data;
    public Node next; //null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public Node head; //保存单链表的头节点的引用(地址) 初始值为null

    // 1、无头单向非循环链表实现
        //头插法 插入到head前
        public void addFirst(int data){
            Node node = new Node(data);
            if(this.head == null) {
                //第一次插入节点
                this.head = node;
                return;
            }
            //先与后面建立关系，再移动头节点
            node.next = this.head;//下一个地址初始值为null，置为原来head节点的引用
            this.head = node;//head指向node的地址，此时node为头节点
        }
        //尾插法
        public void addLast(int data){
            Node node = new Node(data);
            if(this.head == null) {
                //第一次插入
                this.head = node;
                return;
            }
            Node cur = this.head;
            while(cur.next != null) {
                cur=cur.next;
            }
            cur.next = node;
        }
        //任意位置插入,第一个数据节点为0号下标 插到2号位置，就是插到1和2之间
        public void addIndex(int index,int data){
            if (index == 0) {
                this.addFirst(data);
                return;
            }
            if(index == this.size()){
                this.addLast(data);
                return;
            }
            Node node = new Node(data);
            //找到 index位置前一个节点的地址
            Node cur = searchIndex(index);
            //插入
            node.next = cur.next;
            cur.next = node;

        }
        private Node searchIndex(int index) {
            if(index <= 0 ||index > this.size()) {
                throw new RuntimeException("index位置不合法");
            }
            Node cur = this.head;
            int count=0;
            while (count != index-1) {
                cur=cur.next;
                count++;
            }
            return cur;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
            Node cur = this.head;
            while (cur != null) {
                if(cur.data != key){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){}
        //删除所有值为key的节点
        public void removeAllKey(int key){}
        //得到单链表的长度
        public int size(){
            int count=0;
            Node cur = this.head;
            while (cur != null) {
                cur = cur.next;
                count++;
                }
            return count;
        }
        public void display(){
            Node cur = this.head;
            while(cur !=null){
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
            System.out.println();
        }
        public void clear(){}

    /*// 2、无头双向链表实现
    public class DoubleLinkedList {
        //头插法
        public void addFirst(int data){}
        //尾插法
        public void addLast(int data){}
        //任意位置插入,第一个数据节点为0号下标
        public boolean addIndex(int index,int data){}
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){}
        //删除第一次出现关键字为key的节点
        public void remove(int key){}
        //删除所有值为key的节点
        public void removeAllKey(int key){}
        //得到单链表的长度
        public int size(){}
        public void display(){}
        public void clear(){}
    }*/

}
