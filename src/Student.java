public class Student {
    private Integer studentId, numberOfGroup;
    private String firstName, lastName;
    protected static Integer id=0;
    
    
    private Integer GenerateId(){
        this.studentId=this.id+1;
        this.id=this.studentId;
        return this.studentId;
    }

    public Student(String firstName, String lastName, Integer numberOfGroup) {
        this.studentId=GenerateId();
        this.numberOfGroup = numberOfGroup;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName) {
        this(firstName,firstName, null);
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getLastName() + "'" + getFirstName() +
            ", numberOfGroup='" + getNumberOfGroup() + "'" +
            ", id='" + getStudentId() + "'" +
            "}";
    }


}
