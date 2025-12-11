public class Main {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Introduction to Programming", 30);
        
        Student student = new Student("S12345", 2023);
        
        System.out.println("Student: " + student + ".Course: " + course);
    }
}