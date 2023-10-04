import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List <Student> temp = new ArrayList<>();
        Student student1 = new Student("Anton");
        System.out.println(student1);
        System.out.println(student1.getStudentId());
        Student student2 = new Student("Grigory");
        System.out.println(student2);
        System.out.println(student2.getStudentId());
        Student student3 = new Student("Olga");
        System.out.println(student3);
        System.out.println(student3.getStudentId());
        StudentsGroup studentsGroup1 = new StudentsGroup(111);
        studentsGroup1.AddStudent(student1);
        studentsGroup1.AddStudent(student2);
        studentsGroup1.AddStudent(student3);
        System.out.println(studentsGroup1);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        while (studentsGroup1.iterator().hasNext()){
            System.out.println(studentsGroup1.iterator().next());
        }
/*         studentsGroup1.iterator().remove();
        studentsGroup1.iterator().remove(); */
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        StudentGroupServise servise = new StudentGroupServise(studentsGroup1);
        Controller controller = new Controller(servise);
        //controller.RemoveTheStudent("Anton", "Anton");
        controller.RemoveTheStudent("Grigory", "Grigory");
        //servise.RemoveTheStudent("Olga", "Olga");
        //servise.RemoveTheStudent("Anton", "Anton");
        //servise.RemoveTheStudent("Grigory", "Grigory");
            for (Student items: studentsGroup1){
            System.out.println(items);
        }
    }
}
