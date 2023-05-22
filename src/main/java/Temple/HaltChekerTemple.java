package Temple;

import composite.MaquinaCompleta;
import factory.factoria.Dialog;

public class HaltChekerTemple extends MaquinaPrincipal{

            public HaltChekerTemple() {
                super();
            }

            @Override
            public String ejecutarMP(String input) {
                Dialog dialogHalCheker = new factory.factoria.HaltChekerDialog();
                maquinaPrincipalComposite.addMaquina(dialogHalCheker);
                String outputHC = maquinaPrincipalComposite.ejecutarMP(input);
                return outputHC;
            }
}
