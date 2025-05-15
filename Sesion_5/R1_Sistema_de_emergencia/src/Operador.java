public class Operador
{
    private String nombre;

    public Operador(String nombre)
    {
        this.nombre = nombre;
    }

    public void reportarse(String icono)
    {
        System.out.println( icono + " Operador " + nombre + " reportándose");
    }
}
