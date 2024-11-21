
package clase_hijas;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Michi", 3);

        // Mostrar los detalles y sonidos
        System.out.println("Perro:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Sonido: " + perro.hacerSonido());

        System.out.println();

        System.out.println("Gato:");
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad());
        System.out.println("Sonido: " + gato.hacerSonido());
    }
}