public class Paciente
{
    String nombre;
    int edad;
    String expediente;

    public void mostrarInformacion()
    {
        System.out.println("Confirmacion de datos del paciente");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
