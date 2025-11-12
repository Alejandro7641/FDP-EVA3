/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_referencia;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA3_7_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cliente[]=new String[5];
        double credito[]=new double[5];
        capturarClientes(cliente,credito);
        imprimir(cliente,credito);
    }
    public static void capturarClientes(String[] nombre, double[] credito){
    Scanner capt = new Scanner (System.in);
    for (int i=0; i<credito.length;i++){
    System.out.println("nombre del cliente");
    nombre[i]=capt.nextLine();
    System.out.println("credito del cliente");
    credito[i]=capt.nextDouble();
    capt.nextLine();
    }
    }
    public static void imprimir(String[] nombre, double[] credito){
    Scanner capt = new Scanner (System.in);
    for (int i=0; i<credito.length;i++){
    System.out.println("Nombre:"+nombre[i]+" Credito:"+credito[i]);
    }
    }
    public static void imprimir(String[] nombre){
    Scanner capt = new Scanner (System.in);
    for (int i=0; i<nombre.length;i++){
    System.out.println("Nombre:"+nombre[i]);
    }
    }
    public static void imprimir(double[] credito){
    Scanner capt = new Scanner (System.in);
    for (int i=0; i<credito.length;i++){
    System.out.println("Credito:"+credito[i]);
    }
    }
}