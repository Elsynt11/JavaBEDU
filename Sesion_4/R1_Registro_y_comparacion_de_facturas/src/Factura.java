import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //agrega un codigo  unico basado en el a tributo folio
    @Override
    public int hashCode()
    {
        return Objects.hash(folio);
    }

    //compara los objetos
    @Override
    public boolean equals(Object obj)
    {
        if( this == obj ) { return true; }
        if( obj == null || getClass() != obj.getClass() ) { return false; }

        Factura fac = (Factura) obj;
        return this.folio.equals(fac.folio);
    }

    //imprime informacion
    @Override
    public String toString()
    {
        return "📄 Factura [folio = " + folio +
                ", cliente = " + cliente +
                ", total = $" + total + "]";
    }

}
