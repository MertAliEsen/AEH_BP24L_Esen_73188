import java.util.List;

public class Student {
    private String index;
    private String name;
    private String surname;
    private List<Integer> grades;

    public Student(String index, String name, String surname, List<Integer> grades) {
        this.index = index;
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return index;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return surname;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
}
