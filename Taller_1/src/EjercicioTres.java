/*
Cree un vector de tipo double con las ventas de una tienda durante 7 d ́ıas. El programa
debe:
a) Mostrar todas las ventas registradas.
b) Calcular el total y el promedio semanal de ventas.
c) Indicar el d ́ıa con la mayor y menor venta.
 */

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7]; //Vector con las ventas de 7 días
        double total = 0;
        double mayorVenta, menorVenta;
        int diaMayor = 0, diaMenor = 0;
        
        //Ingresar las ventas de los 7 días
        System.out.println("Registro de ventas semanales");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
            total += ventas[i];
        }
        
        //Calcular promedio
        double promedio = total / ventas.length;
        
        //Determinar mayor y menor venta
        mayorVenta = ventas[0];
        menorVenta = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                diaMayor = i;
            }
            if (ventas[i] < menorVenta)
            {
                menorVenta = ventas[i];
                diaMenor = i;
            }
        }
        
        //Mostrar resultados
        System.out.println("\nResultados");
        
        //Mostrar todas las ventas
        System.out.println("Ventas registradas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Día " + (i + 1) + ": $" + ventas[i]);
        }
        
        //Total y promedio
        System.out.println("\nTotal de ventas de la semana: $" + total);
        System.out.println("Promedio de ventas semanales: $" + promedio);
        
        //Día con mayor y menor venta
        System.out.println("\nDía con mayor venta: Día " + (diaMayor + 1) + " con $" + mayorVenta);
        System.out.println("Día con menor venta: Día " + (diaMenor + 1) + " con $" + menorVenta);
        
        sc.close();
    }
}
