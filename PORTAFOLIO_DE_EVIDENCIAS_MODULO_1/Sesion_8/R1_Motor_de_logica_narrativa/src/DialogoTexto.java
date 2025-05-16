public class DialogoTexto implements GestorDialogo
{
    private String mensaje;

    //constructor de la clase
    public DialogoTexto(String mensaje)
    {
        this.mensaje = mensaje;
    }

    @Override
    public void mostrarDialogo()
    {
        System.out.println("\n[DIALOGO]:" + mensaje);
    }
}
