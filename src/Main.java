import java.text.DecimalFormat;
import java.util.*;

/**
 * Creado por @author: YainyBi
 * el 10/10/20
 **/
public class Main {
    public static void main(String[] args) {
        /*--------------------------------------------------------------------*/
        /*                        CREAR LOS BARCOS                   */
        /*--------------------------------------------------------------------*/
        Velero vl1 = new Velero("4E4753", 6.5, 2018, 2);
        Velero vl2 = new Velero("4A7F83", 8.2, 2017, 3);
        Velero vl3 = new Velero("4C475F", 10.5, 2015, 4);
        Velero vl4 = new Velero("4EFF88", 6.8, 2019, 2);

        Deportivo dpt1 = new Deportivo("4E4783", 6.7, 2019, 250);
        Deportivo dpt2 = new Deportivo("4A7F83", 7.5, 2017, 250);
        Deportivo dpt3 = new Deportivo("4C475F", 6.5, 2015, 170);
        Deportivo dpt4 = new Deportivo("4EFF88", 6.8, 2019, 110);

        Yates yat1 = new Yates("4E4783", 6.7, 2019, 250, 3);
        Yates yat2 = new Yates("4A7F83", 7.5, 2017, 150, 2);
        Yates yat3 = new Yates("4C475F", 6.5, 2015, 170, 2);
        Yates yat4 = new Yates("4EFF88", 6.8, 2019, 110, 2);

        Especiales esp1 = new Especiales("4E4783", 6.7, 2019, 250, 3, 2);
        Especiales esp2 = new Especiales("4A7F83", 7.5, 2017, 250, 2, 3);
        Especiales esp3 = new Especiales("4C475F", 6.5, 2015, 170, 2, 2);
        Especiales esp4 = new Especiales("4EFF88", 6.8, 2019, 110, 3, 3);

        /*--------------------------------------------------------------------*/
        /*         ALQUILER DE CADA UNO                                */
        /*--------------------------------------------------------------------*/
        //hay 16 contratos de Alquiler.
        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

        Alquiler contr1 = new Alquiler("Juan Diaz", 95919478, "2020-10-10", "2020-10-19", 85, vl1);
        alquileres.add(contr1);
        Alquiler contr2 = new Alquiler("Jose Diaz", 95978478, "2020-01-08", "2020-01-22", 5, vl2);
        alquileres.add(contr2);
        Alquiler contr3 = new Alquiler("Luis Diaz", 95758478, "2020-10-01", "2020-10-30", 10, vl3);
        alquileres.add(contr3);
        Alquiler contr4 = new Alquiler("Sandra Diaz", 98519478, "2020-05-5", "2020-05-20", 12, vl4);
        alquileres.add(contr4);

        Alquiler contr5 = new Alquiler("Daniel Ruiz", 95759478, "2020-02-01", "2020-02-20", 5, dpt1);
        alquileres.add(contr5);
        Alquiler contr6 = new Alquiler("Yose Ruiz", 95985478, "2020-03-04", "2020-03-08", 9, dpt2);
        alquileres.add(contr6);
        Alquiler contr7 = new Alquiler("Carla Ruiz", 95129478, "2020-03-01", "2020-03-29", 80, dpt3);
        alquileres.add(contr7);
        Alquiler contr8 = new Alquiler("Matias Ruiz", 93519478, "2020-02-05", "2020-02-25", 70, dpt4);
        alquileres.add(contr8);

        Alquiler contr9 = new Alquiler("Enrique Sanchez", 95919478, "2020-06-07", "2020-06-30", 50, yat1);
        alquileres.add(contr9);
        Alquiler contr10 = new Alquiler("Lucia Sanchez", 95919478, "2020-10-01", "2020-10-30", 60, yat2);
        alquileres.add(contr10);
        Alquiler contr11 = new Alquiler("Susana Sanchez", 95919478, "2020-06-10", "2020-06-20", 65, yat3);
        alquileres.add(contr11);
        Alquiler contr12 = new Alquiler("Sandra Sanchez", 95919478, "2020-12-01", "2020-12-26", 55, yat4);
        alquileres.add(contr12);

        Alquiler contr13 = new Alquiler("Ricardo Hernandez", 95919478, "2020-04-01", "2020-04-30", 75, esp1);
        alquileres.add(contr13);
        Alquiler contr14 = new Alquiler("Franco Hernandez", 95919478, "2020-04-10", "2020-04-25", 5, esp2);
        alquileres.add(contr14);
        Alquiler contr15 = new Alquiler("Victoria Hernandez", 95919478, "2020-06-10", "2020-06-15", 15, esp3);
        alquileres.add(contr15);
        Alquiler contr16 = new Alquiler("Carlos Hernandez", 95919478, "2020-12-10", "2020-12-30", 35, esp4);
        alquileres.add(contr16);


    /*--------------------------------------------------------------------*/
    /*                 IMPRIMIR RESULTADO PRUEBA I                        */
    /*--------------------------------------------------------------------*/
        System.out.println( "|--------------------------------------------------------------------|\n"+
                            "|                  LISTADO   DE ALQUILERES DE BARCOS                 |\n"+
                            "|--------------------------------------------------------------------|");
        for (int i = 0; i < alquileres.size(); i++) {
            System.out.println(" \tPrecio Alquiler: " + alquileres.get(i).calcularAlquiler() + " \tBarco: " + alquileres.get(i).getBarco().getTipoBarco());
        }

        /*--------------------------------------------------------------------*/
        /*           LLAMADO METODOS PROMEDIO, MAYOR, MENOR  MENSUAL-ANUAL    */
        /*--------------------------------------------------------------------*/

        DecimalFormat formato = new DecimalFormat("#,00");
        String nombreMeses[] = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

        double promedioAlquileres[] = calcularPromedioDeAlquiler(alquileres, nombreMeses);
        double promedioAnual = calcularPromedioDeAlquilerAño(promedioAlquileres);

        double mayorAlquileres[] = calcularMayorPrecioDeAlquiler(alquileres, nombreMeses);
        double mayorAnual = calcularMayorAlquilerAnual(mayorAlquileres);

        double menorAlquiler[] = calcularMenorPrecioDeAlquiler(alquileres, nombreMeses, mayorAnual);
        double menorAnual =  calcularMenorAlquilerAnual(menorAlquiler, mayorAnual);




        /*--------------------------------------------------------------------*/
        /*                    IMPRIMIR RESULTADOS                        */
        /*--------------------------------------------------------------------*/
        System.out.println( "|--------------------------------------------------------------------|\n"+
                            "|                  LISTADO  MENSUAL Y ANUAL                          |\n"+
                            "|--------------------------------------------------------------------|");
        for (int i = 0; i < nombreMeses.length; i++) {
            System.out.println(" \tMes" + nombreMeses[i] + " \tPromedio " + formato.format(promedioAlquileres[i]) + " \tMayor " + mayorAlquileres[i] + " \tMenor " + menorAlquiler[i]);
        }
        System.out.println("\tPromedio Anual " + formato.format(promedioAnual) + " \tMayor " + mayorAnual + " \tMenor" + menorAnual);
    }

