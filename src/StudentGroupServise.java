import java.util.ArrayList;
import java.util.List;

public class StudentGroupServise{

    private StudentsGroup studentsGroup;
    private Integer count; 
    public StudentGroupServise(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public void RemoveTheStudent (String firstName, String lastName ){
        this.count = 0;
        for (Student item: this.studentsGroup)
            if ((item.getFirstName().toLowerCase().equals(firstName.toLowerCase()))&&
                (item.getLastName().toLowerCase().equals(lastName.toLowerCase())))
                    {   studentsGroup.iterator().previous();
                        studentsGroup.iterator().remove();
                        this.count++;}
            if (count==0) System.out.println("Student " + 
            firstName + " " + lastName + " not found");    
}
}