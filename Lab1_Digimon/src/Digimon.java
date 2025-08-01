public class Digimon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private Digievolución digievolución;
   
    public Digimon(String nombre, String tipo, int ataque, int defensa, Digievolución digievolución) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.digievolución = digievolución;
    }
    
    public int calcularAtaqueTotal(Digimon enemigo) {
        int ataqueBase = this.ataque;
        int efectoTipo = calcularEfectoTipo(enemigo.getTipo());
        return ataqueBase + efectoTipo;
    }
    
    private int calcularEfectoTipo(String tipoEnemigo) {
        switch (this.tipo) {
            case "Fuego":
                if (tipoEnemigo.equals("Planta")) return 20; 
                if (tipoEnemigo.equals("Agua")) return -10;  
                break;
            case "Agua":
                if (tipoEnemigo.equals("Fuego")) return 20;  
                if (tipoEnemigo.equals("Planta")) return -10; 
                break;
            case "Planta":
                if (tipoEnemigo.equals("Agua")) return 20;   
                if (tipoEnemigo.equals("Fuego")) return -10;
                break;
            case "Eléctrico":
                if (tipoEnemigo.equals("Agua")) return 20;   
                break;
        }
        return 0; 
    }
    
    public int usarDigievolución(Digimon enemigo) {
        if (digievolución.seActiva()) {
            return digievolución.aplicarEfecto(this, enemigo);
        }
        return 0;
    }
    
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public Digievolución getDigievolución() { return digievolución; }
    
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    
    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - ATK: " + ataque + ", DEF: " + defensa;
    }
}
