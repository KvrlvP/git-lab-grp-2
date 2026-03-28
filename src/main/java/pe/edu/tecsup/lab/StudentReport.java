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

    public void displayStudent(StudentModel student) {
        System.out.println("--- Detalle ---");
        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getNombre());
        System.out.println("Apellido: " + student.getApellido());
    }
}