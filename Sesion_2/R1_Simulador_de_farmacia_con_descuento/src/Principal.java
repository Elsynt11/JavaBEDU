import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        var total_cuenta = 0.00;
        var total_pagar = 0.00;
        var descuento = 0.00;
        var hay_descuento = false;

        SimuladorFarmacia nuevo_producto = new SimuladorFarmacia();
        Scanner input_producto = new Scanner(System.in);

        System.out.println("Medicamento: ");
        nuevo_producto.nombre_medicamento = input_producto.nextLine();
        System.out.println("Cantidad: ");
        nuevo_producto.cantidad_piezas = input_producto.nextInt();
        input_producto.nextLine();

        System.out.println("Precio unitario: ");
        nuevo_producto.precio_unitario = input_producto.nextDouble();
        input_producto.nextLine();
        input_producto.close();
        System.out.println();

        total_cuenta = nuevo_producto.precio_unitario * nuevo_producto.cantidad_piezas;
        descuento = (total_cuenta > 500) ? (total_cuenta * 0.15) : 0.00;
        hay_descuento = descuento > 0.00;
        total_pagar = total_cuenta - descuento;

        nuevo_producto.mostrarInformacion(total_cuenta, hay_descuento, descuento, total_pagar);
    }
}