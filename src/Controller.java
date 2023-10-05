public class Controller {
    private StudentGroupServise studentGroupServise;
    private StreamServise streamServise;
    public Controller(StudentGroupServise studentGroupServise) {
        this.studentGroupServise = studentGroupServise;}
    public Controller(StreamServise streamServise) {
        this.streamServise = streamServise;
    }
    public void RemoveTheStudent (String firstName, String lastName){
        this.studentGroupServise.RemoveTheStudent(firstName, lastName);
    }

    public void SortStudentGroup (){
        this.studentGroupServise.Sort();
    }

     public void SortStudentGroupByName (){
        this.studentGroupServise.SortByName();
    }
    public void SortStreamOfGroupServise (){
        this.streamServise.StreamSort();
    }
}
