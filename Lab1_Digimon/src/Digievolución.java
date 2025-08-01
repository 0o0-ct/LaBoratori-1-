
import java.util.Random;

public class Digievolución {
    private String nombre;
    private String tipoEfecto; 
    private int valor;
    private int probabilidad; 
    private Random random;
    
    public Digievolución(String nombre, String tipoEfecto, int valor, int probabilidad) {
        this.nombre = nombre;
        this.tipoEfecto = tipoEfecto;
        this.valor = valor;
        this.probabilidad = probabilidad;
        this.random = new Random();
    }
    
    public boolean seActiva() {
        int numeroAleatorio = random.nextInt(101); 
        return numeroAleatorio <= probabilidad;
    }
   
    public int aplicarEfecto(Digimon usuario, Digimon enemigo) {
        switch (tipoEfecto) {
            case "ataque":
                usuario.setAtaque(usuario.getAtaque() + valor);
                return 0; 
            case "defensa":
                usuario.setDefensa(usuario.getDefensa() + valor);
                return 0; 
            case "daño_directo":
                return valor; 
            default:
                return 0;
        }
    }
    
    public String getNombre() { return nombre; }
    public String getTipoEfecto() { return tipoEfecto; }
    public int getValor() { return valor; }
    public int getProbabilidad() { return probabilidad; }
    
    @Override
    public String toString() {
        return nombre + " (" + probabilidad + "% - " + tipoEfecto + " +" + valor + ")";
    }
}
