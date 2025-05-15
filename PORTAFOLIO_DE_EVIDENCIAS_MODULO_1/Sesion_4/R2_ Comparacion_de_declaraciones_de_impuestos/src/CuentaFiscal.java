import java.util.Objects;

public class CuentaFiscal
{
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible)
    {
        this.rfc = rfc;
        this.saldoDisponible = ( saldoDisponible) <= 0 ? 0.00 : saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d)
    {
        return Objects.equals( getRfc(), d.rfc() );
    }

    public String getRfc()
    {
        return rfc;
    }

    public double getSaldoDisponible()
    {
        return saldoDisponible;
    }

}
