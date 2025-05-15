public class UnidadBomberos extends UnidadEmergencia
{
    //referencias a otras clases
    private SistemaGPS new_gps;
    private Sirena new_sirena;
    private Operador new_operador;

    @Override
    public void responder()
    {
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }

    //constructor
    public UnidadBomberos(String nombre, String nombreOperador)
    {
        super(nombre);
        this.new_gps = new SistemaGPS();
        this.new_sirena = new Sirena();
        this.new_operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion()
    {
        activarUnidad();
        new_gps.localizar();
        new_sirena.activarSirena();
        new_operador.reportarse("🧑‍🚒");
        responder();
    }
}
