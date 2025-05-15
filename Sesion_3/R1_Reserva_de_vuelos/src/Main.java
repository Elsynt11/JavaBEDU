//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Pasajero pasajero1 = new Pasajero("Ana Martínez", "20002");
       Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");
       //vuelo1.asientoReservado = pasajero1;

        if(vuelo1.reservarAsiento(pasajero1))
        {
            System.out.println();
            System.out.println("✅ Reserva realizada con éxito.");
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("Lo siento no se pudo reservar");
            System.out.println();
        }

        System.out.println(vuelo1.obtenerItinerario());

        vuelo1.CancelarReserva();

        System.out.println(vuelo1.obtenerItinerario());

        vuelo1.reservarAsiento("Mario González", "P987654");

        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());
    }
}