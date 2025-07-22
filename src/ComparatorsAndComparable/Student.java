package ComparatorsAndComparable;

public class Student implements Comparable<Student>{
    private  int id;
    private String name;
    private float Marks;

    public Student(int id, float marks, String name) {
        this.id = id;
        Marks = marks;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(float marks) {
        Marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public float getMarks() {
        return Marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