    /*--------------------------------------------------------------------*/
    /*           METODOS PROMEDIO, MAYOR, MENOR  ANUAL       */
    /*--------------------------------------------------------------------*/

    public static double calcularPromedioDeAlquilerAño(double alquileresPromedio[]) {
        double promedio = 0;

        for (int i = 0; i < alquileresPromedio.length; i++) {
            promedio += alquileresPromedio[i];
        }
        return (promedio / 12);
    }

    public static double calcularMayorAlquilerAnual(double mayorAlquiler[]) {
        double mayor = 0;

        for (int i = 0; i < mayorAlquiler.length; i++) {
            if (mayor < mayorAlquiler[i]) {
                mayor = mayorAlquiler[i];
            }
            else {
                continue;
            }
        }
        return mayor;
    }

    public static double calcularMenorAlquilerAnual(double menorAlquiler[], double mayorAnual) {
        double menor = 0;

        for (int i = 0; i < menorAlquiler.length; i++) {
            if (mayorAnual > menorAlquiler[i]) {
                menor = menorAlquiler[i];
            }
            else {
                continue;
            }
        }
        return menor;
    }


    /*--------------------------------------------------------------------*/
    /*           METODOS PROMEDIO, MAYOR, MENOR  MENSUAL       */
    /*--------------------------------------------------------------------*/

    public static double[] calcularMayorPrecioDeAlquiler(ArrayList<Alquiler> alquileres, String meses[]) {
        double mayorAlquileres[] = new double[12];
        double mayor;

        for (int i = 0; i < meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            mayor = 0;

            for (int j = 0; j < alquileres.size(); j++) {
                Calendar fecha = alquileres.get(j).mostrarFechaInicio();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    if (mayor < alquileres.get(j).calcularAlquiler()) {
                        mayor = alquileres.get(j).calcularAlquiler();
                    }
                }
                else {
                    continue;
                }
            }
            mayorAlquileres[i] = mayor;
        }
        return mayorAlquileres;
    }



    public static double[] calcularMenorPrecioDeAlquiler(ArrayList<Alquiler> alquileres, String meses[], double mayorAnual) {
        double menorAlquileres[] = new double[12];
        double menor;

        for (int i = 0; i < meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            menor = mayorAnual;

            for (int j = 0; j < alquileres.size(); j++) {
                Calendar fecha = alquileres.get(j).mostrarFechaInicio();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    if (menor > alquileres.get(j).calcularAlquiler()) {
                        menor = alquileres.get(j).calcularAlquiler();
                    }
                    else {
                       continue;
                    }
                }
            }
            if (menor != mayorAnual) {
                menorAlquileres[i] = menor;
            }
            else {
                menorAlquileres[i] = 0.0;
            }
        }
        return menorAlquileres;
    }



    public static double[] calcularPromedioDeAlquiler(ArrayList<Alquiler> alquileres, String meses[]) {
        double promedioAlquileres[] = new double[12];
        double sumatoria;

        for (int i = 0; i < meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            sumatoria = 0;

            for (int j = 0; j < alquileres.size(); j++) {
                Calendar fecha = alquileres.get(j).mostrarFechaInicio();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    sumatoria += alquileres.get(j).calcularAlquiler();
                } else {
                    continue;
                }
            }
            promedioAlquileres[i] = (sumatoria / 30);
        }
    return promedioAlquileres;
    }
}
