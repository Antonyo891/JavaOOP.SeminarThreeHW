import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List <Student> temp = new ArrayList<>();
        for (Integer i=1;i<17;i++)
        temp.add(new Student(Integer.toString(i)));
        StudentsGroup studentsGroup1 = new StudentsGroup(111);
        for (int i=0;i<7;i++) studentsGroup1.AddStudent(temp.get(i));
        StudentsGroup studentsGroup2 = new StudentsGroup(222);
        for (int i=8;i<11;i++) studentsGroup2.AddStudent(temp.get(i));
        StudentsGroup studentsGroup3 = new StudentsGroup(333);
        for (int i=12;i<16;i++) studentsGroup3.AddStudent(temp.get(i));
        ArrayList<StudentsGroup> studentsGroupsList = new ArrayList<>();
        studentsGroupsList.add(studentsGroup1);
        studentsGroupsList.add(studentsGroup2);
        studentsGroupsList.add(studentsGroup3);
        StreamOfGroup stream1 = new StreamOfGroup(studentsGroupsList);
        List <Student> temp1 = new ArrayList<>();
        for (Integer i=17;i<38;i++)
        temp1.add(new Student(Integer.toString(i)));
        StudentsGroup studentsGroup4 = new StudentsGroup(444);
        for (int i=0;i<6;i++) studentsGroup4.AddStudent(temp1.get(i));
        StudentsGroup studentsGroup5 = new StudentsGroup(555);
        for (int i=7;i<12;i++) studentsGroup5.AddStudent(temp1.get(i));
        StudentsGroup studentsGroup6 = new StudentsGroup(666);
        for (int i=12;i<20;i++) studentsGroup6.AddStudent(temp1.get(i));
        ArrayList<StudentsGroup> studentsGroupsList2 = new ArrayList<>();
        studentsGroupsList2.add(studentsGroup4);
        studentsGroupsList2.add(studentsGroup5);
        //studentsGroupsList2.add(studentsGroup6);
        StreamOfGroup stream2 = new StreamOfGroup(studentsGroupsList2);
        ArrayList<StreamOfGroup> streamOfGroupsList = new ArrayList<>();
        streamOfGroupsList.add(stream1);
        streamOfGroupsList.add(stream2);
        StreamServise streamServise = new StreamServise(streamOfGroupsList);
        System.out.println(streamServise);
        //streamOfGroupsList.sort(new StreamComparator());
        //System.out.println(streamOfGroupsList);
        //streamServise.StreamSort();
        Controller controller = new Controller(streamServise);
        controller.SortStreamOfGroupServise();
        System.out.println(streamServise);
        
        }
    }
