package Cliente;

import Temple.HaltChekerTemple;
import Temple.ImpresoraTemple;
import Temple.MaquinaPrincipal;
import Temple.NegatorTemple;
import java.util.Scanner;

public abstract class Menu {
    public static String preguntarInput(){
        System.out.println("Introduce el texto a procesar");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void menu() {
        String input = preguntarInput();
        MaquinaPrincipal maquinaImpresora = new ImpresoraTemple();
        String text1 = maquinaImpresora.ejecutarMP(input);
        MaquinaPrincipal maquinaHaltCheker = new HaltChekerTemple();
        String text= maquinaHaltCheker.ejecutarMP(text1);
        MaquinaPrincipal maquinaNegator = new NegatorTemple();
        maquinaNegator.ejecutarMP(text);
    }


}
