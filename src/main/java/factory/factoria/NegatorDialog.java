package factory.factoria;

import factory.maquina.Button;
import factory.maquina.Negator;

public class NegatorDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new Negator();
    }
}
