/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Deportivo extends Barco {
    static final String TIPO = "Deportivo";
    private int potenciaCV;

    public Deportivo(String matricula, double eslora, int añoFabricacion, int potenciaCV) {
        super(matricula, eslora, añoFabricacion, TIPO);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

}
