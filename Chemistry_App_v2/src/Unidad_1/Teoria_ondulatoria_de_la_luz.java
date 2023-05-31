/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;

/**
 *
 * @author dell
 */
public class Teoria_ondulatoria_de_la_luz extends Formula{

    public Teoria_ondulatoria_de_la_luz(String numEntrada) throws DatoEntradaCheckedEx, DatosDefinidosEx {
        super(numEntrada);
    }



    public Teoria_ondulatoria_de_la_luz() {
    }
    
    private double c=3*(Math.pow(10, 8));//velocidad luz m/s

    
    public double LongOnda(){
        //v= c/L
            double v=getNumEntrada();
            
            double l=c/v;
//            System.out.println("Long onda: "+l);
            return l;
        }
    
        
        public double FrecuenciaRadiacion(){
            //L = c/v
            double l=getNumEntrada();
            
            double v=c/l;
//            System.out.println("Frecc radiacion: "+v);

            return v;
        }
        



    @Override
    public double evaluarSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
