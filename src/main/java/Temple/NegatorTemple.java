package Temple;

import factory.factoria.Dialog;

public class NegatorTemple extends MaquinaCompleta{

                public NegatorTemple() {
                    super();
                }

                @Override
                public String ejecutarMP(String input) {
                    Dialog dialogNegator = new factory.factoria.NegatorDialog();
                    maquinaPrincipalComposite.addMaquina(dialogNegator);
                    String outputNegator = maquinaPrincipalComposite.ejecutarMP(input);
                    return outputNegator;
                }
}

