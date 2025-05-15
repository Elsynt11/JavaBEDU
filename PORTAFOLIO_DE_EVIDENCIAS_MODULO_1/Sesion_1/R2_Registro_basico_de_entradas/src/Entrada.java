public class Entrada
{
    String nombre;
    double precio;

    //constructor
    public Entrada(String nom, double pre)
    {
        nombre = nom;
        precio = pre;
    }

    public void mostrarIformacion()
    {
        System.out.println("Informacion del evento");
        System.out.println("Evento: " + nombre + " | " + "Precio: $" + precio);
    }
}
