package Temple;

import java.util.Scanner;

public class MaquinaCompleta extends MaquinaPrincipal{
    @Override
    public String entrada() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }

    @Override
    public String salida(String output) {
        if (output.equals("Operacion infinita")){
            System.out.println("Loop");
        }
        else {
            System.out.println(output);
        }
        return output;
    }
}
