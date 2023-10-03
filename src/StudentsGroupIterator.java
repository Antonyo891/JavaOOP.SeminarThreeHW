import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<String>
 {
    private ArrayList<Student> students;
    private static int index = 0;


    public StudentsGroupIterator(StudentsGroup studentsGroup) {
        this.students = studentsGroup.getListOfStudent();
    }

    @Override
    public boolean hasNext() {
        return index<this.students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        return this.students.get(index++);            
    }

    @Override
    public void remove() {
        if (hasNext()) this.students.remove(index);
    }

}
