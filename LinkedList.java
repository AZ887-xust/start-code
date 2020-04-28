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
        //找删除节点的前一个节点
        private Node searchPrev(int key) {
            Node prev = this.head;
            while(prev.next != null) {
                if(prev.next.data != key) {
                    return prev;
                }
                else {
                    prev = prev.next;
                }
            }
            return null;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){
            if(this.head == null) {
                return;
            }
            if(this.head.data == key) {
                this.head = this.head.next;
                return;
            }
            Node prev = searchPrev(key);
            if(prev == null) {
                System.out.println("没有此节点");
                return;
            }
            Node del = prev.next;
            prev.next = del.next;
        }

        //删除所有值为key的节点
        public void removeAllKey(int key){
            Node prev = this.head;
            Node cur = this.head.next;//代表要删除的节点
            while(cur != null) {
                if(cur.data == key) {
                    prev.next = cur.next;
                    cur = cur.next;
                }
            }
            if(this.head.data == key) {
                this.head = this.head.next;
            }
        }
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
        //释放内存
        public void clear(){
            this.head = null;
        }
        public Node reverseList() {
            Node prev = null;
            Node cur = this.head;
            Node newHead = null;
            while(cur != null) {
                Node curNext = cur.next;
                if(curNext == null){
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return newHead;
        }
    public void display2(Node newHead){
        Node cur = newHead;
        while(cur !=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public Node middleNode() {
            Node fast = this.head;
            Node slow = this.head;
            while(fast != null && fast != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
    }
    public Node findKthToTail(int k) {
            if(this.head == null){
                return null;
            }
            if(k<=0){
                System.out.println("k不合法");
                return null;
            }
            Node fast = this.head;
            Node slow = this.head;
            while(k-1 > 0) {
                if(fast.next != null) {
                    fast = fast.next;
                    k--;
                }else {
                    System.out.println("没有此节点");
                    return null;
                }
            }
            while(fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
    }
    public Node partition(int x) {
            Node bs=null;
            Node be=null;
            Node as=null;
             Node ae=null;
            Node cur=this.head;
            while (cur != null) {
                if(cur.data < x) {
                    //第一次插入
                    if (bs == null) {
                        bs = cur;
                        be = cur;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }
                else {
                    if (as == null) {
                        as = cur;
                        ae = cur;
                    }else {
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            //1.判断bs是否为空 若bs==null 返回as
        if(bs == null){
            return as;
        }
            //2.如果bs不为空 需要拼接
        be.next=as;
            //3.如果ae不为空  ae.next置为空
        if(ae != null){
            ae.next = null;
        }
        return bs;
    }
    //删除重复节点
    public Node deleteDuplication(){
           Node cur = this.head;
           Node newHead = new Node(-1);//虚拟节点
           Node tmp = newHead;
           while(cur != null) {
               if (cur.next != null && cur.data == cur.next.data) {
                   while (cur.next != null && cur.data == cur.next.data){
                        cur = cur.next;
                   }
                   cur = cur.next;
                }else{
                   tmp.next = cur;
                   tmp = tmp.next;
                   cur = cur.next;
               }
           }
           tmp.next = null;//防止最后一个节点是相同的，形成死循环。手动置空
           return newHead.next;
    }
    //回文结构
    public boolean chkPalindrome() {
        //单链表为空肯定不是回文结构
        if(this.head == null) {
            return false;
        }
        //只有头节点自己，必然为回文结构
        if(this.head.next == null) {
            return true;
        }
        //1.找到单链表的中间部分
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2.反转链表的后半部分
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //slow已经是最后一个节点
        //3.开始一个从头走（head），一个从尾走（slow）
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            //判断偶数长度的链表
            if(this.head.next == slow){
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
    //是否有环
    public boolean hasCycle() {
            if(this.head == null){
                return false;
            }
            Node fast = this.head;
            Node slow = this.head;
            while(fast!=null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
    }
    public boolean hasCycle2() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return true;
        }
        return false;
    }
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        }




}
