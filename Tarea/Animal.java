import java.io.Serializable;

abstract class Animal implements Serializable {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    abstract public String hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public String getNombreMayusculas() {
        return nombre.toUpperCase();
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
}