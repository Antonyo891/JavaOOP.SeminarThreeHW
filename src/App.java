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
        //System.out.println(student1);
        //System.out.println("-------------");
        //System.out.println(student2);
        //System.out.println("-------------");
        //System.out.println(student3);
        //System.out.println("-------------");
        /*while (studentsGroup1.hasNext()){
            System.out.println(studentsGroup1.next());
        }*/
        for (var items: studentsGroup1){
            System.out.println(items);
        }
        StudentGroupServise servise = new StudentGroupServise();
        temp = servise.RemoveTheStudent("Olga", studentsGroup1.getListOfStudent());
        studentsGroup1.UpdateGroup(temp);
        for (var items: studentsGroup1){
            System.out.println(items);
        }
    }
}
