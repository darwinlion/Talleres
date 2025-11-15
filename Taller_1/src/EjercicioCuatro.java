/*
Dise ̃ne un programa que almacene las temperaturas m ́aximas registradas durante los
 ́ultimos 7 d ́ıas. El sistema debe:
a) Permitir registrar las temperaturas.
b) Mostrar las temperaturas ingresadas y su promedio.
c) Indicar los d ́ıas en los que la temperatura fue superior al promedio.
 */

import java.util.Scanner;

public class EjercicioCuatro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7]; // Vector para las temperaturas de 7 días
        double suma = 0;
        
        //Registrar las temperaturas
        System.out.println("Registro de temperaturas máximas de la semana");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
            suma += temperaturas[i];
        }
        
        //Calcular promedio
        double promedio = suma / temperaturas.length;
        
        // Mostrar temperaturas y promedio
        System.out.println("\n Temperaturas registradas ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
        }
        System.out.println("\nPromedio semanal de temperatura: " + promedio + " °C");
        
        //Mostrar los días con temperatura superior al promedio
        System.out.println("\n Días con temperatura superior al promedio ");
        boolean hayAltas = false;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
                hayAltas = true;
            }
        }
        
        if (!hayAltas) {
            System.out.println("Ningún día tuvo una temperatura superior al promedio.");
        }
        
        sc.close();
    }
}
