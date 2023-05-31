/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_3;

import Unidad_1.DatoEntradaCheckedEx;
import Unidad_1.DatosDefinidosEx;
import static Unidad_1.Formula.esUnNumero;

/**
 *
 * @author dell
 */
public class ElementoQuimico {
    private String nombre;
    private int cantidad;


    public ElementoQuimico(String nombre, String cantidad) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        this.nombre = nombre;
        setCantidad(cantidad);

    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
       
    }

    public void setCantidad(String cantidad) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        
         if((cantidad==null)||(!(esUnNumero(cantidad)))){
            throw new DatosDefinidosEx();
        }
        int tmp=Integer.parseInt(cantidad);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.cantidad = tmp;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }



    public int calcularEnlaces() {
        int valencia=8;
        if(nombre=="H"){
            valencia=2;
            System.out.println("2");
        }
        return cantidad * valencia;
    }



    public int calcularEnlacesNoUtilizados() {
        return 8 * cantidad - calcularEnlaces();
    }
    
    
    
    
    
    public static boolean esUnNumero(String tmp) {
        try {
            Integer.parseInt(tmp);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
