package factory.maquina;

public class Impresora implements Button {
    @Override
    public String ejecutar(String texto) {
        System.out.println("Ejecuta" + texto);
        return texto;
    }
}
