package factory.factoria;

import factory.maquina.Button;
import factory.maquina.HaltCheker;

public class HaltChekerDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HaltCheker();
    }
}
