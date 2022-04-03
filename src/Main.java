import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numMenu = 0;
        StudentComparator com = new StudentComparator();
        TreeSet<Student> students = new TreeSet<>(com);
        TreeSet<Student> studentReverse= new TreeSet<>();
        Scanner scr = new Scanner(System.in).useDelimiter("\n");
        students.add(new Student("Иванов Иван Иванович", 15, 8, SubjectStudent.MATH));
        students.add(new Student("Авякин Семен Семенович", 13, 6, SubjectStudent.Literature));
        students.add(new Student("Авякин Сидор Сидорович", 11, 5, SubjectStudent.Geography));
        while (numMenu != 5) {
            Menus.MyMenu();
            numMenu = scr.nextInt();
            switch (numMenu) {
                case 1:
                    int count= students.size();
                    System.out.println("Введи ФИО ученика");
                    String fio = scr.next();
                    System.out.println("Введи возраст ученика");
                    int age = scr.nextInt();
                    System.out.println("Введи класс ученика");
                    int clas = scr.nextInt();
                    System.out.println("Введи название любимого предмета на английском");
                    students.add(new Student(fio, age, clas, SubjectStudent.valueOf(scr.next())));
                    int count2=students.size();
                    if(count==count2){
                        System.out.println("Ученик уже в базе");
                    }
                    break;
                case 2:
                    System.out.println(students.toString());
                    break;
                case 3:
                    studentReverse= (TreeSet)students.descendingSet();
                    System.out.println(studentReverse.toString());
                    break;
                case 4:
                    System.out.println("Введи индекс ученика для удаления!");
                    int indexStudent = scr.nextInt();
                    students.remove(students.toArray()[indexStudent]);
                    break;
            }
        }
        System.out.println("До свидания!");
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()) + (s1.getAge() - s2.getAge());
    }
}


