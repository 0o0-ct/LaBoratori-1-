public class Batalla {
    private Digimon digimon1;
    private Digimon digimon2;
    private String acción1;
    private String acción2;
    
    public Batalla(Digimon digimon1, Digimon digimon2, String acción1, String acción2) {
        this.digimon1 = digimon1;
        this.digimon2 = digimon2;
        this.acción1 = acción1;
        this.acción2 = acción2;
    }
    
  
    public int ejecutarBatalla() {
        System.out.println("\n=== BATALLA ===");
        System.out.println(digimon1.getNombre() + " VS " + digimon2.getNombre());
        
        int poder1 = calcularPoderTotal(digimon1, digimon2, acción1);
        int poder2 = calcularPoderTotal(digimon2, digimon1, acción2);
        
        System.out.println(digimon1.getNombre() + " - Poder total: " + poder1);
        System.out.println(digimon2.getNombre() + " - Poder total: " + poder2);
        
        if (poder1 > poder2) {
            System.out.println("¡" + digimon1.getNombre() + " gana la ronda!");
            return 1;
        } else if (poder2 > poder1) {
            System.out.println("¡" + digimon2.getNombre() + " gana la ronda!");
            return 2;
        } else {
            System.out.println("¡Empate en esta ronda!");
            return 0;
        }
    }
    
    private int calcularPoderTotal(Digimon atacante, Digimon defensor, String acción) {
        int poderTotal = 0;
        
        if (acción.equals("atacar")) {
            poderTotal = atacante.calcularAtaqueTotal(defensor);
            System.out.println(atacante.getNombre() + " ataca con poder base: " + poderTotal);
        } else if (acción.equals("digievolución")) {
            int ataqueBase = atacante.calcularAtaqueTotal(defensor);
            int efectoDigievolución = atacante.usarDigievolución(defensor);
            
            if (efectoDigievolución > 0) {
                System.out.println("¡" + atacante.getNombre() + " usa " + 
                                 atacante.getDigievolución().getNombre() + "!");
                poderTotal = ataqueBase + efectoDigievolución;
            } else {
                System.out.println(atacante.getNombre() + " intenta usar " + 
                                 atacante.getDigievolución().getNombre() + " pero no se activa");
                poderTotal = ataqueBase;
            }
        }
        
        return poderTotal;
    }
}
