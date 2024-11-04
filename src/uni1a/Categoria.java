package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private List<ContenidoAudiovisual> contenidos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarContenido(ContenidoAudiovisual contenido) {
        this.contenidos.add(contenido);
    }

    public void mostrarContenidos() {
        System.out.println("Categoría: " + nombre);
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
