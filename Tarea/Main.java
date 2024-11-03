import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        String rutaArchivo = "animales.dat";

        Perro perro1 = new Perro("Rex", 5, "Labrador");
        Gato gato1 = new Gato("Miau", 3);

        zoologico.agregarAnimal(perro1);
        zoologico.agregarAnimal(gato1);

        Perro perro2 = new Perro("Jon", 8, "Dóberman");
        Gato gato2 = new Gato("Miau", 5);

        zoologico.agregarAnimal(perro2);
        zoologico.agregarAnimal(gato2);

        // Mostrar sonidos de los animales
        zoologico.mostrarSonido();

        // Mostrar conteo de animales
        zoologico.mostrarConteoAnimales();

        // Guardar la lista de animales en un archivo binario
        zoologico.guardarAnimales(rutaArchivo);

        // Cargar la lista de animales desde el archivo binario
        List<Animal> animalesCargados = Archivo.cargarAnimales(rutaArchivo);
        if (animalesCargados != null) {
            System.out.println("\nLista de animales cargada desde el archivo:");
            for (Animal animal : animalesCargados) {
                System.out.println("Nombre: " + animal.getNombreMayusculas() +  
                                   ", Edad: " + animal.getEdad() +
                                   ", Sonido: " + animal.hacerSonido());
            }
        } else {
            System.out.println("No se pudo cargar la lista de animales.");
        }
    }
}