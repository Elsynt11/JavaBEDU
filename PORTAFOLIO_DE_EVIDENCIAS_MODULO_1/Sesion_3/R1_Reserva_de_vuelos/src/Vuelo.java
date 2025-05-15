public class Vuelo {
    final String codigoVuelo; //nunca cambia
    String destino;
    String horaSalida;
    Pasajero asientoReservado; //referencia a la clase pasajero;

    public Vuelo(String codigo, String destino, String horaSalida)
    {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p)
    {
        if(asientoReservado == null)
        {
            asientoReservado = p;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte)
    {
        Pasajero nuevo_pasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevo_pasajero);
    }

    public void CancelarReserva()
    {
        System.out.println();
        System.out.println("❌ Cancelando reserva...");
        System.out.println();
        asientoReservado = null;
    }

    public String obtenerItinerario()
    {
        String info_vuelo = "✈️ Itinerario del vuelo:";
        info_vuelo += "\nCódigo:" + codigoVuelo;
        info_vuelo += "\nDestino: " + destino;
        info_vuelo += "\nSalida: " + horaSalida;
        info_vuelo += "\nPasajero: " + ( (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]" );
        return info_vuelo;
    }


}
