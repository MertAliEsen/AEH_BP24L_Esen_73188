import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class myEleventhApp {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.##");

        List<Student> students = Arrays.asList(
            new Student("1", "Tom", "Smith", Arrays.asList(4, 5, 3, 5)),
            new Student("2", "Anna", "Brown", Arrays.asList(5, 5, 4, 4)),
            new Student("3", "John", "White", Arrays.asList(2, 3, 2, 4)),
            new Student("4", "Kate", "Green", Arrays.asList(5, 4, 4, 5))
        );

        Student best = students.get(0);

        for (Student student : students) {
            if (student.calculateAverageGrade() > best.calculateAverageGrade()) {
                best = student;
            }
        }

        double totalAverage = 0;

        for (Student student : students) {
            totalAverage += student.calculateAverageGrade();
        }

        double classAverage = totalAverage / students.size();

        System.out.println("student with highest avarage " + best.getFirstName() + " " + best.getLastName() + " " + format.format(best.calculateAverageGrade()));
        System.out.println("class avarage " + format.format(classAverage));

        List<Student> sortedStudents = new ArrayList<Student>(students);
        sortedStudents.sort((a, b) -> a.getLastName().compareTo(b.getLastName()));

        System.out.println("students sorted by last name");

        for (Student student : sortedStudents) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getIndexNumber() + " avarage " + format.format(student.calculateAverageGrade()));
        }
    }
}
