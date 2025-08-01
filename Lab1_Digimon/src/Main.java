public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al Torneo de Digimon!");
        
        Entrenador entrenador1 = new Entrenador("Ash");
        Entrenador entrenador2 = new Entrenador("Gary");
        configurarEquipoEntrenador1(entrenador1);
        configurarEquipoEntrenador2(entrenador2);
        Juego juego = new Juego(entrenador1, entrenador2);
        juego.iniciarJuego();
    }
    
    private static void configurarEquipoEntrenador1(Entrenador entrenador) {
        Digievolución greymon = new Digievolución("Greymon", "ataque", 15, 30);
        Digimon agumon = new Digimon("Agumon", "Fuego", 25, 20, greymon);
        entrenador.agregarDigimon(agumon);
        Digievolución garurumon = new Digievolución("Garurumon", "daño_directo", 10, 25);
        Digimon gabumon = new Digimon("Gabumon", "Agua", 22, 25, garurumon);
        entrenador.agregarDigimon(gabumon);
        Digievolución kabuterimon = new Digievolución("Kabuterimon", "defensa", 20, 35);
        Digimon tentomon = new Digimon("Tentomon", "Eléctrico", 20, 22, kabuterimon);
        entrenador.agregarDigimon(tentomon);
    }
    
    private static void configurarEquipoEntrenador2(Entrenador entrenador) {
        Digievolución togemon = new Digievolución("Togemon", "ataque", 12, 40);
        Digimon palmon = new Digimon("Palmon", "Planta", 23, 24, togemon);
        entrenador.agregarDigimon(palmon);
        Digievolución birdramon = new Digievolución("Birdramon", "daño_directo", 15, 20);
        Digimon biyomon = new Digimon("Biyomon", "Fuego", 26, 18, birdramon);
        entrenador.agregarDigimon(biyomon);
        Digievolución ikkakumon = new Digievolución("Ikkakumon", "defensa", 18, 30);
        Digimon gomamon = new Digimon("Gomamon", "Agua", 21, 26, ikkakumon);
        entrenador.agregarDigimon(gomamon);
    }
}
