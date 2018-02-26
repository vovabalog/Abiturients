import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        Student student0 = new Student();
        Student student1 = new Student();

        student0.createStudent("Vova", "Balog", 4, 10412164);
        student1.createStudent("Vasia", "Ivanov", 3, 1111111);

        Group group0 = new Group("CS-123");
        //group0.createGroup("CS", 111, 2);
        group0.addStudent(student0);
        group0.addStudent(student1);

        Professor professor1 = new Professor("Ivan", "Petrov", "Math");
        System.out.println(professor1.doRollCall(group0));
        System.out.println(group0.getClassMonitor(group0.getRating()));


        //System.out.println(group0.getStudentList());

    }

}
