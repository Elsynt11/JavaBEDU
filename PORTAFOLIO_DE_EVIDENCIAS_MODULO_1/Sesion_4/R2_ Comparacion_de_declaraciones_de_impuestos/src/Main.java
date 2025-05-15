//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        DeclaracionImpuestos declaracionImpuestos = new DeclaracionImpuestos("XAXX010101009", 8700.0 );
        CuentaFiscal cuentaFiscal = new CuentaFiscal("XAXX010101000", 9500.0);

        System.out.println();
        System.out.println( "📄 Declaración enviada por RFC: " + declaracionImpuestos.rfc() + " por $" + declaracionImpuestos.montoDeclarado() );
        System.out.println( "🏦 Cuenta fiscal registrada con RFC:" + cuentaFiscal.getRfc() + ", saldo disponible: $" + cuentaFiscal.getSaldoDisponible() );
        System.out.println( "✅ ¿RFC válido para esta cuenta?:" + cuentaFiscal.validarRFC(declaracionImpuestos) );
    }
}