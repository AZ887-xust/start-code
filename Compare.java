import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Card{
    public int rank;//数值
    public String suit;//花色
    public Card(int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    //重写equals,比较两个对象是否相同
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || !(obj instanceof Card)){
            return false;
        }
        Card tmp = (Card)obj;
        if(this.rank == tmp.rank && this.suit.equals(tmp.suit)){
            return true;
        }
        return false;
    }
}

class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int score;

    public Student(String name,int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //return this.score - o.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class AgeComparator implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
        return o1.age - o2.age;
    }
}
class ScoreComparator implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
        return o1.score - o2.score;
    }
}
class People{
    public int age;
    public String name;
    public int score;

    public People(int age, String name, int score) {

        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}



public class Compare {
    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();

        PriorityQueue<People> priorityQueue = new PriorityQueue<>(ageComparator);
        priorityQueue.offer(new People(36,"bit",89));
        priorityQueue.offer(new People(19,"bit2",86));
        System.out.println(priorityQueue);
    }
    public static void main5(String[] args) {
        People people1 = new People(36,"bit",89);
        People people2 = new People(19,"bit2",86);
        People[] people = new People[2];
        people[0] = people1;
        people[1] = people2;
        //比较器
        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));
    }
    public static void main4(String[] args) {
        People people1 = new People(36,"bit",89);
        People people2 = new People(19,"bit2",86);
        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(people1,people2));
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(people1,people2));
    }
    public static void main3(String[] args) {
        Student student1 = new Student("bit",36,89);
        Student student2 = new Student("bit2",19,86);
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(5,"♥");
        System.out.println(card1.equals(card2));
    }

    public static void main2(String[] args) {
        Student student1 = new Student("bit",36,89);
        Student student2 = new Student("bit2",19,86);
        if(student1.compareTo(student2) > 0){
            System.out.println(" 1>2");
        }
    }
}
