package FactoryDesignPattern;

import java.util.Arrays;
import java.util.List;

public class HLDCourse implements Course {
    @Override
    public List<String> getAllModules() {
        return Arrays.asList("LoadBalancer" , "CAP Theorem" , "SQL vs NoSQL" , "Cache");
    }

    @Override
    public Integer getCourseDuration() {
        return 3;
    }

    @Override
    public String getCourseHeadLine() {
        return "Welcome to HLD Course";
    }
}
