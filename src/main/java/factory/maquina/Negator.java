package factory.maquina;

public class Negator implements Button {
    @Override
    public String ejecutar(String texto) {
        if (texto.equals("Halt")) {
            System.out.println("Se detiene");
            texto = "No halt";
            return  texto;
        } else if (texto.equals("No halt")){
            System.out.println("Sigue ejecutando");
            texto = "Halt";

        }

        return texto;
    }
}
