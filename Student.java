public class Student extends Person {
    private String studentId;
    
    public Student() {}
    
    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }
    
    public String getStudentId() {
         return studentId; 
    }
    public void setStudentId(String studentId) {
         this.studentId = studentId; 
    }
    
    public String printStudent() {
        return "Student [firstName=" + getFirstName() + ", lastName=" + getLastName() +
               ", gender=" + getGender() + ", studentId=" + studentId + "]";
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return super.equals(s) && this.studentId.equals(s.studentId);
    }
}