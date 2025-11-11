/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_paso_valor;

/**
 *
 * @author alexn
 */
public class EVA3_4_PASO_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor=5;
        System.out.println("valor (antes)= "+valor);
        aincrementar(valor);
        System.out.println("valor (despues)= "+valor);
    }
    public static void aincrementar(int val){
    val=val+1;
    }
    
}
