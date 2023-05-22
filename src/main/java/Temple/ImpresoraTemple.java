package Temple;

import composite.MaquinaCompleta;
import factory.factoria.Dialog;

public class ImpresoraTemple extends MaquinaPrincipal {

        public ImpresoraTemple() {
            super();
        }

        @Override
        public String ejecutarMP(String input) {
            Dialog dialogImpresora = new factory.factoria.ImpresoraDialog();
            maquinaPrincipalComposite.addMaquina(dialogImpresora);
            String outputImpresora = maquinaPrincipalComposite.ejecutarMP(input);
            //System.out.println("El resultado es: " + input);
            return outputImpresora;
        }
}
