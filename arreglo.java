/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package promedios;
import java.util.Scanner;
/**
 *
 * @author Compu
 */
public class arreglo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner linea= new Scanner (System.in);
       String nombre;
       System.out.println("Ingrese su Nombre completo");
       nombre=linea.nextLine();
       
int[] calificacion = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < calificacion.length; i++){
            System.out.println("Ingresa tu calificacion numero:"+i);
            calificacion[i]=sc.nextInt();
        }
        System.out.println("Nombre del alumno: "+nombre);
        System.out.println("CALIFICACIONES");
        for(int y=0; y < calificacion.length; y++){
            System.out.println("calificacion["+y+"]="+calificacion[y]);
        }
        int suma = 0;
        for(int x = 0; x < calificacion.length; x++){
        suma += calificacion[x];
        }
        int promedio =suma/5;
        System.out.println("su promedio fue:"+promedio);
        int cal = promedio;
       
        if(cal == 91 || cal == 100){
        System.out.println("Calificacion: A");
        }else{
            if(cal <= 90 && cal >= 81){
            System.out.println("Calificacion: B");
            }else{
            if(cal <= 80 && cal >= 71){
            System.out.println("Calificacion: C");
            }else{
                if(cal <= 70 && cal >= 61){
                System.out.println("Calificacion: D");
                }else{
                if(cal <= 60 && cal >= 51){
                System.out.println("Calificacion: E");    
                } else{
                if(cal <= 50 && cal >= 0){
                System.out.println("Calificacion: F");    
                }
                else{
                System.out.println("Fuera de rango");
                }
                }
                }
            }
            }
        }
    }
}


        
    

