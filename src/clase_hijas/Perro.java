package clase_hijas;
import clase_Padre.Animal;
// Subclase Perro
class Perro extends Animal {
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribir el método hacerSonido()
    @Override
    public String hacerSonido() {
        return "El perro ladra: ¡Guau, guau!";
    }
}