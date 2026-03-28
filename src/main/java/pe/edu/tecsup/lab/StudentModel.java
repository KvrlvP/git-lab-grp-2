package pe.edu.tecsup.lab;

public class StudentModel {

    private int id;
    private String nombre;
    private String apellido;

    public StudentModel(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}