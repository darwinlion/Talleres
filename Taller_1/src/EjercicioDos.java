/*
Implemente un vector de tipo String que contenga los nombres de 6 productos disponibles
en una tienda. El programa debe:
a) Mostrar la lista completa de productos.
b) Permitir buscar un producto por su nombre e indicar si est ́a disponible.
c) Simular la eliminaci ́on de un producto reemplaz ́andolo por la palabra "Agotado".
 */

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] productos ={"papa","cafe","naranjas","manzanas","arroz"};
        System.out.println("_______Productos_______");
        for(int i=0;i<productos.length;i++){
            System.out.println ((i+1) +" ." + productos[i]);
        }
        System.out.println(" \nIngrese el prodcunto que quieres buscar");
        String buscar=entrada.nextLine();

        boolean encontrado=false;


        int posicion=-1;//esto es del for inferior.

        for(int i = 0; i <productos.length; i++){
            if(productos[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                posicion=i;
                break;
            }
        }
        if (encontrado){
            System.out.println("EL PRODUCTO SE ENCUENTRA "+productos[posicion]);
        }else {
            System.out.println("EL PRODUCTO NO A SIDO ENCONTRADO "+buscar);
        }

        if (encontrado){
            productos[posicion]="agotado";
            System.out.println("\n el produto agotado");
        }
        System.out.println("\n_______lista actualizada______");
            for (int i=0;i<productos.length;i++){
                System.out.println((i+1) +". " + productos[i]);
            }
        entrada.close();

    }
}
