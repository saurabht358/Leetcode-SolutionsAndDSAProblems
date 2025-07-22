package JAVA_OOPs;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student();
        kunal.show();
        Student saurabh = new Student(19,"saurabh",93.0f);
        saurabh.show();
    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(){
         rno = 12;
         name = "rohan";
         marks = 94.3f;
    }

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.rno = other.rno;
        this.name= other.name;
        this.marks = other.marks;
    }
    void show(){
        System.out.println(rno);
        System.out.println(name);
        System.out.println(marks);
    }
}
