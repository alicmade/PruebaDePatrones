package factory.factoria;

import factory.maquina.Button;
import factory.maquina.Impresora;

public class ImpresoraDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new Impresora();
    }
}

