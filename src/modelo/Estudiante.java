package modelo;

/**
 * @author Gregory Jeronimo
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private boolean activo;
    private String carrera;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad, double promedio, boolean activo, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.activo = activo;
        this.carrera = carrera;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Este método le dice a Java cómo mostrar al estudiante textualmente
    @Override
    public String toString() {
        return "=== DATOS DEL ESTUDIANTE ===\n" +
               "Nombre:   " + nombre + "\n" +
               "Edad:     " + edad + " años\n" +
               "Promedio: " + promedio + "\n" +
               "Estado:   " + (activo ? "Activo" : "Inactivo") + "\n" +
               "Carrera:  " + carrera + "\n" +
               "============================";
    }
}
