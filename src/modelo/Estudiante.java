
package modelo;

/**
 *
 * @author Gregory Jeronimo
 */
public class Estudiante {
    private String nombre;
     private int edad;
    private double promedio;
    private boolean activo;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad,
            double promedio, boolean activo,
            String carrera) {

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

    
    
}
