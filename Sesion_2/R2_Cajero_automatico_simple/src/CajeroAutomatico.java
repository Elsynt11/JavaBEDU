import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner input_usuario = new Scanner(System.in);

        //variables
        var  saldo_inicial = 1000.0;
        int opcion_usuario;

        do
        {
            System.out.println("Hola");
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. ✅ Consultar saldo. ");
            System.out.println("2. 💰 Depositar dinero.");
            System.out.println("3. 💸 Retirar dinero.");
            System.out.println("4. 📤 Salir.");
            System.out.println();

            System.out.println("Por favor, ingrese una opcion.");
            opcion_usuario = input_usuario.nextInt();

            switch (opcion_usuario)
            {
                case 1 -> {
                    System.out.println("✅ CONSULTA DE SALDO");
                    System.out.println("Su saldo actual es de: $" + saldo_inicial + " MXN");
                }
                case 2 -> {
                    System.out.println("💰 DEPOSITO DE DINERO");
                    System.out.println("SALDO ACTUAL: $" + saldo_inicial);
                    System.out.println("Por favor ingrese el monto a depositar.");
                    double deposito = input_usuario.nextDouble();

                    saldo_inicial += deposito;

                    System.out.println("✅ Deposito agregado correctamente.");
                    System.out.println("El nuevo saldo es: $" + saldo_inicial);
                }
                case 3 -> {
                    System.out.println("💸 RETIRO DE DINERO");
                    if (saldo_inicial <= 0)
                    {
                        System.out.println("⚠️ No cuentas con saldo suficiente para esta operacion.");
                        continue;
                    }
                    else
                    {
                        System.out.println("SALDO ACTUAL: $" + saldo_inicial);
                        System.out.println("Ingresa el saldo a retirar");
                        double retiro = input_usuario.nextDouble();
                        saldo_inicial -= retiro;
                        System.out.println("✅ Retiro realizado correctamente.");
                        System.out.println("Monto retirado $" + retiro);
                        System.out.println("Su saldo actual es de: $" + saldo_inicial);
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por usar el Cajero.");
                }
                default -> {
                    System.out.println("Lo siento, no existe esa opcion. Por favor elige otra.");
                }
            }
        }
        while (opcion_usuario != 4);

    }
}