public class Patrulla extends UnidadEmergencia
{
    //referencias a otras clases
    private Sirena new_sirena;
    private SistemaGPS new_gps;
    private Operador new_operador;

    //constructor
    public Patrulla(String nombre, String nombreOperador)
    {
        super(nombre);
        this.new_sirena = new Sirena();
        this.new_gps = new SistemaGPS();
        this.new_operador = new Operador(nombreOperador);
    }

    @Override
    public void responder()
    {
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }

    public void iniciarOperacion()
    {
        activarUnidad();
        new_gps.localizar();
        new_sirena.activarSirena();
        new_operador.reportarse("👮");
        responder();
    }

}
