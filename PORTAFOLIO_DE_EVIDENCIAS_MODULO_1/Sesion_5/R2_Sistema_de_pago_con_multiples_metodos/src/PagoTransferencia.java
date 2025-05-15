public class PagoTransferencia extends MetodoPago
{
    private boolean validadorExterno;

    public PagoTransferencia(double monto, boolean validadorExterno)
    {
        super(monto);
        this.validadorExterno = validadorExterno;
    }

    @Override
    public void procesarPago()
    {
        System.out.println("📤 Procesando transferencia por $" + monto);
    }

    @Override
    public boolean autenticar()
    {
        return validadorExterno;
    }
}
