package Temple;

import composite.MaquinaCompleta;

public abstract class MaquinaPrincipal {
    composite.MaquinaCompleta maquinaPrincipalComposite = new MaquinaCompleta();
    String input;
    String output;
    public abstract String ejecutarMP(String input);
}
