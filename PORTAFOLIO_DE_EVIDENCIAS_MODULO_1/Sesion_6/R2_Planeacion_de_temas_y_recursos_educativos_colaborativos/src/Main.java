import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add( new Tema("Lectura comprensiva", 2) );
        temas.add( new Tema("Matemáticas básicas", 1) );
        temas.add( new Tema("Cuidado del medio ambiente", 3) );

        // lista ordenada alfabéticamente (orden natural)
        Collections.sort(temas);
        System.out.println("\n🔤 Orden alfabético:");
        for (Tema t : temas)
        {
            System.out.println(t);
        }

        // orden por prioridad ascendente
        temas.sort( Comparator.comparingInt(Tema::getPrioridad) );
        System.out.println("\n‼️ Orden por prioridad:");
        for (Tema t : temas)
        {
            System.out.println(t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        System.out.println("\n🔗 Recursos disponibles:");
        recursos.forEach( (titulo, enlace) -> {
            System.out.println(titulo + ": " + enlace);
        });
    }
}