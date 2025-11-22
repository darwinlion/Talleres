
import java.util.List;
import java.util.LinkedList;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear una lista enlazada para gestionar palabras con inserciones frecuentes
        List<String> documento = new LinkedList<>();

        System.out.println("=== EDITOR DE TEXTO CON INSERCIONES EN MEDIO ===\n");

        // Inicio con algunas palabras
        System.out.println("--- CONTENIDO INICIAL ---");
        documento.add("El");
        documento.add("gato");
        documento.add("come");
        documento.add("pescado");

        System.out.print("Texto: ");
        System.out.println(documento);

        // Insertar palabras en posiciones intermedias (OPERACIÓN CRÍTICA)
        System.out.println("\n--- INSERCIONES EN POSICIONES INTERMEDIAS ---");

        // Insertar "negro" entre "gato" (índice 1) y "come" (índice 2)
        System.out.println("Insertando 'negro' entre 'gato' y 'come'...");
        documento.add(2, "negro");
        System.out.print("Texto: ");
        System.out.println(documento);
        System.out.println("✓ Inserción O(1) realizada sin mover elementos");

        // Insertar "muy" entre "come" (índice 3) y "pescado" (índice 4)
        System.out.println("\nInsertando 'muy' entre 'come' y 'pescado'...");
        documento.add(4, "muy");
        System.out.print("Texto: ");
        System.out.println(documento);
        System.out.println("✓ Inserción O(1) realizada eficientemente");

        // Insertar al principio
        System.out.println("\nInsertando 'Hoy' al principio...");
        documento.add("Hoy");
        System.out.print("Texto: ");
        System.out.println(documento);

        // Insertar al final
        System.out.println("\nInsertando 'delicioso' al final...");
        documento.add("delicioso");
        System.out.print("Texto: ");
        System.out.println(documento);

        // Simulación de edición más compleja
        System.out.println("\n--- EDICIONES ADICIONALES ---");
        System.out.println("Documento actual: " + documento);
        System.out.println("Total de palabras: " + documento.size());

        // Reemplazar una palabra (remove + add)
        System.out.println("\nReemplazando 'pescado' por 'atún'...");
        int posicion = documento.indexOf("pescado");
        if (posicion != -1) {
            documento.remove(posicion);
            documento.add(posicion, "atún");
            System.out.println("✓ Reemplazo realizado");
        }
        System.out.print("Texto final: ");
        System.out.println(documento);

        // Mostrar cada palabra con su índice
        System.out.println("\n--- CONTENIDO DETALLADO ---");
        for (int i = 0; i < documento.size(); i++) {
            System.out.println("[" + i + "] " + documento.get(i));
        }

        System.out.println("\n✓ LinkedList es ideal para este caso:");
        System.out.println("  - Inserciones/eliminaciones en O(1)");
        System.out.println("  - No requiere copiar elementos como ArrayList");
        System.out.println("  - Perfecto para editores de texto y listas editables");
    }
}
