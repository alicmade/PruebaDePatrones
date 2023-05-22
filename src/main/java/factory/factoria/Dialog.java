package factory.factoria;

import factory.maquina.Button;



public abstract class Dialog {
    public void ejecutarMaquina(String texto) {
        Button maquina = createButton();
        maquina.ejecutar(texto);
    }

    protected abstract Button createButton();
}
