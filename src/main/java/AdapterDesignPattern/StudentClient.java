package AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        // Create a College Student
        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.setFirstName("Nizamuddin");
        collegeStudent.setSurName("Ahmed");
        collegeStudent.setEmail("ahmednizam2@gmail.com");
        // add collegeStudent to studentList
        studentList.add(collegeStudent);

        // Create a SchoolStudent
        SchoolStudent schoolStudent = new SchoolStudent();
        schoolStudent.setFirstName("Nizam");
        schoolStudent.setLastName("Ahmed");
        schoolStudent.setEmailAddress("ahmednizam74@gmail.com");
//      This will give a Compile-Time Error since CollegeStudent does not implement Student
        studentList.add(collegeStudent);
        // add schoolStudent to studentList
        studentList.add(new SchoolStudentAdapter(schoolStudent));

        return studentList;
    }
}
