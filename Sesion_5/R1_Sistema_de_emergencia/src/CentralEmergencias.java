public class CentralEmergencias
{
    public static void main(String[] args)
    {
        Ambulancia ambulancia =  new Ambulancia("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de Bomberos", "Marco");

        System.out.println();
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
        System.out.println();

    }
}