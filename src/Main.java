import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int numMenu = 0;

        Set<Student> students = new HashSet<Student>();
        students.add(new Student("Иванов Иван Иванович", 15,8, SubjectStudent.MATHS));
        students.add(new Student("Авякин Семен Семенович", 13, 6, SubjectStudent.Literature));
        students.add(new Student("Авякин Сидор Сидорович", 11, 5, SubjectStudent.Geography));
        //students.(new Student("Иванов Иван Иванович", 15,8, SubjectStudent.MATHS));
        Scanner scr = new Scanner(System.in).useDelimiter("\n");
        //System.out.println(students.get(1).toString());
        System.out.println(students.toString());

        while (numMenu != 5) {
            Menus.MyMenu();
            numMenu = scr.nextInt();
            switch (numMenu) {
                case 1:
                    //Set<Student> newStudent = new HashSet<Student>();
                    System.out.println("Введи ФИО ученика");
                    //scr.next();
                    String fio= scr.nextLine();
                    System.out.println("Введи возраст ученика");
                    int age= scr.nextInt();
                    //students.equals(fio);
                    System.out.println("Введи класс ученика");
                    int clas= scr.nextInt();
                    System.out.println("Введи название любимого предмета на английском");
                    students.add(new Student(fio, age, clas, SubjectStudent.valueOf(scr.next())));
                    System.out.println(students.toString());
                   /* System.out.println("Введи ФИО ученика");
                    scr.next();
                    String fio= scr.nextLine();
                    System.out.println("Введи возраст ученика");
                    int age= scr.nextInt();
                    students.equals(fio);
                    System.out.println("Введи класс ученика");
                    int clas= scr.nextInt();
                    System.out.println("Введи название любимого предмета на английском");
                    //String sub= scr.nextLine();
                   // System.out.println("Введи название любимого предмета на русском");
                    //String sub2= scr.nextLine();
                    students.add(new Student(fio,age,clas,SubjectStudent.valueOf(scr.next())));*/
                    //System.out.println(newStudent.toString());
                    break;
                /*case 2:
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
                    break;*/
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

