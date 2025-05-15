public abstract class UnidadEmergencia
{
    private String nombre;

    public UnidadEmergencia(String nombre)
    {
        this.nombre = nombre;
    }

    public abstract void responder();

    public void activarUnidad()
    {
        System.out.println("🚨 Activando unidad: " + nombre);
    }

}
