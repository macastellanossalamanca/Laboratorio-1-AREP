package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.back.*;
import edu.escuelaing.arem.ASE.lista.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            LinkedList<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("prueba.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new LinkedList<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                calcular(elementos);
            }
            bf.close();
        }catch (Exception  e){
            
        }   
    }
    
    public static void calcular(LinkedList<Double> elementos){
        DecimalFormat formato = new DecimalFormat("#.##");
        double mean = Stat.mean(elementos);
        double deviation = Stat.dvt(elementos);
        System.out.println("Mean: " + formato.format(mean) + " Deviation: "+ formato.format(deviation));
    }
}
