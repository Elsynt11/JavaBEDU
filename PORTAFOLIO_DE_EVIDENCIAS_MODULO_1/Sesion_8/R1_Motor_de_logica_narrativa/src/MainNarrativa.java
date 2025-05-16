public class MainNarrativa
{
    private final TransicionHistoria transicion;
    private final DialogoTexto dialogo;
    private final DecisionBinaria desicion;

    //constructor de la clase
    public MainNarrativa(TransicionHistoria transicion, DialogoTexto dialogo, DecisionBinaria desicion)
    {
        this.desicion = desicion;
        this.dialogo = dialogo;
        this.transicion = transicion;
    }

    public void ejecutarEscena()
    {
        dialogo.mostrarDialogo();
        if ( desicion.tomarDecision() )
        {
            System.out.println("[JUEGO]: 🕹️ Perfecto, canalizando energía...");
            System.out.println("[ACCION ESCENA]: ✨ 🚕 Un taxi flotante aparece envuelto en líneas de código brillante.");
            System.out.println("[ACCION ESCENA]: ✨ 🚕 El jugador se sube al taxi camino a la estación.");
            transicion.ejecutarTransicion();
        }
        else
        {
            System.out.println("[JUEGO]: 🕹️ Has decidido no usar tus JAVA coins.");
            System.out.println("[ACCION ESCENA]: 😥 El jugador camina rapidamente hacia la estación, pero parece que el portal comienza a cerrarse...");
            System.out.println("[JUEGO]: 🕹️ ¿Lograrás llegar a tiempo?");
        }
    }

    public static void main(String[] args)
    {
        TransicionHistoria transicionHistoria = new TransicionSimple();
        DialogoTexto dialogoTexto = new DialogoTexto("👩 Necesito llegar a la estación antes de que el portal cierre... pero está muy lejos para ir caminando.");
        DecisionBinaria decisionBinaria = new DecisionBinaria();
        MainNarrativa narrativa = new MainNarrativa(transicionHistoria, dialogoTexto, decisionBinaria);

        narrativa.ejecutarEscena();
    }
}