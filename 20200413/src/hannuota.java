public class hannuota {
    public static void move(char pos1,char pos2) {
        System.out.println(pos1 + "->" + pos2+" ");
    }

    /**
     *
     * @param n 盘子个数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 目的位置
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if(n==1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        // 1 A->C      1  2^1-1
        // 2 A->B  A->C B->C      2  2^2-1
        // 3 A->C  A->B C->B A->C B->A B->C A->C       7  2^3-1
        //有n个盘子，先把n-1个盘子放在其他盘
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');

    }
}
