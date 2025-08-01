public class Juego {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private int victoriasEntrenador1;
    private int victoriasEntrenador2;
    
    public Juego(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        this.victoriasEntrenador1 = 0;
        this.victoriasEntrenador2 = 0;
    }
    
    public void iniciarJuego() {
        System.out.println("=== INICIO DEL TORNEO DIGIMON ===");
        System.out.println(entrenador1.getNombre() + " VS " + entrenador2.getNombre());
        System.out.println("¡4 rondas para determinar al campeón!\n");
        
        for (int ronda = 1; ronda <= 4; ronda++) {
            jugarRonda(ronda);
        }
        
        determinarGanadorFinal();
    }
    
    private void jugarRonda(int numeroRonda) {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("RONDA " + numeroRonda);
        System.out.println("=".repeat(30));
        
        Digimon digimon1 = entrenador1.elegirDigimon();
        Digimon digimon2 = entrenador2.elegirDigimon();
    
        String acción1 = entrenador1.decidirAcción();
        String acción2 = entrenador2.decidirAcción();
        
        Batalla batalla = new Batalla(digimon1, digimon2, acción1, acción2);
        int resultado = batalla.ejecutarBatalla();
        
        if (resultado == 1) {
            victoriasEntrenador1++;
        } else if (resultado == 2) {
            victoriasEntrenador2++;
        }
        
        System.out.println("\nMarcador actual:");
        System.out.println(entrenador1.getNombre() + ": " + victoriasEntrenador1);
        System.out.println(entrenador2.getNombre() + ": " + victoriasEntrenador2);
    }
    
    private void determinarGanadorFinal() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("RESULTADO FINAL DEL TORNEO");
        System.out.println("=".repeat(40));
        System.out.println(entrenador1.getNombre() + ": " + victoriasEntrenador1 + " victorias");
        System.out.println(entrenador2.getNombre() + ": " + victoriasEntrenador2 + " victorias");
        
        if (victoriasEntrenador1 > victoriasEntrenador2) {
            System.out.println("\n🏆 ¡" + entrenador1.getNombre() + " es el CAMPEÓN! 🏆");
        } else if (victoriasEntrenador2 > victoriasEntrenador1) {
            System.out.println("\n🏆 ¡" + entrenador2.getNombre() + " es el CAMPEÓN! 🏆");
        } else {
            System.out.println("\n🤝 ¡EMPATE! Ambos entrenadores son excelentes! 🤝");
        }
    }
}
