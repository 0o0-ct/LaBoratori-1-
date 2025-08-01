public class TestDigimon {
    
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO PRUEBAS ===\n");
        
        testCreacionDigimon();
        testEfectoTipo();
        testDigievolución();
        testEntrenador();
        
        System.out.println("\n=== TODAS LAS PRUEBAS COMPLETADAS ===");
    }
    
    public static void testCreacionDigimon() {
        System.out.println("1. Probando creación de Digimon...");
        
        Digievolución greymon = new Digievolución("Greymon", "ataque", 15, 30);
        Digimon agumon = new Digimon("Agumon", "Fuego", 25, 20, greymon);
        
        System.out.println("✓ Digimon creado: " + agumon);
        System.out.println("✓ Digievolución: " + agumon.getDigievolución());
        System.out.println();
    }

    public static void testEfectoTipo() {
        System.out.println("2. Probando efectos de tipo...");
        
        Digievolución dummy1 = new Digievolución("Test1", "ataque", 10, 0);
        Digievolución dummy2 = new Digievolución("Test2", "ataque", 10, 0);
        
        Digimon fuego = new Digimon("TestFuego", "Fuego", 20, 15, dummy1);
        Digimon planta = new Digimon("TestPlanta", "Planta", 20, 15, dummy2);
        
        int ataqueEfectivo = fuego.calcularAtaqueTotal(planta);
        System.out.println("✓ Fuego vs Planta (efectivo): " + ataqueEfectivo + " (esperado: 40)");
        
        int ataqueDebil = planta.calcularAtaqueTotal(fuego);
        System.out.println("✓ Planta vs Fuego (débil): " + ataqueDebil + " (esperado: 10)");
        System.out.println();
    }
    
    public static void testDigievolución() {
        System.out.println("3. Probando sistema de digievolución...");
        
        Digievolución segura = new Digievolución("TestSeguro", "ataque", 15, 100);
        Digimon testDigimon = new Digimon("TestMon", "Fuego", 20, 15, segura);
        
        int ataqueOriginal = testDigimon.getAtaque();
        testDigimon.usarDigievolución(testDigimon);
        int ataqueNuevo = testDigimon.getAtaque();
        
        System.out.println("✓ Ataque original: " + ataqueOriginal);
        System.out.println("✓ Ataque después de digievolución: " + ataqueNuevo);
        System.out.println("✓ Diferencia: " + (ataqueNuevo - ataqueOriginal));
        System.out.println();
    }
    
    public static void testEntrenador() {
        System.out.println("4. Probando entrenador...");
        
        Entrenador testEntrenador = new Entrenador("TestTrainer");
        
        Digievolución evo1 = new Digievolución("Evo1", "ataque", 10, 30);
        Digimon digimon1 = new Digimon("Test1", "Fuego", 20, 15, evo1);
        
        testEntrenador.agregarDigimon(digimon1);
        
        System.out.println("✓ Entrenador creado: " + testEntrenador);
        System.out.println("✓ Digimon en equipo: " + testEntrenador.getEquipo().size());
        System.out.println();
    }
}
