/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.back;

import edu.escuelaing.arem.ASE.app.*;
import edu.escuelaing.arem.ASE.lista.*;
/**
 *
 * @author macas
 */
public class Stat {
    /**
     * Calcula la media de los datos ingresados
     * @param list Una linkedList en la cual se encuentran almacenados los datos a evaluar.
     * @return Retorna un double con la media de los datos ingresados.
     */
    public static double mean(LinkedList<Double> list){
        double cont = 0;
        for(int i =0; i<list.getSize(); i++){
            cont += list.get(i);
        }
        return cont / list.getSize();
    }

    /**
     * Calcula la desviación estadar los datos ingresados.
     * @param list Una linkedList en la cual se encuentran almacenados los datos a evaluar.
     * @return Retorna un double con la desviación estadar de los datos ingresados.
     */
    public static double dvt(LinkedList<Double> list){
        double mean = mean(list);
        double cont = 0;

        for(int i=0;i<list.getSize();i++){
            cont += Math.pow((list.get(i)-mean),2);
        }
        double res = Math.sqrt(cont/(list.getSize()-1));
        return res;
    }
}
