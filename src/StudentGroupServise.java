import java.util.ArrayList;
import java.util.List;

public class StudentGroupServise{

    private List <Student> removeStudentList = new ArrayList<>();
    
    public List<Student> RemoveTheStudent (String name, List<Student> listOfStudents ){
        for (var item: listOfStudents) {
            if (item.getName().toLowerCase().equals(name.toLowerCase())) {
                listOfStudents.remove(item);
                removeStudentList.add(item);
                System.out.println("Student " + name + 
                " remove from group № " + item.getNumberOfGroup());
            }  
    }
    return listOfStudents;
}
}