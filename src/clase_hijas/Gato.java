package clase_hijas;
import clase_Padre.Animal;
// Subclase Perro
// Subclase Gato
class Gato extends Animal {
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el métodohacerSonido()
    @Override
    public String hacerSonido() {
        return "El gato maúlla: ¡Miau!";
    }
}