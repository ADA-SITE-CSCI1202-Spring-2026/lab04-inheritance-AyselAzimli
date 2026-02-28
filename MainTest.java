public class MainTest {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", "Male");
        Person p2 = new Person("John", "Doe", "Male");
        p1.printPerson();
        System.out.println("Person equals: " + p1.equals(p2));
        
        String[] courses = {"Math", "Physics"};
        Teacher t1 = new Teacher("Jane", "Smith", "Female", "Science", courses);
        Teacher t2 = new Teacher("Jane", "Smith", "Female", "Science", courses);
        t1.printTeacher();
        System.out.println("Teacher equals: " + t1.equals(t2));
        
        Student s1 = new Student("Bob", "Johnson", "Male", "S12345");
        Student s2 = new Student("Bob", "Johnson", "Male", "S12345");
        s1.printStudent();
        System.out.println("Student equals: " + s1.equals(s2));
        
        String[] phdCourses = {"Advanced Math", "Research Methods"};
        PhdStudent ps1 = new PhdStudent("Alice", "Williams", "Female", "PHD001", 
                                        "Computer Science", phdCourses);
        PhdStudent ps2 = new PhdStudent("Alice", "Williams", "Female", "PHD001", 
                                        "Computer Science", phdCourses);
        ps1.printPHD();
        System.out.println("PhdStudent equals: " + ps1.equals(ps2));
    }
}