package HomeWork9;

import java.util.List;

public class Student {

    private String name;
    private List<Course> coursesList;

    public Student(String name, List<Course> coursesList) {
        this.name = name;
        this.coursesList = coursesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }
}
