package factory.factoria;

import factory.maquina.Button;



public abstract class Dialog {
    public String ejecutarMaquina(String texto) {
        Button maquina = createButton();
        String output = maquina.ejecutar(texto);
        return output;
    }

    protected abstract Button createButton();
}
