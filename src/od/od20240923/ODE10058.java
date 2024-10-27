package od.od20240923;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    String classNum;//班级编号
    String num;//学号
    int sum;//成绩
    String str;

    public Student(String classNum, String num, int sum, String str){
        this.classNum = classNum;
        this.num = num;
        this.sum = sum;
        this.str = str;
    }

    public Student(){

    }
}

/**
 * 班级编号升序
 * 成绩和降序
 * 学号升序
 */
public class ODE10058   {

    public static void main(String[] args) {
//        String s = "01202021";
//        System.out.println(s.substring(0,5));
//        System.out.println(s.substring(5));
        Scanner sc = new Scanner(System.in);
        String[] students1 = sc.nextLine().split(";");
        String[] students2 = sc.nextLine().split(";");

        //筛选出两门成绩的学生
        Map<String, List<Integer>> validStudents = new HashMap<>();
        init(validStudents, students1);
        init(validStudents, students2);

        Map<String, List<Student>> map = new HashMap<>();

        validStudents.forEach((k, v) -> {
            if(v.size()==2){
                String classNum = k.substring(0,5);
                String num = k.substring(5);
                int sum = v.get(0) + v.get(1);
                Student student = new Student(classNum, num, sum, k);
                if(map.containsKey(classNum)){
                    map.get(classNum).add(student);
                } else {
                    List<Student> list = new ArrayList<>();
                    list.add(student);
                    map.put(classNum, list);
                }
            }
        });

        if(map.isEmpty()){
            System.out.println("NULL");
        }

        map.keySet().stream().toList().stream().sorted().forEach(num -> {
            System.out.println(num);
            List<Student> list = map.get(num);
            list.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.sum==o2.sum){
                        return o1.num.compareTo(o2.num);
                    } else {
                        return o2.sum - o1.sum;
                    }
                }
            });
            System.out.println(list.stream().map(s -> s.str).collect(Collectors.joining(";")));
        });
    }

    private static void init(Map<String, List<Integer>> validStudents, String[] students1) {
        for (String student : students1) {
            String[] stuStr = student.split(",");
            String num = stuStr[0];
            int g = Integer.parseInt(stuStr[1]);
            if (validStudents.containsKey(num)) {
                validStudents.get(num).add(g);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(g);
                validStudents.put(num, list);
            }
        }
    }
}
