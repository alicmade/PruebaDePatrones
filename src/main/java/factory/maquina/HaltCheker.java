package factory.maquina;

public class HaltCheker implements Button {
    @Override
    public String ejecutar(String texto) {
        int opcion = Math.random() < 0.5 ? 0 : 1;
        if (opcion == 0) {
            System.out.println("Halt " + texto);
            return "Halt";
        }else {
            System.out.println("No halt " + texto);
        }
        return "No halt";
    }
}
