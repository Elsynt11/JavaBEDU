public class CajaRegistradora
{
    public static void main(String[] args)
    {
        MetodoPago[] metodoPagos = {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0, 500),
            new PagoTransferencia(230.0, false)
        };

        for (MetodoPago pago : metodoPagos)
        {
            System.out.println();
            if ( pago.autenticar() )
            {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }
            else
            {
                System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válida.");
            }
            System.out.println();
        }
    }
}