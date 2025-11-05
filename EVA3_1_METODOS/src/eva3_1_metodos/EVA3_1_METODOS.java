/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author alexn
 */
public class EVA3_1_METODOS {
    private static int num=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vall=5,vall2=10;
        int resu= sumarEnteros(vall, vall2);
        System.out.println("suma de 5 + 10 = "+resu);
        System.out.println("suma de 5 + 10 = "+sumarEnteros(vall, vall2));
        sumarEnteros(vall, vall2);
    }
    public static int sumarEnteros(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
    
}
