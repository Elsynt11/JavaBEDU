public class Pasajero {
    String nombre;
    String pasaporte;

    //constructor
    public Pasajero(String nombre, String pasaporte)
    {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

   public String getNombre()
    {
        return this.nombre;
    }

    String getPasaporte()
    {
        return this.pasaporte;
    }
}
