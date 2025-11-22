import java.util.Set;
import java.util.HashSet;
public class Ejercio2 {
    public static void main(String[] args) {
        // Crear un conjunto para evitar duplicados automáticamente
        Set<String> participantes = new HashSet<>();

        System.out.println("=== REGISTRO DE PARTICIPANTES (SIN DUPLICADOS) ===\n");

        // Intentar agregar nombres (algunos repetidos)
        String[] nombresIntentados = {
                "Ana García", "Carlos López", "Ana García",      // Ana repetida
                "María Rodríguez", "Juan Martínez", "Carlos López", // Carlos repetido
                "Pedro Sánchez", "María Rodríguez"                // María repetida
        };

        System.out.println("--- REGISTRANDO PARTICIPANTES ---");
        for (String nombre : nombresIntentados) {
            boolean seAgrego = participantes.add(nombre);

            if (seAgrego) {
                System.out.println("✓ Nuevo participante registrado: " + nombre);
            } else {
                System.out.println("✗ Duplicado rechazado: " + nombre + " (ya estaba registrado)");
            }
        }

        // Mostrar participantes únicos
        System.out.println("\n--- PARTICIPANTES REGISTRADOS ---");
        int contador = 1;
        for (String nombre : participantes) {
            System.out.println(contador + ". " + nombre);
            contador++;
        }

        System.out.println("\n ESTADÍSTICAS:");
        System.out.println("Total de nombres intentados: " + nombresIntentados.length);
        System.out.println("Participantes únicos registrados: " + participantes.size());
        System.out.println("Duplicados rechazados: " + (nombresIntentados.length - participantes.size()));

        // Verificación rápida si un nombre existe
        System.out.println("\n--- BÚSQUEDA RÁPIDA ---");
        String buscar = "Carlos López";
        if (participantes.contains(buscar)) {
            System.out.println("✓ " + buscar + " está registrado (búsqueda O(1))");
        } else {
            System.out.println("✗ " + buscar + " NO está registrado");
        }
    }
}
