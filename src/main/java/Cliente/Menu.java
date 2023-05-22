package Cliente;

import decorador.MaquinaPrincipal;
import factory.factoria.Dialog;

import java.util.Scanner;

public class Menu {
    private static Dialog dialogImpresora;
    private static Dialog dialogHaltCheker;
    private static Dialog dialogNegator;

    private static MaquinaPrincipal maquinaPrincipal;
/*
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        dialogImpresora = new factory.factoria.ImpresoraDialog();
        dialogHaltCheker = new factory.factoria.HaltChekerDialog();
        dialogNegator = new factory.factoria.NegatorDialog();
    }

    static void runBusinessLogic() {
        dialogImpresora.ejecutarMaquina(String );

        dialogHaltCheker.ejecutarMaquina();
        dialogNegator.ejecutarMaquina();
    }

    static void impresora() {
        Scanner sc = new Scanner(System.in);
        maquinaPrincipal.input(sc.nextLine());
        maquinaPrincipal.ejecutarMaquinaPrincipal();
    }
*/
}
