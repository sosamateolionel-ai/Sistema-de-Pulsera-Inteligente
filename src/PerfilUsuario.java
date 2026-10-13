import java.util.ArrayList;
import java.util.List;

public class PerfilUsuario {

    private String nombre;
    private int pasosAcumulados;
    private List<String> insigniasObtenidas;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        this.pasosAcumulados = 0;
        this.insigniasObtenidas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPasosAcumulados() {
        return pasosAcumulados;
    }

    public List<String> getInsigniasObtenidas() {
        return insigniasObtenidas;
    }

    public void sumarPasos(int cantidad) {
        pasosAcumulados = pasosAcumulados + cantidad;
    }

    public void otorgarInsignia(String nombreInsignia) {

        if (insigniasObtenidas.contains(nombreInsignia)) {
            System.out.println(nombre + " ya tiene la insignia \"" + nombreInsignia + "\".");
            return;
        }

        insigniasObtenidas.add(nombreInsignia);
        System.out.println("¡" + nombre + " obtuvo la insignia \"" + nombreInsignia + "\"!");
    }
}