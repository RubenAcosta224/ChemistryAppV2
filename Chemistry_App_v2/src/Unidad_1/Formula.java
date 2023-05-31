/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;
import Unidad_1.DatoEntradaCheckedEx;
import Unidad_1.DatosDefinidosEx;

/**
 *
 * @author dell
 */
public abstract class Formula {
    //clase principal
    
    private double numEntrada;
    
    private double numEntrada2;

    public Formula(String numEntrada,String numEntrada2) throws DatoEntradaCheckedEx, DatosDefinidosEx{
        setNumEntrada(numEntrada);
        setNumEntrada2(numEntrada2);
    }
    
    public Formula(String numEntrada) throws DatoEntradaCheckedEx, DatosDefinidosEx{
         setNumEntrada(numEntrada);
    }
    
    public Formula() {
        this.numEntrada = 0;
    }

    public double getNumEntrada() {
        return numEntrada;
    }
    
    

    public void setNumEntrada(String numEntrada) throws DatoEntradaCheckedEx, DatosDefinidosEx {
        if((numEntrada==null)||(!(esUnNumero(numEntrada)))){
            throw new DatosDefinidosEx();
        }
        double tmp=Double.parseDouble(numEntrada);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.numEntrada = tmp;
    }
    
    
    public double getNumEntrada2() {
        return numEntrada2;
    }

    public void setNumEntrada2(String numEntrada2)  throws DatoEntradaCheckedEx, DatosDefinidosEx {
        if(numEntrada2==null||(!(esUnNumero(numEntrada2)))){
            throw new DatosDefinidosEx();
        }
        double tmp=Double.parseDouble(numEntrada2);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.numEntrada2 = tmp;
    }

    
public static boolean esUnNumero(String tmp) {
        try {
            Double.parseDouble(tmp);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

   
    
    
    
    
    public abstract double evaluarSalida();

    

    
}


