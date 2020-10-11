/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Velero extends Barco {
    private int numMastiles;
    static final String TIPO = "Velero";


    public Velero(String matricula, double eslora, int añoFabricacion, int numMastiles) {
        super(matricula, eslora, añoFabricacion, TIPO);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
}
