public class Controller {
    private StudentGroupServise studentGroupServise;

    public Controller(StudentGroupServise studentGroupServise) {
        this.studentGroupServise = studentGroupServise;
    }
    public void RemoveTheStudent (String firstName, String lastName){
        this.studentGroupServise.RemoveTheStudent(firstName, lastName);
    }

    public void SortStudentGroup (){
        this.studentGroupServise.Sort(null);
    }
}
