import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU
{
    public static void main(String[] args)
    {
        final int TOTAL_SERVIDORES = 5;
        Scanner inputUsuario = new Scanner(System.in);
        Set<Integer> consumosRegistrados = new HashSet<>();

        System.out.println("\n=== MONITOR DE CONSUMO DE CPU ===");

        try
        {
            for (int i = 0; i < TOTAL_SERVIDORES; i++)
            {
                System.out.print("\nIngrese el consumo de CPU del servidor " + (i + 1) + " (%): ");
                String entradaUsuario = inputUsuario.nextLine().trim();

                int consumoCPU;

                // Validación numérica
                try
                {
                    consumoCPU = Integer.parseInt(entradaUsuario);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("[❌ Error]: El valor debe ser numérico.");
                    i--; // intenta de nuevo la entreda del que falla
                    continue;
                }

                // Validación de rango
                if (consumoCPU < 0 || consumoCPU > 100)
                {
                    System.out.println("[❌ Error]: El valor debe estar entre 0 y 100.");
                    i--; // intenta de nuevo la entreda del que falla
                    continue;
                }

                // Validación de duplicados
                if ( consumosRegistrados.contains( consumoCPU ) )
                {
                    System.out.println("[⚠️ Advertencia]: Ya registraste ese valor. Intenta con otro.");
                    i--; // intenta de nuevo la entreda del que falla
                    continue;
                }

                // Validación de consumo crítico
                if (consumoCPU > 95)
                {
                    throw new ConsumoCriticoException("\n[‼️ Crítico] ¡Consumo crítico detectado en el servidor " + (i + 1) + " (" + consumoCPU + "%)!");
                }

                consumosRegistrados.add(consumoCPU);
                System.out.println("[✅ Success]: Registro exitoso.");
            }

            System.out.println("\n[✅ Success] ✔️ Todos los consumos fueron registrados correctamente.");
            System.out.println("Valores finales: " + consumosRegistrados);

        }
        catch (ConsumoCriticoException e)
        {
            System.out.println( e.getMessage() );
        }
        finally
        {
            if (inputUsuario != null)
            {
                inputUsuario.close();
                System.out.println("\n📦 Recurso Scanner cerrado correctamente.");
            }
        }
    }
}
