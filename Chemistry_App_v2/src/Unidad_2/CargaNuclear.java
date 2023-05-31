/*

 */
package Unidad_2;

import Unidad_1.DatoEntradaCheckedEx;
import Unidad_1.DatosDefinidosEx;
import static Unidad_1.Formula.esUnNumero;
import static Unidad_3.ElementoQuimico.esUnNumero;


public class CargaNuclear {
    private int z;

    private int Nn;
    private int n;
    private int N;

    public CargaNuclear(String z, String Nn, String n, String N) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        setZ(z);
        setNn(Nn);
        setn(n);
        setN(N);
    }
    
    

    public int getZ() {
        return z;
    }

    public void setZ(String z) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        if((z==null)||(!(esUnNumero(z)))){
            throw new DatosDefinidosEx();
        }
        int tmp=Integer.parseInt(z);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.z = tmp;
    }




    public int getNn() {
        return Nn;
    }

    public void setNn(String Nn) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        if((Nn==null)||(!(esUnNumero(Nn)))){
            throw new DatosDefinidosEx();
        }
        int tmp=Integer.parseInt(Nn);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.Nn = tmp;
    }

    public int getn() {
        return n;
    }

    public void setn(String n) throws DatosDefinidosEx, DatoEntradaCheckedEx{
                if((n==null)||(!(esUnNumero(n)))){
            throw new DatosDefinidosEx();
        }
        int tmp=Integer.parseInt(n);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.n = tmp;
    }

    public int getN() {
        return N;
    }

    public void setN(String N) throws DatosDefinidosEx, DatoEntradaCheckedEx {
        if((N==null)||(!(esUnNumero(N)))){
            throw new DatosDefinidosEx();
        }
        int tmp=Integer.parseInt(N);
        if(tmp<=0){
//            throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        }

            this.N = tmp;
    }
 

    public double calcularZE() {
        return z - calcularEA();
    }
    

   public double calcularEA(){
     return (Nn * 0.35) + (n * 0.85) + N;   
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
