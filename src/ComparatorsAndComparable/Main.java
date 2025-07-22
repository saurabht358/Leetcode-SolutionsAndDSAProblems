package ComparatorsAndComparable;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(3,84.3f,"tanmay"));
        studentList.add(new Student(2,24.3f,"ritik"));
        studentList.add(new Student(1,34.3f,"saurabh"));
        System.out.println(studentList);

        Collections.sort(studentList,new MarksComparator());
        System.out.println(studentList);
    }
}
