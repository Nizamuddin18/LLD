package FactoryDesignPattern;

import java.util.Arrays;
import java.util.List;

public class DSACourse implements Course{

    @Override
    public List<String> getAllModules() {
        return Arrays.asList("Searching-Sorting" , "Tree" , "Graph" , "DynamicProgramming");
    }

    @Override
    public Integer getCourseDuration() {
        return 4;
    }


    @Override
    public String getCourseHeadLine() {
        return "Welcome ";
    }
}
