import java.util.*;

public class Test37 {

    //地下迷宫
    static int n, m, maxRemainEnergy = 0;
    static int[][] map;
    static boolean flag = false;
    static String path = "";
    static LinkedList<String> linkedlist = new LinkedList<>();

    public static void main1(String[] args) {

        //输入
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int P = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        //处理
        runMap(0, 0, P);

        //输出
        if (!flag)
            System.out.println("Can not escape!");
        else
            System.out.println(path);

    }

    public static void runMap(int x, int y, int energy) {
        if (energy < 0 || x < 0 || y < 0 || x >= n || y >= m || map[x][y] != 1) return;
        else {
            linkedlist.offer("[" + x + "," + y + "]");
            map[x][y] = 0;
            if (x == 0 && y == m - 1) {
                if (energy >= maxRemainEnergy) {
                    maxRemainEnergy = energy;
                    updatePath();
                }
                map[x][y] = 1;
                linkedlist.removeLast();
                flag = true;
                return;
            }
            runMap(x, y + 1, energy - 1);
            runMap(x + 1, y, energy);
            runMap(x - 1, y, energy - 3);
            runMap(x, y - 1, energy - 1);
            map[x][y] = 1;
            linkedlist.removeLast();
        }
    }

    public static void updatePath() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext())
            sb.append(iterator.next() + ",");
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();
    }

    //木棒拼图
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int num = 0;
        int j = 0;
        int max = 0;

        List<Integer> list = new ArrayList<>();
        while (j++ < n) {
            int i = sc.nextInt();
            int l = sc.nextInt();
            sc.nextLine();
            if (i == 1) {
                list.add(l);
                num += l;
            } else {
                list.remove(list.indexOf(l));
                num -= l;
            }
            Collections.sort(list);

            if(list.size() > 0){
                max = list.get(list.size()-1);
            }

            /*

        判断几条棍子能否组成面积大于 0 的简单多边形只需满足一个条件：

        木棍集合中找出一根最长的，记为 max_len
        除了这一根外，剩下的长度之和，记为 Len

        则必须满足 Len > max_len 。

        换言之， 设总长度为 Tlen，
        则仅当 Tlen - max_len > max_len 时，才能组成面积大于0 的简单多边形
             */
            if (num - max <= max) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
