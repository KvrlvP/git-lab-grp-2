package pe.edu.tecsup.lab;

import java.util.List;

public class StudentReport {

    // Clase para reportes de estudiantes

    public void generateReport(List<StudentModel> students) {
        System.out.println("=== REPORTE ===");
        for (StudentModel s : students) {
            System.out.println(s.toString());
        }
        System.out.println("Total: " + students.size());
    }
}