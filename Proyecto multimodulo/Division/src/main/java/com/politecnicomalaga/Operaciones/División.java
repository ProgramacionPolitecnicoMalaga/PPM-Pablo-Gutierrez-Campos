package com.politecnicomalaga.Operaciones;

import org.apache.commons.math3.analysis.function.Divide;

public class División {
   Divide division = new Divide();
   public double dividir(double a,double b){
       return division.value(a,b);
   }
}
