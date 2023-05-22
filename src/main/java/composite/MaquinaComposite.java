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

    public void removeMaquina(Dialog maquinaPrincipalComposite) {
        maquinaPrincipalComposites.remove(maquinaPrincipalComposite);
    }

    @Override
    public String ejecutarMP(String input) {
       for (Dialog maquinaPrincipalComposite : maquinaPrincipalComposites) {
          String output = maquinaPrincipalComposite.ejecutarMaquina(input);
            input = output;
       }
       return input;
    }
}
