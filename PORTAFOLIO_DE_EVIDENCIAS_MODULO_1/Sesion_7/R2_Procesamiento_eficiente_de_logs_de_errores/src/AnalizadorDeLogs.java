import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs
{
    public static void main(String[] args) throws IOException
    {
        /** Variables **/
        Path rutaArchivoLog= Paths.get("src/errores.log");
        Path rutaArchivoFallos = Paths.get("src/registro_fallos.txt");
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        ///⬇️ Descomentar para crear el archivo LOG
        //crearArchivoLog(rutaArchivoLog);

        try( BufferedReader lectura = Files.newBufferedReader(rutaArchivoLog) )
        {
            String linea;

            while ( (linea = lectura.readLine() ) != null )
            {
                totalLineas++;

                if ( linea.contains("ERROR") )
                {
                    totalErrores++;
                }

                if ( linea.contains("WARNING"))
                {
                    totalWarnings++;
                }
            }

            mostrarResumen(totalLineas, totalErrores, totalWarnings);

        }
        catch (IOException e)
        {
            crearArchivoFallos( rutaArchivoFallos, e.toString() );
        }
    }

    public static void mostrarResumen(int totalLineas, int totalErrores, int totalWarnings)
    {
        System.out.println("\n📊 Resumen del análisis de logs:");
        System.out.println("\n➡️ Total de líneas leídas: " + totalLineas);
        System.out.println("❌ Errores encontrados: " + totalErrores);
        System.out.println("⚠️ Advertencias encontradas: " + totalWarnings);

        int totalIncidentes = totalErrores + totalWarnings;
        double porcentaje = totalLineas > 0 ? ( (double) totalIncidentes / totalLineas) * 100 : 0;
        System.out.printf("📈 Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);
    }

    public static void crearArchivoFallos( Path rutaArchivoFallos, String mensaje_error) throws IOException
    {
        //if ( !Files.exists(rutaArchivoFallos) )
        //{
            Files.write( rutaArchivoFallos, mensaje_error.getBytes() );
            System.out.println("\n✅️ Archivo de registro de fallos creado.");
        // }
        // else
        //{
        // Files.write(rutaArchivoFallos, mensaje_error.getBytes(), StandardOpenOption.APPEND);
        // System.out.println("📄 Mensaje de error agregado al Archivo de registro de fallos.");
        //}

        String textoFallo = Files.readString(rutaArchivoFallos);
        System.out.println("\n️📄 Contenido de Archivo de fallos:");
        System.out.println(textoFallo);
    }


    /** BLOQUE PARA CREAR EL ARCHIVO DE errores.log y probar el codigo**/

    public static void crearArchivoLog( Path rutaArchivoLog) throws IOException
    {
        String errores = """
                [INFO] Sistema iniciado correctamente.
                [WARNING] Uso de memoria cercano al límite.
                [ERROR] No se pudo conectar a la base de datos.
                [INFO] Servicio de notificaciones en ejecución.
                [WARNING] Tiempo de respuesta alto detectado.
                [ERROR] Archivo de configuración no encontrado.
        """;

        Files.write( rutaArchivoLog, errores.getBytes() );
        System.out.println("️✅ Archivo de 'errores.log' creado.");
    }

    /** BLOQUE PARA CREAR EL ARCHIVO DE errores.log y probar el codigo**/
}