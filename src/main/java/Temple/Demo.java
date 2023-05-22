package Temple;

import java.util.Scanner;

public class Demo {
    public static String preguntarInput(){
        System.out.println("Introduce el texto a procesar");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
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