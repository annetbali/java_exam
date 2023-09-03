import java.util.ArrayList;

//defining a Student class with attributes name, grade, course
public class Student {
    private String name;
    private static double grade;
    private ArrayList<String> courses;
    //initializing the attributes in a constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    //    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourse(ArrayList<String> courses) {
        this.courses = courses;
    }
    //defining a method that adds a course
    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }
    public void printStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args){
        Student student = new Student("Annet",12);
        System.out.println("Student Details:");
        student.printStudentDetails();

        System.out.println("Adding courses for " + student.getName());
        student.addCourse("Python");
        student.addCourse("Data Structures");
        student.addCourse("Java");

        System.out.println(student.getName() + "has courses: " + student.getCourses());

        System.out.println("Removing a course for " + student.getName());
        student.removeCourse("Data Structures");



    }


}
