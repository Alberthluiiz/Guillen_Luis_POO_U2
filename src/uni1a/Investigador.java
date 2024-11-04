package uni1a;

public class Investigador {
    private String nombre;
    private String campo;

    // Constructor y parametro
    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.campo = campo;
    }

    // Getteres y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return "Investigador{" +
                "nombre='" + nombre + '\'' +
                ", campo='" + campo + '\'' +
                '}';
    }
}
