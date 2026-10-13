//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PerfilUsuario perfil = new PerfilUsuario("Lucía");
    PulseraInteligente pulsera = new PulseraInteligente(perfil, 10000);

    pulsera.registrarPasos(4000);
    pulsera.registrarPasos(3500);
    pulsera.registrarPasos(5000); // supera la meta
    pulsera.registrarPasos(1000); // ya superada, no repite la insignia

    System.out.println("\n--- Estado final del perfil ---");
    System.out.println("Usuario: " + perfil.getNombre());
    System.out.println("Pasos acumulados: " + perfil.getPasosAcumulados());
    System.out.println("Insignias: " + perfil.getInsigniasObtenidas());

}
