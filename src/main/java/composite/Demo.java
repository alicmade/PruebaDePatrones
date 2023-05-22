package composite;

import factory.factoria.Dialog;

public class Demo {
    public static void main(String[] args) {
        Dialog dialog;
        MaquinaCompleta maquinaPrincipalComposite = new MaquinaCompleta();
        dialog = new factory.factoria.ImpresoraDialog();
        maquinaPrincipalComposite.addMaquina(dialog);
        dialog = new factory.factoria.HaltChekerDialog();
        maquinaPrincipalComposite.addMaquina(dialog);
        dialog = new factory.factoria.NegatorDialog();
        maquinaPrincipalComposite.addMaquina(dialog);
        maquinaPrincipalComposite.ejecutarMP("Hola mundo");

    }
}
