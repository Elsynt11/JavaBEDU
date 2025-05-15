import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc)
    {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen()
    {
        String informacion = "📄 Factura generada:";

        informacion += "\nDescripción: " + descripcion;
        informacion += "\nMonto: $" + monto;
        informacion += "\nRFC: " + rfc.orElse("[No proporcionado]");

        return informacion;
    }
}