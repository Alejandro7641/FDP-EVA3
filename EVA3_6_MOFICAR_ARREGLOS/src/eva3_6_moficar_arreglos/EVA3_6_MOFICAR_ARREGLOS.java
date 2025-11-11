/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_moficar_arreglos;

/**
 *
 * @author alexn
 */
public class EVA3_6_MOFICAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo1[]=new int [10];
        int arreglo2[]=new int [20];
        allenarArreglo(arreglo1);
        allenarArreglo(arreglo2);
        aimprimirArreglo(arreglo1);
        aimprimirArreglo(arreglo2);
    }
    public static void allenarArreglo(int arreglo[]){
    for(int i=0;i<arreglo.length;i++){
    arreglo[i]=(int)(Math.random()*100);
    }
    }
    public static void aimprimirArreglo(int arreglo[]){
    for(int i=0;i<arreglo.length;i++){
    System.out.println("["+arreglo[i]+"]");
    }
    }
    
}
