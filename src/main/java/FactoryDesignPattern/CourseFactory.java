package FactoryDesignPattern;

public class CourseFactory {
    public static Course getCourse(String type) {
        Course course = null;
        if ("DSA".equalsIgnoreCase(type)) {
            course = new DSACourse();
        } else if ("HLD".equalsIgnoreCase(type)) {
            course = new HLDCourse();
        }
        return course;
    }
}
