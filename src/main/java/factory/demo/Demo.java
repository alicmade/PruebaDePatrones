package factory.demo;

import factory.factoria.Dialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        //importante el orden de las clases
        dialog = new factory.factoria.ImpresoraDialog();
        dialog = new factory.factoria.HaltChekerDialog();
        //el resultado es el mismo
        //CAMBIARLO
         dialog = new factory.factoria.NegatorDialog();
    }

    static void runBusinessLogic() {
        String texto = "Hola mundo";
        dialog.ejecutarMaquina(texto);
    }
}
