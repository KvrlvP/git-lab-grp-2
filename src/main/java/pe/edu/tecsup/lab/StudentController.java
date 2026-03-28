package
pe.edu.tecsup.lab;
import
java.util.*;
public class
StudentController
{
  public List<Object> getStudents() {
    try {
      List<Object> students = new ArrayList<>();
      students.add("Ana Garcia");
      if (students == null) return Collections.emptyList();
      return students;
    } catch (Exception e) {
      return Collections.emptyList();
    }
  }
}