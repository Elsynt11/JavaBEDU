public class Principal
{
    public static void main(String[] args)
    {
        //objetos
        Entrada objeto1 = new Entrada("Obra de teatro", 250.75);
        Entrada objeto2 = new Entrada("Conferencia", 100.50);
        Entrada_Record objeto3 = new Entrada_Record("Concierto de The Warning", 1600.23);

        objeto1.mostrarIformacion();
        System.out.println();
        objeto2.mostrarIformacion();
        System.out.println();
        objeto3.mostrarInformacion();
    }
}