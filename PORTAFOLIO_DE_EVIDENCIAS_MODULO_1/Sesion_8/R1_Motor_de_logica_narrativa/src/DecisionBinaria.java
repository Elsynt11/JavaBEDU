import java.util.Scanner;

public class DecisionBinaria implements LogicaDesicion
{
    private Scanner desicionUsuario;

    //constructor de la clase
    public DecisionBinaria()
    {
        this.desicionUsuario = new Scanner(System.in);
    }

    @Override
    public boolean tomarDecision()
    {
        System.out.println("[DECISION JUGADOR]: 🕹️ ¿Deseas gastar 5 JAVA coins para invocar un taxi mágico? (s/n): ");
        String respuestaUsuario = desicionUsuario.nextLine().trim().toLowerCase();
        return respuestaUsuario.equals("s");
    }
}
