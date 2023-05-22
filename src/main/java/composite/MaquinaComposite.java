package composite;

import factory.factoria.Dialog;
import factory.maquina.Button;

import java.util.ArrayList;
import java.util.List;

public class MaquinaComposite implements MaquinaPrincipalComposite{
    private List<Dialog> maquinaPrincipalComposites;

    public MaquinaComposite() {
        maquinaPrincipalComposites = new ArrayList<>();
    }

    public void addMaquina(Dialog maquinaPrincipalComposite) {
        maquinaPrincipalComposites.add(maquinaPrincipalComposite);
    }

    public void removeMaquina(MaquinaPrincipalComposite maquinaPrincipalComposite) {
        maquinaPrincipalComposites.remove(maquinaPrincipalComposite);
    }

    @Override
    public void ejecutarMP(String input) {
       for (Dialog maquinaPrincipalComposite : maquinaPrincipalComposites) {
           maquinaPrincipalComposite.ejecutarMaquina(input);
       }
    }
}
