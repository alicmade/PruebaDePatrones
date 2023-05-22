package Temple;

import factory.factoria.Dialog;

import java.util.Scanner;

public class MaquinaCompleta extends MaquinaPrincipal{

    public MaquinaCompleta() {
        super();
    }

    @Override
    public String ejecutarMP(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a procesar: ");
        input = sc.nextLine();
        System.out.println("Introduce el tipo de dialogo a usar: ");
        String tipoDialogo = sc.nextLine();
        //Dialog dialog = .getDialog(tipoDialogo);
        //output = dialog.ejecutar(input);
        System.out.println("El resultado es: " + output);
        return output;
    }
}
