import java.util.ArrayList;
import java.util.List;

public class StudentsGroup  {
    private Integer groupId, numberOfGroup;
    private ArrayList <Student> listOfStudent;
    private static Integer id =0;

    private Integer GenerateId(){
        this.groupId=this.id+1;
        this.id=this.groupId;
        return this.groupId;
    }

    public StudentsGroup(Integer numberOfGroup) {
        this.groupId = GenerateId();
        this.numberOfGroup = numberOfGroup;
        this.listOfStudent = new ArrayList<>();
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public ArrayList<Student> getListOfStudent() {
        return this.listOfStudent;
    }

    public void setListOfStudent(ArrayList<Student> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }

   /*  public Student GetStudentById (Integer studentId){
        for (Student item:this.listOfStudent){
            if (item.getStudentId()==studentId) return item;
        }
        System.out.println("Student with this Id not found");
        return null;
    } */
    
    public void AddStudent(Student student){
        this.listOfStudent.add(student);
        student.setNumberOfGroup(this.getNumberOfGroup());
    }

    public void UpdateGroup (ArrayList<Student> studentsList){
        this.listOfStudent = studentsList;
    }
    @Override
    public String toString() {
        return "{" +
            " groupId='" + getGroupId() + "'" +
            ", numberOfGroup='" + getNumberOfGroup() + "'" +
            ", number of student ='" + this.listOfStudent.size() + "'" +
            "}";
    }

}
