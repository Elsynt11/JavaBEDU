public class Ambulancia extends UnidadEmergencia
{
    //referencias a otras clases
    private Sirena new_sirena;
    private SistemaGPS new_gps;
    private Operador new_operador;

    //constructor
    public Ambulancia(String nombre, String nombreOperador)
    {
        super(nombre);
        this.new_gps = new SistemaGPS();
        this.new_operador = new Operador(nombreOperador);
        this.new_sirena = new Sirena();
    }

    @Override
    public void responder()
    {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion()
    {
        activarUnidad();
        new_gps.localizar();
        new_sirena.activarSirena();
        new_operador.reportarse("👷‍♂️");
        responder();
    }

}
