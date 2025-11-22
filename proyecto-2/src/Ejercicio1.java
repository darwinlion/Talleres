import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear una cola para gestionar los turnos
        Queue<String> colaAtencion = new LinkedList<>();

        System.out.println("=== SISTEMA DE REGISTRO DE TURNOS ===\n");

        // Simular la llegada de clientes
        System.out.println("--- CLIENTES LLEGANDO ---");
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Pedro"};

        for (String cliente : clientes) {
            colaAtencion.add(cliente);
            System.out.println("✓ " + cliente + " llegó - Turnos en espera: " + colaAtencion.size());
        }

        // Procesar turnos (atender clientes)
        System.out.println("\n--- ATENDIENDO CLIENTES (ORDEN FIFO) ---");
        int numeroTurno = 1;
        while (!colaAtencion.isEmpty()) {
            String clienteAtendido = colaAtencion.poll(); // Saca el primero
            System.out.println("Turno #" + numeroTurno + ": Atendiendo a " + clienteAtendido);
            numeroTurno++;
        }

        System.out.println("\n✓ Todos los clientes fueron atendidos en orden de llegada");
        System.out.println("Cola final - Clientes en espera: ");
    }
}
