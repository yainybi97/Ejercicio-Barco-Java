/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Yates extends Barco {
    private int potenciaCV;
    private int numCamarotes;
    static final String TIPO = "Yate";

    public Yates(String matricula, double eslora, int añoFabricacion, int potenciaCV, int numCamarotes  ) {
        super(matricula, eslora, añoFabricacion, TIPO);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
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
}
