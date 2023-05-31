/*

 */
package Unidad_1;

import java.util.Scanner;


public class Atomo_hidrogeno extends Formula{

    public Atomo_hidrogeno(String numEntrada,String numEntrada2) throws DatoEntradaCheckedEx, DatosDefinidosEx {
        super(numEntrada,numEntrada2);
    }

    public Atomo_hidrogeno() {
    }
    
    private double RH =2.18*Math.pow(10, -18); //Fórmula de Bohr para el átomo de hidrógeno
    private double nivelIN; //Nivel inicial
    private double nivelFIN; //Nivel final
    private double E1;
    private double E2; // Valor final de energía

//------------------------------------------------------------------------------



public String Energia(){
    
 Scanner leer = new Scanner(System.in);
//     System.out.println("\nEnergía de átomos de hidrógeno.");
//     System.out.println("Nivel inicial:");
    String res;
    System.out.println(getNumEntrada());
    System.out.println(getNumEntrada2());

     nivelIN = getNumEntrada();
//     System.out.println("Nivel final:");
     nivelFIN = getNumEntrada2();
     
         E1=(1/(nivelIN*nivelIN))-(1/(nivelFIN*nivelFIN)); //Fórmula de la energía de los átomos
         E2 = RH*E1;
//     System.out.println("La energia es de: " +E2+ " Joules"); 
     res=E2+ " Joules";
     
       if (nivelIN<nivelFIN){
//         System.out.println("Absorbe energía."); //Depende el valor de los niveles para saber si se absorbe o libera la energía       
         res+="  -  Absorbe energía.";
       } else if (nivelIN>nivelFIN){
//         System.out.println("Libera energía.");     
         res+="  -  Libera energía.";
     } 
       
       return res;
}

    @Override
    public double evaluarSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
