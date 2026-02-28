import java.util.Arrays;

public class Teacher extends Person {
    private String department;
    private String[] courses;
    
    public Teacher() {}
    
    public Teacher(String firstName, String lastName, String gender, 
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    

    public String getDepartment() {
         return department; 
    }
    public void setDepartment(String department) {
         this.department = department;
    }
    
    public String[] getCourses() {
         return courses; 
    }
    public void setCourses(String[] courses) { 
        this.courses = courses; 
    }
    
     public String printTeacher() {
        return "Teacher [firstName=" + getFirstName() + ", lastName=" + getLastName() +
               ", gender=" + getGender() + ", department=" + department + 
               ", courses=" + Arrays.toString(courses) + "]";
    }
    
    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) &&
               this.department.equals(t.department) &&
               Arrays.equals(this.courses, t.courses);
    }
}