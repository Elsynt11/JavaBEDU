import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        // Paso 1: ArrayList para registrar todas las especies en orden
        List<String> muestrasEspecies = new ArrayList<>();
        muestrasEspecies.add("Homo sapiens");
        muestrasEspecies.add("Mus musculus");
        muestrasEspecies.add("Arabidopsis thaliana"); // Llega repetido
        muestrasEspecies.add("Homo sapiens");


        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestrasEspecies); // Elimina duplicados


        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> investigadorEspecie = new HashMap<>();
        investigadorEspecie.put("M-001", "Dra. López");
        investigadorEspecie.put("M-002", "Dr. Hernández");
        investigadorEspecie.put("M-003", "Dra. Villareal");
        investigadorEspecie.put("M-004", "Dra. López");


        // Paso 4: Mostrar resultados

        System.out.println("\n📄 Lista completa y ordenada de muestras:");
        for ( int i = 0; i < muestrasEspecies.size(); i++ )
        {
            System.out.println( i + 1 + ". 🧬" + muestrasEspecies.get(i) );
        }

        System.out.println("\n✅ Especies únicas procesadas:");
        for ( String especie : especiesUnicas )
        {
            System.out.println("📍 " + especie);
        }

        System.out.println("\n🔬 Relación de ID de muestra → investigador:");
        for ( Map.Entry<String, String> entry : investigadorEspecie.entrySet() )
        {
            System.out.println( "🧬" + entry.getKey() + " → 👨‍🔬" + entry.getValue());
        }

        // búsqueda por ID de muestra
        String idMuestra = "M-002";
        System.out.println( "\n🔍 Búsqueda por ID de muestra " + idMuestra + "\n Investigador: 👨‍🔬" + investigadorEspecie.get( idMuestra) );

    }
}