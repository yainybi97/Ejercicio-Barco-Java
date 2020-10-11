import java.util.Date;

/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Barco {
    private String matricula;
    private double eslora;
    private int añoFabricacion;
    private String tipoBarco;


    public Barco(String matricula, double eslora, int añoFabricacion, String tipoBarco) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.tipoBarco = tipoBarco;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }
}
