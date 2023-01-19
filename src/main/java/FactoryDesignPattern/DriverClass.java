package FactoryDesignPattern;


import java.util.Locale;

public class DriverClass {

    public static void main(String[] args) {
        Course course = CourseFactory.getCourse("HLD");
        System.out.println("Course HeadLine : " + course.getCourseHeadLine());
        System.out.println("Course Duration : " + course.getCourseDuration() + " months.");
        System.out.print("Course Modules are : " + course.getAllModules());
    }

}
