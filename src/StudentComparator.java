import java.util.Comparator;

public class StudentComparator implements Comparator<Student>  {
     @Override
    public int compare(Student student1, Student student2) {
        int resultOfComparing = (student1.getFirstName().toLowerCase().compareTo(student2.getFirstName().toLowerCase()
        ));
        if (resultOfComparing==0)
        resultOfComparing = (student1.getLastName().toLowerCase().compareTo(student2.getLastName().toLowerCase()
        ));
        return resultOfComparing;}

    
}
