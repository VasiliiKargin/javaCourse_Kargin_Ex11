import com.sun.javafx.collections.ImmutableObservableList;

import javax.security.auth.Subject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numMenu = 0;

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Иванов Иван Иванович", 15,8, SubjectStudent.MATHS));
        students.add( new Student("Авякин Семен Семенович", 13, 6, SubjectStudent.Literature));
        students.add( new Student("Авякин Сидор Сидорович", 11, 5, SubjectStudent.Geography));
        Scanner scr = new Scanner(System.in);
        //System.out.println(students.get(1).toString());

        while (numMenu != 5) {
            Menus.MyMenu();
            numMenu = scr.nextInt();
            switch (numMenu) {
                case 1:
                    students.add(new Student(scr.nextLine(), scr.nextInt(), scr.nextInt(),SubjectStudent.valueOf(scr.next())));
                    break;
                case 2:
                    students.sort(Student::compareTo);
                    System.out.println(students.toString());
                    break;
                case 3:
                    Comparator<Student> compareStudent = new Comparator<Student>() {
                        @Override
                        public int compare(Student s1, Student s2) {
                            return s2.getName().compareTo(s1.getName()) + (s2.getAge() - s1.getAge());
                        }
                    };
                    Collections.sort(students, compareStudent);
                    System.out.println(students.toString());
                    break;
                case 4:
                    System.out.println("Введи индекс ученика для удаления!");
                    int indexStudent = scr.nextInt();
                    students.remove(indexStudent);
                    System.out.println(students.toString());
                    break;
            }
        }
        System.out.println("До свидания!");
    }
}

