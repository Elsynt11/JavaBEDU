public class SimuladorFarmacia
{
    String nombre_medicamento;
    double precio_unitario;
    int cantidad_piezas;

    public void mostrarInformacion(double total_cuenta, boolean hay_descuento, double descuento, double total_pagar)
    {
        System.out.println("Informacion de Compra");
        System.out.println("Medicamento: " + nombre_medicamento);
        System.out.println("Cantidad: " + cantidad_piezas);
        System.out.println("Precio unitario: $" + precio_unitario);
        System.out.println("Total sin descuento: $" + total_cuenta);
        System.out.println("¿Aplica descuento?: " + hay_descuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total_pagar);
    }
}
