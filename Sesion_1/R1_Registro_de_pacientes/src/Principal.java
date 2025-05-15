import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Paciente nuevo_paciente = new Paciente();
        Scanner input_paciente = new Scanner(System.in);

        System.out.println("Ingresa el nombre");
        nuevo_paciente.nombre = input_paciente.nextLine();

        System.out.println("Ingresa la edad");
        nuevo_paciente.edad = input_paciente.nextInt();
        input_paciente.nextLine();

        System.out.println("Ingresa No. de expediente");
        nuevo_paciente.expediente = input_paciente.nextLine();

        input_paciente.close(); ///ya no pide mas informacion y cierra

        System.out.println();
        nuevo_paciente.mostrarInformacion();

    }
}