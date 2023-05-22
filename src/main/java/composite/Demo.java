package composite;

import factory.factoria.Dialog;

public class Demo {
    public static void main(String[] args) {

        MaquinaCompleta maquinaPrincipalComposite = new MaquinaCompleta();
        Dialog dialogImpresora = new factory.factoria.ImpresoraDialog();
        maquinaPrincipalComposite.addMaquina(dialogImpresora);
        String outputImpresora = maquinaPrincipalComposite.ejecutarMP("lol");

        Dialog dialogHalCheker = new factory.factoria.HaltChekerDialog();
        maquinaPrincipalComposite.addMaquina(dialogHalCheker);
        maquinaPrincipalComposite.removeMaquina(dialogImpresora);
        maquinaPrincipalComposite.ejecutarMP(outputImpresora);

        Dialog dialogNegator = new factory.factoria.NegatorDialog();
        maquinaPrincipalComposite.addMaquina(dialogNegator);
        maquinaPrincipalComposite.removeMaquina(dialogHalCheker);
        maquinaPrincipalComposite.ejecutarMP(outputImpresora);



       // dialog = new factory.factoria.NegatorDialog();
       // maquinaPrincipalComposite.addMaquina(dialog);


    }
}
