package quiz.util;
import quiz.domain.membership.SMUCitizen;
import quiz.domain.membership.Staff;
import quiz.domain.membership.Student;
import java.util.ArrayList;
import java.util.List;
public class QuizUtility {
    public static void main(String[] args) {
        {
            List<SMUCitizen> students = new ArrayList<>();
            students.add(new Staff("Ali", "SIS"));
            students.add(new Staff("Boy", "SOA"));
            students.add(new Staff("Carl", "SESS"));
            students.add(new Student("Don", "SOL"));
            students.add(new Staff("Elise", "SOE"));
            students.add(new Student("Frank", "LKCSB"));
            System.out.println(getStudents(students));
        }
        {
            List<SMUCitizen> students = new ArrayList<>();
            System.out.println(getStudents(students));
        }
        {
            List<SMUCitizen> students = null;
            System.out.println(getStudents(students));
        }
    }

    public static List<Student> getStudents(List<SMUCitizen> citizenList) {
        if (citizenList == null) {
            return new ArrayList<>();
        }
        List<Student> result = new ArrayList<>();
        for (SMUCitizen citizen: citizenList) {
            if (citizen instanceof Student) {
                result.add((Student) citizen);
            }
        }
        return result;
    }
}