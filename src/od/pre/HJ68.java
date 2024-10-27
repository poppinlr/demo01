package od.pre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Student{
    String name;
    int score;

    public Student(){}
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
}
public class HJ68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            students.add(new Student(arr[0], Integer.parseInt(arr[1])));
            System.out.println(students.size());
        }
    }
}
