package HomeWork9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Василий", Arrays.asList(new Course("Тестирование"),
                new Course("Дизайн"))));
        studentList.add(new Student("Игорь", Arrays.asList(new Course("Тестирование"),
                new Course("Программирование"), new Course("Аналитика"))));
        studentList.add(new Student("Николай", Arrays.asList(new Course("Тестирование"),
                new Course("Программирование"), new Course("Маркетолог"), new Course("Менеджмент"))));
        studentList.add(new Student("Виктор", Arrays.asList(new Course("Системный администратор"),
                new Course("Программирование"), new Course("Менеджмент"))));
        studentList.add(new Student("Анатолий", Arrays.asList(new Course("Системный администратор"),
                new Course("Программирование"))));
        studentList.add(new Student("Юрий", Arrays.asList(new Course("Системный администратор"),
                new Course("Менеджмент"))));

        studentList.stream()
                .map(s -> s.getCoursesList())
                .flatMap(c -> c.stream())
                .distinct()
                .forEach(System.out::println);

        studentList.stream()
                .sorted((s1,s2) -> s2.getCoursesList().size() - s1.getCoursesList().size())
                .limit(3)
                .forEach(System.out::println);

        Course course = new Course("Тестирование");
        studentList.stream()
                .filter(s -> s.getCoursesList().contains(course))
                .map(s -> s.getName())
                .forEach(System.out::println);
    }
}
