/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capt = new Scanner (System.in);
        String aMensaje;
        int aValor;
        System.out.println("captura mensaje");
        aMensaje=capt.nextLine();
        System.out.println("captura repeticiones");
        aValor=capt.nextInt();
        aimprimirMensaje(aMensaje,aValor);
    }
    public static void aimprimirMensaje(String aMensaje, int aRepeticiones){
    for(int i=0; i<aRepeticiones; i++){
    System.out.println(aMensaje);
    }
    }
}
