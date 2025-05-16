import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion
{
    public static void main(String[] args)
    {
        Path rutaArchivo = Paths.get("src/config/parametros.txt");
        String contenido = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8""";

        try
        {
            guardarParametros(rutaArchivo, contenido);

            if( Files.exists(rutaArchivo) )
            {
                System.out.println("\n✅ Archivo escrito exitosamente.");
                leerParametros(rutaArchivo);
            }
            else
            {
                System.out.println("\n❌No se pudo crear el Archivo.");
            }
        }
        catch (IOException e)
        {
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }
    }

    public static void guardarParametros(Path rutaArchivo, String contenido) throws IOException
    {
        Files.write( rutaArchivo, contenido.getBytes() );
        System.out.println("\n⚙️ Generando/escribiendo el Archivo ...");
    }

    public static void leerParametros(Path rutaArchivo) throws IOException
    {
        String textoMostrado = Files.readString(rutaArchivo);
        System.out.println("\n📄 Contenido del archivo: \n");
        System.out.println(textoMostrado);
    }
}