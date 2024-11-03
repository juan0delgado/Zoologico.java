import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoologico {
    private List<Animal> animales;
    private Map<String, Integer> conteoPortipo;

    public Zoologico() {
        //animales = new ArrayList<>();
        //conteoPortipo = new HashMap<>();

        animales = new ArrayList<Animal>();
           // Map<String> conteoPortipo = new HashMap<Animal>();
            conteoPortipo = new HashMap<String, Integer>();
        
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void mostrarSonido() {
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre() +
                               ", Nombre en mayúsculas: " + animal.getNombreMayusculas() +
                               ", Edad: " + animal.getEdad() +
                               ", Sonido: " + animal.hacerSonido());
        }
    }

    public void mostrarConteoAnimales() {
        conteoPortipo.clear();
        for (Animal animal : animales) {
            String tipo = animal.getClass().getSimpleName();
            conteoPortipo.put(tipo, conteoPortipo.getOrDefault(tipo, 0) + 1);
        }
        for (String tipo : conteoPortipo.keySet()) {
            System.out.println("Tipo: " + tipo + ", cantidad: " + conteoPortipo.get(tipo));
        }
    }

    public void guardarAnimales(String rutaArchivo) {
        Archivo.guardarAnimales(animales, rutaArchivo);
    }

    public void cargarAnimales(String rutaArchivo) {
        List<Animal> animalesCargados = Archivo.cargarAnimales(rutaArchivo);
        if (animalesCargados != null) {
            animales = animalesCargados;
            System.out.println("Lista de animales cargada exitosamente.");
        }
    }
}