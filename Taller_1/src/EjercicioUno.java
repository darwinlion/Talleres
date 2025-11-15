/*
Cree un programa que almacene las notas de 5 estudiantes en un vector de tipo double.
El sistema debe:
a) Permitir ingresar las notas de los 5 estudiantes.
b) Calcular y mostrar el promedio del grupo.
c) Mostrar cu ́antos estudiantes aprobaron (nota ≥ 60) y cu ́antos reprobaron.
 */

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[5]; //aca se almacenan las notas
        double suma = 0;        //acumula y promedia las notas
        int aprobados = 0, reprobados = 0;      //contadores

        //calcula el promedio por medio de un loop de for
        for(int i = 0; i < notas.length; i++){
            System.out.print("Introduce el nota: " +(i+1) + ": ");
            notas[i] = entrada.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / notas.length;

        //calcula los que aprovaron y los que no
        for (double nota : notas) {
            if (nota >= 60) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        //resultados
        System.out.println("/n _____Resultados______");
        System.out.println("La promedio es: " + promedio);
        System.out.println("los reprobadis son: " + reprobados);
        System.out.println("los aprobados son: " + aprobados);

        entrada.close();

    }
}
