import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Alquiler {
   //CALENDAR -> CLASE ABSTRACTA

    private String nombreCliente;
    private int DNI;
    private String fechaInicial;
    private String fechaFinal;
    private int posiAmarre;
    private Barco barco;
    private int valorFijo;


    public Alquiler(String cliente, int DNI, String fechaInicial, String fechaFinal, int posiAmarre, Barco barco) {
        this.nombreCliente = cliente;
        this.DNI = DNI;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posiAmarre = posiAmarre;
        this.barco = barco;
        this.valorFijo = 2;
    }

    private Calendar transformarAFecha(String fecha) {
        String fechaCortada  [] = fecha.split("-");
        int dia = Integer.parseInt(fechaCortada[2]);
        int mes = Integer.parseInt(fechaCortada[1])-1;
        int año = Integer.parseInt(fechaCortada[0]);
        Calendar formatoFecha = new GregorianCalendar(año, mes, dia);
        return formatoFecha;
    }

    public Calendar mostrarFechaInicio() {
        return transformarAFecha(this.fechaInicial);
    }

    public double calcularAlquiler() {
        int numDiasOcupado = calcularNumDias();
        double moduloBarco = calcularModuloFuncionBarco();

        double totalAlquiler = numDiasOcupado * moduloBarco * this.valorFijo;
        return totalAlquiler;

    }
    private int calcularNumDias() {
        Calendar fechaInicial = transformarAFecha(this.fechaInicial);
        Calendar fechaFinal = transformarAFecha(this.fechaFinal);
        int dias =  fechaFinal.get(Calendar.DATE) - fechaInicial.get(Calendar.DATE);
        return dias;
    }

    private double calcularModuloFuncionBarco() {
        return barco.getEslora() * 10;

    }

    public int getValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(int valorFijo) {
        this.valorFijo = valorFijo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }


    public int getPosiAmarre() {
        return posiAmarre;
    }

    public void setPosiAmarre(int posiAmarre) {
        this.posiAmarre = posiAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco tipoBarco) {
        this.barco = tipoBarco;
    }
}
