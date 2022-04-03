import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int clas;
    private SubjectStudent subject;


    public Student(String name, int age, int clas, SubjectStudent subject) {
        this.name = name;
        this.age = age;
        this.clas = clas;
        this.subject = subject;
    }


    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name) + (age - o.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age) + 13 * 17;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && age==student.age;
    }

    @Override
    public String toString() {
        return "ФИО - " + name + ", Возраст - " + age + ", Класс - " + clas + ", Любимый предмет - " + subject.getName() + "\n";
    }

    public SubjectStudent getSubject() {
        return subject;
    }

    public void setSubject(SubjectStudent subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }
}



