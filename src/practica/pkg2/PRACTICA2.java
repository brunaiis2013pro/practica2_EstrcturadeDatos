/*
Ejercicio 4
Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se
llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los
elementos introducidos).
 */
package practica.pkg2;

import java.util.Scanner;

public class PRACTICA2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] elementos = new int[10];
        int cont=0;
        
        //Pedimos los 10 elementos de mi array o vector
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digita un numero: ");
            elementos[i] = entrada.nextInt();    //Guardamos los 10 numeros
            if((elementos[i]<0)){
                break;
            }
            cont++;
        }
        
        //Imprimimos los elementos del vector
        System.out.println("\nEl arreglo es: ");
         for(int i=0; i<cont; i++){
          
             System.out.print( elementos[i]+" ");
        }
        System.out.println();
    }
    
}
