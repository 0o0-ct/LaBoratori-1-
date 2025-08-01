
import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private ArrayList<Digimon> equipo;
    private ArrayList<Boolean> digimonUsados;
    private Scanner scanner;
    
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.digimonUsados = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void agregarDigimon(Digimon digimon) {
        if (equipo.size() < 3) {
            equipo.add(digimon);
            digimonUsados.add(false);
        }
    }
    
    public Digimon elegirDigimon() {
        System.out.println("\n" + nombre + ", elige tu Digimon:");
        
        for (int i = 0; i < equipo.size(); i++) {
            if (!digimonUsados.get(i)) {
                System.out.println((i + 1) + ". " + equipo.get(i));
            }
        }
        
        int elección;
        do {
            System.out.print("Ingresa el número (1-3): ");
            elección = scanner.nextInt() - 1;
        } while (elección < 0 || elección >= equipo.size() || digimonUsados.get(elección));
        
        digimonUsados.set(elección, true);
        return equipo.get(elección);
    }

    public String decidirAcción() {
        System.out.println("\n¿Qué quieres hacer?");
        System.out.println("1. Atacar");
        System.out.println("2. Usar Digievolución");
        
        int elección;
        do {
            System.out.print("Elige (1-2): ");
            elección = scanner.nextInt();
        } while (elección < 1 || elección > 2);
        
        return (elección == 1) ? "atacar" : "digievolución";
    }
    
    public void reiniciarEquipo() {
        for (int i = 0; i < digimonUsados.size(); i++) {
            digimonUsados.set(i, false);
        }
    }

    public String getNombre() { return nombre; }
    public ArrayList<Digimon> getEquipo() { return equipo; }
    
    @Override
    public String toString() {
        return "Entrenador: " + nombre + " (Digimon: " + equipo.size() + ")";
    }
}
