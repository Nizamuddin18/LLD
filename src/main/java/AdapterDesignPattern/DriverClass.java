package AdapterDesignPattern;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudentList();
    }
}
