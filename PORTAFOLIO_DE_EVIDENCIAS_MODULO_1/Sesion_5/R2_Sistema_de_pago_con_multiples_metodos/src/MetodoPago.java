public abstract class MetodoPago implements Autenticable
{
    protected double monto;

    public MetodoPago(double monto)
    {
        this.monto = monto;
    }

    //Metodos abstracto que cada metodo pago debe implementar
    public abstract void procesarPago();

    @Override
    public abstract boolean autenticar();

    public void mostrarResumen()
    {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto );
    }

}
