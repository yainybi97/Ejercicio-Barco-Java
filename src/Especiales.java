/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Especiales extends Barco {
    private int potenciaCV;
    private int numCamarotes;
    private int numMastiles;
    static final String TIPO = "Especial";

    public Especiales(String matricula, double eslora, int añoFabricacion, int potenciaCV, int numCamarotes, int numMastiles) {
        super(matricula, eslora, añoFabricacion, TIPO);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
        this.numMastiles = numMastiles;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
}
