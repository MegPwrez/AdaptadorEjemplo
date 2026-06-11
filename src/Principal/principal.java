
package Principal;
import javafx.beans.property.adapter.JavaBeanBooleanProperty;
import javafx.beans.property.adapter.JavaBeanBooleanPropertyBuilder;

import javafx.beans.property.adapter.JavaBeanDoubleProperty;
import javafx.beans.property.adapter.JavaBeanDoublePropertyBuilder;

import javafx.beans.property.adapter.JavaBeanIntegerProperty;
import javafx.beans.property.adapter.JavaBeanIntegerPropertyBuilder;

import javafx.beans.property.adapter.JavaBeanObjectProperty;
import javafx.beans.property.adapter.JavaBeanObjectPropertyBuilder;

import javafx.beans.property.adapter.JavaBeanStringProperty;
import javafx.beans.property.adapter.JavaBeanStringPropertyBuilder;

import modelo.Estudiante;

/**
 *
 * @author Gregory Jeronimo
 */
public class principal {
    public static void main(String[] args) {

        try {

            Estudiante estudiante =
                    new Estudiante(
                            "Gregory",
                            17,
                            89.5,
                            true,
                            "Informática");

            // String Property
            JavaBeanStringProperty nombreProperty =
                    JavaBeanStringPropertyBuilder.create()
                            .bean(estudiante)
                            .name("nombre")
                            .build();

            // Integer Property
            JavaBeanIntegerProperty edadProperty =
                    JavaBeanIntegerPropertyBuilder.create()
                            .bean(estudiante)
                            .name("edad")
                            .build();

            // Double Property
            JavaBeanDoubleProperty promedioProperty =
                    JavaBeanDoublePropertyBuilder.create()
                            .bean(estudiante)
                            .name("promedio")
                            .build();

            // Boolean Property
            JavaBeanBooleanProperty activoProperty =
                    JavaBeanBooleanPropertyBuilder.create()
                            .bean(estudiante)
                            .name("activo")
                            .build();

            // Object Property
            JavaBeanObjectProperty<String> carreraProperty =
                    JavaBeanObjectPropertyBuilder.<String>create()
                            .bean(estudiante)
                            .name("carrera")
                            .build();

            System.out.println("===== DATOS INICIALES =====");

            System.out.println("Nombre: "
                    + nombreProperty.get());

            System.out.println("Edad: "
                    + edadProperty.get());

            System.out.println("Promedio: "
                    + promedioProperty.get());

            System.out.println("Activo: "
                    + activoProperty.get());

            System.out.println("Carrera: "
                    + carreraProperty.get());

            System.out.println("\n===== MODIFICANDO DATOS =====");

            nombreProperty.set("Carlos");
            edadProperty.set(20);
            promedioProperty.set(95.8);
            activoProperty.set(false);
            carreraProperty.set("Ingeniería");

            System.out.println("Nombre: "
                    + estudiante.getNombre());

            System.out.println("Edad: "
                    + estudiante.getEdad());

            System.out.println("Promedio: "
                    + estudiante.getPromedio());

            System.out.println("Activo: "
                    + estudiante.isActivo());

            System.out.println("Carrera: "
                    + estudiante.getCarrera());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
    
}
