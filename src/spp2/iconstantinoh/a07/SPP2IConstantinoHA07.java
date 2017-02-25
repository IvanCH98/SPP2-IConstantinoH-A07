/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a07;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     long[]exodia= new long[10];
     long var;
       long telefono;
       Scanner kb=new Scanner(System.in);
        System.out.println("Agenda personal");
    for (int i=0; i<exodia.length;i++) { //invocamos a Exodia4
        System.out.println("Ingrese el número telefónico "+(i+1));
        exodia[i]=kb.nextLong();
    }      
          
        try{
            System.out.print("\n ¿Qué número desea saber?: ");
                int numdearreglo=(int) kb.nextLong();
                telefono=exodia[(numdearreglo-1)];
                System.out.println("\nEl telefono de la persona "+numdearreglo+" es: "+telefono);
            

        }catch (Exception ex) {
System.out.println("Dato fuera de rango");
    }
        
    }
    
}
