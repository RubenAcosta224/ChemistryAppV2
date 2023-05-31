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
public class Energia_cuantizada extends Formula{

    public Energia_cuantizada(String numEntrada) throws DatoEntradaCheckedEx, DatosDefinidosEx {
        super(numEntrada);
    }
    
    
    //E=hv
    
    //constante plank
    private double h=6.626E-34;
    
    
    
    public double Frecuencia_Radiacion() {
        double e=getNumEntrada();
        double v=e/h;
        
        return v;
        
    }
    
    public double Energia(){
        double v=getNumEntrada();
        double e=h*v;
        
        return e;
    }
    
    
    
    
    //con long onda, da frecc radiacion
    public double energia_por_longOnda() throws DatoEntradaCheckedEx, DatosDefinidosEx{
//        v=2.72*(Math.pow(10, 13));
        double l=getNumEntrada();
        
        Teoria_ondulatoria_de_la_luz freccRadiacion=new Teoria_ondulatoria_de_la_luz(""+l);
        
        
        double e=h*freccRadiacion.FrecuenciaRadiacion();
    
//    System.out.println("Energia: "+e);
        return e;
}
    
    
    
      
    public double longOnda_por_energia() throws DatoEntradaCheckedEx, DatosDefinidosEx{
//        v=2.72*(Math.pow(10, 13));
        double e=getNumEntrada();
        
        double freccRadiacion=e/h;
        
        
        
        Teoria_ondulatoria_de_la_luz longOnda=new Teoria_ondulatoria_de_la_luz(""+freccRadiacion);
        
        
        double res=longOnda.LongOnda();
    
//    System.out.println("Energia: "+e);
        return res;
}



    @Override
    public double evaluarSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
