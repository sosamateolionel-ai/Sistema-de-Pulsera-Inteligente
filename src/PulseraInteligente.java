public class PulseraInteligente {

    private PerfilUsuario perfil; // asociación: referencia al perfil
    private int metaDiaria;
    private int pasosDelDia;
    private boolean metaNotificada;

    public PulseraInteligente(PerfilUsuario perfil, int metaDiaria) {
        this.perfil = perfil;
        this.metaDiaria = metaDiaria;
        this.pasosDelDia = 0;
        this.metaNotificada = false;
    }

    public void registrarPasos(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Pulsera: cantidad de pasos inválida.");
            return;
        }

        pasosDelDia = pasosDelDia + cantidad;
        perfil.sumarPasos(cantidad);

        System.out.println("Pulsera: +" + cantidad + " pasos (total del día: " + pasosDelDia + "/" + metaDiaria + ")");

        if (pasosDelDia >= metaDiaria && !metaNotificada) {
            System.out.println("Pulsera: ¡meta diaria alcanzada!");
            perfil.otorgarInsignia("Caminante Diario");
            metaNotificada = true;
        }
    }

    public void reiniciarDia() {
        pasosDelDia = 0;
        metaNotificada = false;
        System.out.println("Pulsera: nuevo día, contador reiniciado.");
    }
}