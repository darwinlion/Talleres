/*
Implemente dos vectores paralelos: uno de tipo String para los nombres
y otro de tipoString para los tel ́efonos. El sistema debe:

a) Mostrar toda la agenda con nombres y tel ́efonos.
b) Permitir buscar el n ́umero de tel ́efono de una persona.
c) Permitir actualizar el n ́umero telef ́onico de una persona existente.
 */


import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Dos vectores paralelos: Son dos o más vectores del mismo tamaño cuyos elementos se relacionan por su posición.
        String[] nombres = {"Ana", "Carlos", "María", "Luis", "Sofía"};
        String[] telefonos = {"3214567890", "3109876543", "3125554321", "3201112233", "3004445566"};
        
        int opcion;
        
        do {
            System.out.println("\nAGENDA TELEFÓNICA");
            System.out.println("1. Mostrar toda la agenda");
            System.out.println("2. Buscar número telefónico");
            System.out.println("3. Actualizar número telefónico");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar
            
            switch (opcion) {
                case 1:
                    //Mostrar toda la agenda
                    System.out.println("\nLista de contactos ");
                    for (int i = 0; i < nombres.length; i++) {
                        System.out.println(nombres[i] + " → " + telefonos[i]);
                    }
                    break;
                
                case 2:
                    //Buscar número telefónico
                    System.out.print("\nIngrese el nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;
                    
                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                            System.out.println(" El número de " + nombres[i] + " es: " + telefonos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("No se encontró a " + nombreBuscar + " en la agenda.");
                    }
                    break;
                
                case 3:
                    // c) Actualizar número telefónico
                    System.out.print("\nIngrese el nombre de la persona a actualizar: ");
                    String nombreActualizar = sc.nextLine();
                    boolean actualizado = false;
                    
                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Ingrese el nuevo número telefónico: ");
                            telefonos[i] = sc.nextLine();
                            System.out.println("Número de " + nombres[i] + " actualizado correctamente.");
                            actualizado = true;
                            break;
                        }
                    }
                    
                    if (!actualizado) {
                        System.out.println("No se encontró a " + nombreActualizar + " en la agenda.");
                    }
                    break;
                
                case 4:
                    System.out.println("\nSaliendo de la agenda...");
                    break;
                
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
            
        } while (opcion != 4);
        
        sc.close();
    }
}
