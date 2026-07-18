package ejemploadaptador;

// Es obligatorio importar la clase Estudiante porque está en otro paquete (modelo)
import modelo.Estudiante; 

/**
 * @author Gregory Jeronimo
 */
public class EjemploAdaptador {

    public static void main(String[] args) {
        
        // 1. Creamos un objeto Estudiante usando el constructor con parámetros
        Estudiante alumno = new Estudiante("Gregory Jeronimo", 21, 9.4, true, "Ingeniería en Sistemas");
        
        // 2. Imprimimos directamente el objeto gracias al método toString() que agregamos
        System.out.println(alumno);
        
        // 3. Ejemplo de cómo modificar un dato usando el Setter y mostrarlo con el Getter
        System.out.println("\n--- Actualizando promedio... ---");
        alumno.setPromedio(9.8); // Modificamos el promedio
        
        System.out.println("El nuevo promedio de " + alumno.getNombre() + " es: " + alumno.getPromedio());
    }
}