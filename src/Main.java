import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentGroup> studentGroups = new ArrayList<>();

        List<Student> group1 = List.of(new Student("Группа1"), new Student("Группа2"));
        StudentGroup studentGroup1 = new StudentGroup(group1);

        List<Student> group2 = List.of(new Student("Группа1"), new Student("Группа2"), new Student("Группа3"));
        StudentGroup studentGroup2 = new StudentGroup(group2);

        Controller controller = new Controller();
        controller.addStudentGroup(studentGroups, studentGroup1);
        controller.addStudentGroup(studentGroups, studentGroup2);


        System.out.println("Группы до сортировки:");
        for (StudentGroup studentGroup : studentGroups) {
            for (Student student : studentGroup) {
                System.out.println(student);
            }
        }

        controller.sortStudentGroups(studentGroups);
        System.out.println("\nГруппы после сортировки:");
        for (StudentGroup studentGroup : studentGroups) {
            for (Student student : studentGroup) {
                System.out.println(student);
            }
        }
    }
}