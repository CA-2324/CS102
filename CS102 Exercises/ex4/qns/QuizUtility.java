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
        // your code here!
        return null;
    }
}