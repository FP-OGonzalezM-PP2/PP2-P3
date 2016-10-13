/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p3;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PP2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,n;
        num = pedirNumero();
        n = Factorial(num);
        Mostrar(num,n);
    }
    public static int pedirNumero (){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el valor del número que quiere saber su factorial ");
        num = entrada.nextInt();
        return num;
    }
    public static int Factorial(int num){
        int n = 1;
        for(int i=n; i>0; i--){
        n=n*i;   
        }
        return n;
    }
    public static void Mostrar(int num, int n){
        System.out.println("El factorial del número " +num +" es  " +n);
    }
}
